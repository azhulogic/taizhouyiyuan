package com.ezsoft.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import com.enzemed.ios.validate.Validate;
import com.enzemed.ios.validate.ValidateSoap;
import com.ezsoft.domain.HealthInfo;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.prmInterfaceHIS2008.Service1;
import com.ezsoft.prmInterfaceHIS2008.Service1Soap;
import com.ezsoft.test.Test2;

public class CommonUtil {
	private static Logger logger = LogManager.getLogger(CommonUtil.class);
	public static String getProperty(String key){
		String value = "";
		try {
			Properties pps = new Properties();
	        InputStream in=Test2.class.getClassLoader().getResourceAsStream("default.properties");
			pps.load(in);
			value = pps.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static String[] getDateStrArray(){
		int days = 8;
		String[] dateStrArray = new String[days];
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		String dateStr;
		for(int i = 0; i < days; i++){
			dateStr = sdf.format(cal.getTime());
			dateStrArray[i] = dateStr;	
			cal.add(Calendar.DATE, 1);
		}
		return dateStrArray;
	}

	public static SqlSessionFactory getSessionFactory(String enviroment){  
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,enviroment);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
	/**
	 * 
	 * @param dir 保存的文件夹路径
	 * @throws Exception
	 */
	public static void blobToJpg(String dir, String yq) throws Exception{
		SqlSessionFactory sqlSessionFactory = CommonUtil.getSessionFactory("bsrun_" + yq);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			//保存图片 返回URL地址
			List<Map<String,Object>> ygPhotoList = sqlSession.selectList("com.ezsoft.mapper.selectYgPhotoList");
			for(int i = 0; i < ygPhotoList.size(); i++){
				Map<String,Object> ygPhotoMap = ygPhotoList.get(i);
				String ygdm = ygPhotoMap.get("YGDM").toString();
				Blob imgBlob = (Blob)ygPhotoMap.get("PHOTO");
				if(imgBlob != null){
					bis = new BufferedInputStream(imgBlob.getBinaryStream());
					File file = new File(dir);
					if(!file.exists()){
					 file.mkdir();
					}
					String ygPhotoPath = dir+ygdm+".jpg";
					file = new File(ygPhotoPath);
					if(!file.exists()){
					 file.createNewFile();
					}
					bos = new BufferedOutputStream(new FileOutputStream(file));
					byte[] buf = new byte[1024];
					int n =-1;
					while((n=bis.read(buf))!=-1){
					 bos.write(buf);
					}
					bos.flush();
					bos.close();
					bis.close();	
				}
						
			}
		}  finally {
		  sqlSession.close();
		}
		
	}
	/**
	 * JSON 转 Map
	 * @param json
	 * @return
	 */
	public static Map<String,String> jsonToMap(JSONObject json){
		HashMap<String, String> data = new HashMap<String, String>();  
		Iterator it = json.keys();  
        // 遍历jsonObject数据，添加到Map对象  
        while (it.hasNext())  
        {  
            String key = String.valueOf(it.next());  
            String value = String.valueOf(json.get(key));  
            data.put(key, value);  
        }  
        return data;
            //  {name=小明, age=10} 
	}
	
	public static int getAge(Calendar calBirth){
		int age = 0;
		Calendar calNow = Calendar.getInstance();
		if(calNow.getTimeInMillis() > calBirth.getTimeInMillis()){
			age = calNow.get(Calendar.YEAR) - calBirth.get(Calendar.YEAR);
			int calNowMonth = calNow.get(Calendar.MONTH);
			int calNowDay = calNow.get(Calendar.DATE);
			int calBirthMonth = calBirth.get(Calendar.MONTH);
			int calBirthDay = calBirth.get(Calendar.DATE);
			if(calNowMonth < calBirthMonth || (calNowMonth == calBirthMonth && calNowDay < calBirthDay)){
				age--;
			}
		}
		
		return age;
	}
	
	/**
	 * 发短信
	 * @return 1成功 0失败
	 */
	public static int sendMsg(String phone, String content){
		URL url = null;
		try {
			url = new URL("http://172.18.18.38/prmInterfaceHIS2008/prmInterfaceHIS2008.asmx");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Service1 service1 = new Service1(url, new QName("http://tempuri.org/", "Service1"));
		Service1Soap service1Soap = service1.getService1Soap();
		String returnStr = service1Soap.sentMsg(phone, content);
		if("1".equals(returnStr)){
			return 1;
		}else{
			return 0;
		}
	}
	
	/**
	 * APP推送
	 * @return 1成功 0失败
	 */
	public static int sendAppMsg(String phone, String content){
		return 1;
	}
	
	/**
	 * md5加密
	 */
	public static String getMd5Key(String input){
		Validate validate = new Validate();
		ValidateSoap getValidateSoap = validate.getValidateSoap();
		String md5Key =  getValidateSoap.getKey(input);
		return md5Key;
	}
	
	/**
	 * md5验证
	 */
	public static int getMd5Vaild(String id, String key){
		Validate validate = new Validate();
		ValidateSoap getValidateSoap = validate.getValidateSoap();
		String md5Vaild = getValidateSoap.getVaild(id, key);
		if("1".equals(md5Vaild)){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static List<String> getAbnormalArray(String sfzh){
		List<String> abnormalArray = new ArrayList<String>();
		SqlSession sqlSession = MybatisUtils.openSession();
		try{
			SeniorTalent seniorTalent =  sqlSession.selectOne("com.ezsoft.mapper.selectSeniorTalent_sfzh2",sfzh);
			double height = seniorTalent.getHeight();
			double weight = seniorTalent.getWeight();
			double BMI = weight/(height * height);
			if(BMI < 18.5){
				abnormalArray.add("消瘦");
			}else if(BMI >= 24 && BMI <= 27.9){
				abnormalArray.add("超重");;
			}else if(BMI >= 28){
				abnormalArray.add("肥胖");
			}
			List<HealthInfo> healthInfoList = sqlSession.selectList("com.ezsoft.mapper.selectSeniorTalent_healthInfoList", sfzh);
			//膳食结构不合理判断
			boolean isSfjgNotNornal = false;
			//喝水太少
			boolean isDrinkWaterLess = false;
			//不良饮食习惯
			boolean isEatingHabitsBad = false;
			//久坐不动、极度缺乏体育锻炼
			boolean isSittingDlBad = false;
			boolean isSittingDlBad1 = false;
			boolean isSittingDlBad2 = false;
			//吸烟
			boolean isSmokeBad = false;
			//酗酒
			boolean isDrinkBad = false;
			//睡眠严重不足、熬夜
			boolean isSleepBad = false;
			//精神压力大
			boolean isSpiritBad = false;
			for(int i = 0; i < healthInfoList.size(); i++){
				HealthInfo healthInfo = healthInfoList.get(i);
				int xmmxNo = healthInfo.getXmmxNo();
				String value = healthInfo.getValue();
				String extraValue = healthInfo.getExtraValue();
				if(((xmmxNo >= 37 && xmmxNo <= 46) && ("不足".equals(value) || "超量".equals(value)))
						){
					isSfjgNotNornal = true;
				}
				if((xmmxNo == 47 && ("不足".equals(value)))
						){
					isDrinkWaterLess = true;
				}
				if((xmmxNo == 15 && ("没有".equals(value) || "1~2天".equals(value)))
						||(xmmxNo == 16 && ("3~5天".equals(value) || "5~7天".equals(value)))
						||(xmmxNo == 17 && (value.contains("甜") || value.contains("辣") || value.contains("烫") || value.contains("煎炸") || value.contains("油腻") || value.contains("腌熏")))
						){
					isEatingHabitsBad = true;
				}
				if((xmmxNo == 19 && ("≥8小时".equals(value))) 
						){
					isSittingDlBad1 = true;
				}
				if((xmmxNo == 21 && ("不锻炼".equals(value) || "＜1~2小时".equals(value)))
						){
					isSittingDlBad2 = true;
				}
				isSittingDlBad = isSittingDlBad1 && isSittingDlBad2;
				if((xmmxNo == 23 && ("经常".equals(value)))
						){
					isSmokeBad = true;
				}
				if(xmmxNo == 29 && ("4~8两".equals(value)) || ("≥8两".equals(value))
						){
					isDrinkBad = true;
				}
				if(xmmxNo == 34 && ("严重不足".equals(value))
						){
					isSleepBad = true;
				}
				if(xmmxNo == 33 && ("很大".equals(value))
						){
					isSpiritBad = true;
				}
				/*if((xmmxNo == 35 && ("3年以上".equals(value)))
						||(xmmxNo == 1 && (!StringUtils.isBlank(value)))
						){
					isDiseaseBad = true;
				}*/
				if(xmmxNo == 1 && !StringUtils.isBlank(value) && !"无".equals(value)){
					String[] diseaseArray = value.split(",");
					for(String disease : diseaseArray){
						abnormalArray.add(disease);
					}
				}
				if(xmmxNo == 1 && !StringUtils.isBlank(extraValue)){
					String[] diseaseArray = extraValue.split(",");
					for(String disease : diseaseArray){
						abnormalArray.add(disease);
					}
				}
			}
			if(isSfjgNotNornal){
				abnormalArray.add("膳食结构不合理");
			}
			if(isDrinkWaterLess){
				abnormalArray.add("喝水太少");
			}
			if(isEatingHabitsBad){
				abnormalArray.add("不良饮食习惯");
			}
			if(isSittingDlBad){
				abnormalArray.add("久坐不动、极度缺乏体育锻炼");
			}
			if(isSmokeBad){
				abnormalArray.add("吸烟");
			}
			if(isDrinkBad){
				abnormalArray.add("酗酒");
			}
			if(isSleepBad){
				abnormalArray.add("睡眠严重不足、熬夜");
			}
			if(isSpiritBad){
				abnormalArray.add("精神压力大");
			}
		}finally {
			sqlSession.close();
		}
		return abnormalArray;
	}
	
	public static String list2Str(List<String> strArray){
		String str = "";
		for(int i = 0; i < strArray.size(); i++){
			if(i == 0){
				str += strArray.get(i);
			}else{
				str += ("，" + strArray.get(i));
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		List<String> strArray = new ArrayList<String>();
		strArray.add("22");
		strArray.add("33");
		strArray.add("解决");
		System.out.println(list2Str(strArray));
	}
}
