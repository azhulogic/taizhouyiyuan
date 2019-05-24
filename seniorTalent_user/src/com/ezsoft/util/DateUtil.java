package com.ezsoft.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author not attributable
 * @version 1.0
 */
public class DateUtil {
	static final String slashpattern = "yyyy/MM/dd";

	static final String noslashpattern = "yyyyMMdd";

	static final String yyyymmPattern = "yyyyMM";

	static final String excelPattern = "dd/MM/yyyy";

	public static final String DEFFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFFAULT_DATE_PATTERN = "yyyy-MM-dd";
	private static final Log log = LogFactory.getLog(DateUtil.class);

	private DateUtil() {
	}
	
	public static int getNl(String birthday,String pattern) {
		return getNl( string2Date(birthday, pattern));
	}
	public static int getNl(Date birthday) {
		
 
		Calendar cal = Calendar.getInstance();

		if (birthday == null)
			throw new RuntimeException("出生日期不能为null");

		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH) + 1;
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

		cal.setTime(birthday);
		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH) + 1;
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				// monthNow==monthBirth 
				if (dayOfMonthNow < dayOfMonthBirth) {
					age--;
				}
			} else {
				// monthNow>monthBirth 
				age--;
			}
		}
		return age;
	}

	/**
	 * output specify date format(yyyymm) by Integer type
	 * 
	 * @param date
	 *            Date
	 * @return Integer
	 */
	public static Integer getSpecifiedDateInNumberType(Date date) {
		SimpleDateFormat noslashdf = new SimpleDateFormat(noslashpattern);
		if (date == null) {
			return null;
		} else {
			return new Integer(noslashdf.format(date));
		}
	}

	/**
	 * output specify ROC date format(yyyymm) by Integer type
	 * 
	 * @param date
	 *            Date
	 * @return Integer
	 */
	public static Integer getSpecifiedDateInRocNumberType(Date date) {
		if (date == null) {
			return null;
		} else {
			SimpleDateFormat noslashdf = new SimpleDateFormat(noslashpattern);
			return Integer
					.valueOf(Integer.parseInt(noslashdf.format(date)) - 19110000);
		}
	}

	/**
	 * output specify time format(HHmmss) by Integer type
	 * 
	 * @param date
	 *            Date
	 * @return Integer
	 */
	public static Integer getSpecifiedTimeInNumberType(Date date) {
		if (date == null) {
			return null;
		} else {
			return new Integer(new SimpleDateFormat("HHmmss").format(date));
		}
	}

	/**
	 * Allocates a Date object and initializes it so that it represents the
	 * instant at the start of the second specified by the year, month, date
	 * 
	 * @param centuryYear
	 *            int
	 * @param date
	 *            int
	 * @param time
	 *            int
	 * @return Date
	 */
	public static Date parseNumberToDate(int centuryYear, int date, int time) {
		int entireDate = ((centuryYear + 19) * 1000000) + date;
		return DateUtil.parseEntireNumberToDate(entireDate, time);
	}

	/**
	 * 
	 * @param centuryYear
	 *            int
	 * @param date
	 *            int
	 * @return Date
	 */
	public static Date parseNumberToDate(int centuryYear, int date) {
		return parseNumberToDate(centuryYear, date, 0);
	}

	/**
	 * 
	 * @param entireDate
	 *            int
	 * @param time
	 *            int
	 * @return Date
	 */
	public static Date parseEntireNumberToDate(int entireDate, int time) {
		int year = (int) (entireDate / 10000);
		int month = (int) ((entireDate - year * 10000) / 100);
		int day = entireDate - (year * 10000) - (month * 100);
		int hour = 0;
		int minute = 0;
		int second = 0;
		if (time != 0) {
			hour = (int) (time / 10000);
			minute = (int) ((time - hour * 10000) / 100);
			second = time - (hour * 10000) - (minute * 100);
		}
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, day, hour, minute, second);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 
	 * @param rocYr
	 *            String
	 * @return Date
	 */
	public static Date parseROCYNumberToDate(String rocYr) {
		if (rocYr == null || rocYr.equals("")) {
			return null;
		} else {
			if (rocYr.indexOf('/') == -1) {
				String year = "";
				String monthDate = "";
				if (rocYr.length() > 6) {
					year = rocYr.substring(0, 3);
					monthDate = (rocYr).substring(3, rocYr.length());
				} else {
					year = rocYr.substring(0, 2);
					monthDate = (rocYr).substring(2, rocYr.length());
				}

				int adYear = Integer.parseInt(year) + 1911;
				String date = String.valueOf(adYear) + monthDate;
				return parseEntireNumberToDate(Integer.parseInt(date));
			} else {
				int pos = rocYr.indexOf('/');
				String year = rocYr.substring(0, pos);
				String monthDate = (rocYr).substring(pos + 1, rocYr.length());
				pos = monthDate.indexOf('/');
				String date = null;
				int adYear = Integer.parseInt(year) + 1911;
				if (pos != -1) {
					String month = monthDate.substring(0, pos);
					String day = monthDate.substring(pos + 1, monthDate
							.length());
					date = String.valueOf(adYear) + month + day;
				} else {
					date = String.valueOf(adYear) + monthDate;
				}
				return parseEntireNumberToDate(Integer.parseInt(date));
			}
		}
	}

	/**
	 * 
	 * @param date
	 *            Date
	 * @return String
	 */
	public static String parseDateToROCString(Date date) {
		return parseDateToROCString(date, "YYYY/MM/DD");
	}

	/**
	 * 
	 * @param date
	 *            Date
	 * @param pattern
	 *            String
	 * @return String
	 */
	public static String parseDateToROCString(Date date, String pattern) {
		if (date == null) {
			return null;
		} else if (pattern.equals("YYYY/MM/DD")) {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear) + "/"
					+ roc.substring(4, 6) + "/" + roc.substring(6, 8);
			return rocDate;
		} else if (pattern.equals("YYYY-MM-DD")) {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear) + "-"
					+ roc.substring(4, 6) + "-" + roc.substring(6, 8);
			return rocDate;
		} else if (pattern.equals("YYYYMMDD")) {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear) + roc.substring(4, 6)
					+ roc.substring(6, 8);
			return rocDate;
		} else if (pattern.equals("YYYYMM")) {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear) + roc.substring(4, 6);
			return rocDate;
		} else if (pattern.equals("YYYY/MM")) {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear) + "/"
					+ roc.substring(4, 6);
			return rocDate;
		} else if (pattern.equals("YYYY")) {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear);
			return rocDate;
		}

		else {
			return "No Such Date Pattern";
		}

	}

	/**
	 * 
	 * @param date
	 *            String
	 * @return String
	 */
	public static String parseStringToROCString(String date) {
		String dateArray[] = date.split("/");
		return Integer.parseInt(dateArray[0]) - 1911 + "/" + dateArray[1] + "/"
				+ dateArray[2];
	}

	/**
	 * 
	 * @param myDate
	 *            Date
	 * @return String
	 */
	public static String getYYYYMMString(Date myDate) {
		SimpleDateFormat yyyymmPatternSDF = new SimpleDateFormat(yyyymmPattern);
		return yyyymmPatternSDF.format(myDate);
	}

	/**
	 * 
	 * @param myDate
	 *            Date
	 * @return String
	 */
	public static String getYYYYMMDDString(Date myDate) {
		SimpleDateFormat noslashdf = new SimpleDateFormat(noslashpattern);
		return noslashdf.format(myDate);
	}

	public static String getDateString(Date myDate, String format) {
		if (null == myDate)
			return "";
		SimpleDateFormat slashdf = new SimpleDateFormat(format);
		return slashdf.format(myDate);
	}

	/**
	 * 
	 * @param date_1
	 *            Date
	 * @param date_2
	 *            Date
	 * @return int
	 */
	public static int compareYYYYMM(Date date_1, Date date_2) {
		String str_1 = getYYYYMMString(date_1);
		String str_2 = getYYYYMMString(date_2);
		if (Integer.parseInt(str_1) > Integer.parseInt(str_2)) {
			return 1;
		} else if (Integer.parseInt(str_1) < Integer.parseInt(str_2)) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param entireDate
	 *            int
	 * @return Date
	 */
	public static Date parseEntireNumberToDate(int entireDate) {
		if (entireDate == 0) {
			return null;
		}
		return DateUtil.parseEntireNumberToDate(entireDate, 0);
	}

	/**
	 * parsing format string(yyyyMM) to Date object
	 * 
	 * @return Date
	 * @param date
	 *            String
	 */
	public static Date parseStringToDate(String date) {

		if (Integer.parseInt(date.substring(0, 4)) > 1900) {
			ParsePosition pos = new ParsePosition(0);
			SimpleDateFormat slashdf = new SimpleDateFormat(slashpattern);
			Date result = slashdf.parse(date, pos);
			return result;
		} else {
			ParsePosition pos = new ParsePosition(0);
			SimpleDateFormat noslashdf = new SimpleDateFormat(noslashpattern);
			Date result = noslashdf.parse(date, pos);
			return result;
		}
	}

	public static java.sql.Date string2Date(String source, String pattern) {
		SimpleDateFormat simpledf = new SimpleDateFormat(pattern);
		java.util.Date uDate = null;
		try {
			uDate = simpledf.parse(source);
			long x = uDate.getTime();
			java.sql.Date dateFormat = new java.sql.Date(x);
			return dateFormat;
		} catch (ParseException ex) {
			log.error("exception occured", ex);
			return null;
		}
	}

	/**
	 * parseDateToFormatString get java.sql.Date object, transfer to sql command
	 * to_date require format string
	 * 
	 * @param sqldate
	 *            Date
	 * @return String
	 */
	public static String parseDateToFormatString(Date sqldate) {
		StringBuffer dateformated = new StringBuffer();
		Calendar cal = Calendar.getInstance();
		java.util.Date date = new java.util.Date(sqldate.getTime());
		cal.setTime(date);
		dateformated.append(cal.get(Calendar.YEAR));
		dateformated.append("/");
		dateformated.append(cal.get(Calendar.MONTH) + 1);
		dateformated.append("/");
		dateformated.append(cal.get(Calendar.DAY_OF_MONTH));

		return dateformated.toString();

	}

	/*
	 * Get Today Date
	 * 
	 * @return Date
	 */
	public static Date getToday() {
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}

	/**
	 * 
	 * @param date
	 *            Date
	 * @param pattern
	 *            String
	 * @return String
	 */
	public static String date2String(java.util.Date date, String pattern) {
		if (date == null) {
			return "";
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.format(date);
		}
	}

	/**
	 * 
	 * @return String
	 */
	public static String getRocDatetimeString() {
		String pattern = "MMddHHmmss";
		Calendar cal = Calendar.getInstance();
		int bcyear = cal.get(Calendar.YEAR);
		String rocyear = String.valueOf(bcyear - 1911);
		return rocyear
				+ date2String(new Date(System.currentTimeMillis()), pattern);
	}

	/**
	 * Return ROC Date Time
	 * 
	 * @param date
	 *            Date
	 * @param pattern
	 *            String
	 * @return String
	 */
	public static String getRocDate(Date date) {
		return getRocDate(date, "/");
	}

	/**
	 * 
	 * @param date
	 *            Date
	 * @param spilitSign
	 *            String
	 * @return String
	 */
	public static String getRocDate(Date date, String spilitSign) {
		if (spilitSign == null) {
			spilitSign = "";
		}
		if (date == null) {
			return null;
		} else {
			String roc = getYYYYMMDDString(date);
			String year = roc.substring(0, 4);
			int rocYear = Integer.parseInt(year) - 1911;
			String rocDate = String.valueOf(rocYear) + spilitSign
					+ roc.substring(4, 6) + spilitSign + roc.substring(6, 8);
			return rocDate;
		}
	}

	/**
	 * 
	 * @param yyyyww
	 *            String
	 * @return String
	 */
	public static String getWeekFormat(String yyyyww) {
		String returnStr = "";
		if (yyyyww != null) {
			int yyyywwInt = Integer.parseInt(yyyyww);
			String year = String.valueOf((int) yyyywwInt / 100);
			String ww = String.valueOf((int) yyyywwInt % 100);
			returnStr = year + "W" + ww;
		}
		return returnStr;
	}

	/**
	 * 轉換固定格式的日期字串為 java.util.Date
	 * 
	 * @param date
	 *            日期字串
	 * @param format
	 *            格式
	 * @return 傳回型態為 java.util.Date 的日期
	 * @throws ParseException
	 *             若格式錯誤則會丟出該例外
	 * @throws ClassCaseException
	 *             若格式錯誤則會丟出該例外
	 * @since JDK1.0
	 */
	public static Date parseDateString(String date, String format) {
		Date tempDate = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(format);

			// Parse the string into a Date.
			ParsePosition pos = new java.text.ParsePosition(0);
			tempDate = formatter.parse(date, pos);

			// Verify that the passed-in date is valid
			if (tempDate == null) {
				int ei = pos.getErrorIndex();
				throw new ParseException(
						"Not a valid date: illegal char found \""
								+ date.substring(ei, ei + 1) + "\"...", ei);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempDate;
	}

	/**
	 * 取得該年特定一週的第一天
	 * 
	 * @param year
	 *            哪一年
	 * @param week
	 *            該年第幾週
	 * @return 傳回型態為 java.util.Date 的日期
	 */
	public static Date getFirstDayOfTheWeek(int year, int week) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.WEEK_OF_YEAR, week);
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		return c.getTime();
	}

	/**
	 * 取得該年特定一週的最後一天
	 * 
	 * @param year
	 *            哪一年
	 * @param week
	 *            該年第幾週
	 * @return 傳回型態為 java.util.Date 的日期
	 */
	public static Date getLastDayOfTheWeek(int year, int week) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.WEEK_OF_YEAR, week);
		c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		return c.getTime();
	}

	/**
	 * 取得該年特定一月的最後一天
	 * 
	 * @param year
	 *            哪一年
	 * @param week
	 *            該年第幾月
	 * @return 傳回型態為 java.util.Date 的日期
	 */
	public static Date getLastDayOfTheMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		// 要-1因為calendar的月份是從0開始
		c.set(year, month - 1, 1);
		// 把日期設為最後一天
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}

	/**
	 * 取得該年特定一月的第一天
	 * 
	 * @param year
	 *            哪一年
	 * @param week
	 *            該年第幾月
	 * @return 傳回型態為 java.util.Date 的日期
	 */
	public static Date getFirstDayOfTheMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		// 要-1因為calendar的月份是從0開始
		c.set(year, month - 1, 1);

		return c.getTime();
	}

	// IM要使用的
	public static boolean validatedPoOrderYear(Date date) {
		int thisyear = Calendar.getInstance().get(Calendar.YEAR);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int dateyear = cal.get(Calendar.YEAR);
		boolean isValidOrderDate = (thisyear + 1 >= dateyear)
				&& (thisyear - 3 <= dateyear);

		return isValidOrderDate;
	}

	public static Date getDateBefore(Date d, int day) {  
        Calendar now = Calendar.getInstance();  
        now.setTime(d);  
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);  
        return now.getTime();  
    }    
	public static String getDateBeforeStr(Date d, int day) {  
        Calendar now = Calendar.getInstance();  
        now.setTime(d);  
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);  
        return date2String(now.getTime(), "yyyy-MM-dd");  
    }    
	
//	public static String dateForwardNDay(String dateStr, int nday,String pat) {
//		int year =0, month =0, day =0;
//		if("yyyymmdd".equals(pat)){
//			 year = Integer.parseInt(dateStr.substring(0, 4));
//			 month = Integer.parseInt(dateStr.substring(4, 6));
//			 day = Integer.parseInt(dateStr.substring(6, 8));
//		}else if("yyyy-mm-dd".equals(pat)){
//			  year = Integer.parseInt(dateStr.substring(0, 4));
//			  month = Integer.parseInt(dateStr.substring(5, 7));
//			  day = Integer.parseInt(dateStr.substring(8, 10)); 
//		} else{
//			return "0";
//		}
//		return dateForwardNDay(  year,month,day,   nday);
//	}
	
	/**
	 * 根据输入日期串和向前的天数获取向前天数的日期
	 * 
	 * @param dateStr
	 *            日期串yyyymmdd
	 * @param nday
	 *            向前的天数 必须为正整数且不能大于138000
	 * @return n天后的日期串
	 */
	public static String dateForwardNDay(String dateStr, int nday,String pat) {
		int year =0, month =0, day =0;
		if("yyyyMMdd".equals(pat)){
			 year = Integer.parseInt(dateStr.substring(0, 4));
			 month = Integer.parseInt(dateStr.substring(4, 6));
			 day = Integer.parseInt(dateStr.substring(6, 8));
		}else if("yyyy-MM-dd".equals(pat)){
			  year = Integer.parseInt(dateStr.substring(0, 4));
			  month = Integer.parseInt(dateStr.substring(5, 7));
			  day = Integer.parseInt(dateStr.substring(8, 10)); 
		} else{
			return "0";
		}
		if (nday < 0)
			return year+""+month+""+day;
		day += nday;

		if (day < 28)
			return dateStr(year, month, day);
		int left = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			if (day > 31) {
				month += 1;
				left = day - 32;
				day = 1;

				if (month > 12) {
					year++;
					month = 1;
				}

				if (left > 0)
					return dateForwardNDay(dateStr(year, month, day), left,pat);
			}
			break;
		case 2:
			if (DateUtil.IsLeapYear(year)) {
				if (day > 29) {
					month += 1;
					left = day - 30;
					day = 1;

					if (left > 0)
						return dateForwardNDay(dateStr(year, month, day), left,pat);
				}
			} else {
				if (day > 28) {
					month += 1;
					left = day - 29;
					day = 1;

					if (left > 0)
						return dateForwardNDay(dateStr(year, month, day), left,pat);
				}
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30) {
				month += 1;
				left = day - 31;
				day = 1;

				if (left > 0) {
					return dateForwardNDay(dateStr(year, month, day), left,pat);

				}
			}
			break;
		}
		return dateStr(year, month, day);

	}

	
	/**
	 * 根据输入日期串和向前的天数获取向前天数的日期
	 * 
	 * @param dateStr
	 *            日期串yyyymmdd
	 * @param nday
	 *            向前的天数 必须为正整数且不能大于138000
	 * @return n天后的日期串
	 */
	public static String dateForwardNDay(Date dateStr, int nday) {
		return dateForwardNDay( date2String(dateStr, "yyyyMMdd"),nday,"yyyyMMdd");

	}

	public static String dateForwardNDay(Date dateStr, int nday,String fmt) {
		return dateForwardNDay( date2String(dateStr, fmt),nday,fmt);

	}
	
	/**
	 * 日期字符串yyyymmdd
	 * 
	 * @param year
	 *            年
	 * @param month
	 *            月
	 * @param day
	 *            日
	 * @return 日期串
	 */
	public static String dateStr(int year, int month, int day) {
		StringBuffer date = new StringBuffer();
		date.append(year).append(
				String.valueOf(month).length() > 1 ? String.valueOf(month)
						: ("0" + month)).append(
				String.valueOf(day).length() > 1 ? String.valueOf(day)
						: ("0" + day));
		return date.toString();
	}

	/**
	 * 判断年份是否为闰年
	 * 
	 * @param year
	 *            年份
	 * @return true 闰年， false 非闰年
	 */
	public static boolean IsLeapYear(int year) {
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	public static String compositeStartDateTimeString(String year,
			String month, String day) {

		return date2String(genDate(year, month, day, false),
				"yyyy/MM/dd HH:mm:ss");
	}

	public static String compositeEndDateTimeString(String year, String month,
			String day) {
		return date2String(genDate(year, month, day, true),
				"yyyy/MM/dd HH:mm:ss");
	}

	public static java.util.Date genDate(String year, String month, String day,
			boolean end) {
		return genDate(Integer.parseInt(year), Integer.parseInt(month), Integer
				.parseInt(day), end);

	}

	public static java.util.Date genDate(int year, int month, int date,
			boolean end) {
		int hour = 0, min = 0, sec = 0;

		if (end) {
			hour = 23;
			min = 59;
			sec = 59;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date, hour, min, sec);

		return calendar.getTime();
	}

	// public static String Datetime2String(java.util.Date date){
	// throw new NotImplementedException();
	// }
	public static String date2String(java.util.Date date) {
		return getDateString(date, DEFFAULT_DATE_PATTERN);
	}

	public static String datetime2String(java.util.Date date) {
		return getDateString(date, DEFFAULT_DATETIME_PATTERN);
	}

	public static Date getBeforDate(Date rightDate, int beforN) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(rightDate);
		calendar.add(Calendar.DAY_OF_MONTH, beforN);
		Date date2 = calendar.getTime();
		return date2;
	}
	
	public static void setTime(HttpServletRequest request){
		LinkedList<String> hourList = new LinkedList<String>(){{ 
			add("00");add("01");add("02");add("03");add("04");add("05");
			add("06");add("07");add("08");add("09");add("10");add(
					"11");add("12");add("13");add("14");add("15");add(
					"16");add("17");add("18");add("19");add("20");add(
					"21");add("22");add("23");
		}};
		
		LinkedList<String> minList = new LinkedList<String>(){{ 
			add("00");add("01");add("02");add("03");add("04");add("05");
			add("06");add("07");add("08");add("09");add("10");
		}};
		for (int i = 11; i < 60; i++) {
			minList.add(i+"");
		}
		request.setAttribute("hourList", hourList);
		request.setAttribute("minList", minList);
	}

	/**
	 * @param ts
	 * @return
	 */
	public static Date getNextMonthFirstDay(Date ts) {
		Calendar c=Calendar.getInstance();
		c.setTime(ts); 
	    System.out.println(ts.getTime());
	    c.set(Calendar.MONTH, c.get(Calendar.MONTH)+1);
	    c.set(Calendar.DAY_OF_MONTH, 1);
	    System.out.println("下个月的第一天: " + c.getTime()); 
	     
		return c.getTime();
	}

	 
	 /**
     * XMLGregorianCalendar 转换为Date类型 
    */
    public static Date XMLGregorianCalendar2Date(XMLGregorianCalendar dateType) {

       int year = dateType.getYear();
        int month = dateType.getMonth();
        int day = dateType.getDay();
        int hour = dateType.getHour();
        int minute = dateType.getMinute();
        int second = dateType.getSecond();
        
       Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute, second);
        Date date = calendar.getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String sdate = sdf.format(date);
//        System.out.println(sdate);
        return date;
    } 
    
    /**
     * XMLGregorianCalendar 转换为Date类型 
    */
    public static XMLGregorianCalendar Date2XMLGregorianCalendar(Date date) {
    
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        javax.xml.datatype.DatatypeFactory dtf = null;
        
        try {
			dtf = javax.xml.datatype.DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
       
        XMLGregorianCalendar dateArgs =  dtf.newXMLGregorianCalendar(
        calendar.get(calendar.YEAR),
        calendar.get(calendar.MONTH)+1,
        calendar.get(calendar.DAY_OF_MONTH),
        calendar.get(calendar.HOUR),
        calendar.get(calendar.MINUTE),
        calendar.get(calendar.SECOND),
        calendar.get(calendar.MILLISECOND),
        calendar.get(calendar.ZONE_OFFSET)/(1000*60));
 

        return dateArgs;
    } 
    
    
    
     public static  int[]  getDateLength(Date  fromDate, Date  toDate)  { 
    	 try {
    		 Calendar  c1  =  Calendar.getInstance(); 
        	 c1.setTime(fromDate);
        	 
        	 Calendar  c2  =  Calendar.getInstance(); 
        	 c2.setTime(toDate);
//              
             int[]  p1  =  {  c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)  }; 
             int[]  p2  =  {  c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)  }; 
//             int[] returnd = {0,0,0};
//             int mils = (int)  ((c2.getTimeInMillis()  -  c1.getTimeInMillis())  /  (24  *  3600  *  1000));
//             if(mils/365 ){
//            	 
//             }
             
             
             return  new  int[]  {  p2[0]  -  p1[0], 
            		 p2[0]  *  12  +  p2[1]  -  p1[0]  *  12  -  p1[1], 
            		 (int)  ((c2.getTimeInMillis()  -  c1.getTimeInMillis())  /  (24  *  3600  *  1000))  }; 
             
//             return  new  int[]  {  p2[0]  -  p1[0], 
//            		   p2[1]  -   p1[1], 
//            		   p2[2]  -   p1[2]}; 
         
		} catch (Exception e) {
			return new  int[]  { 0,0,0};
		}
    	
     }

	/**
	 * @param date
	 * @return
	 */
	public static boolean isZM(Date date) {
		// DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		// String bDate = "2011-12-31";
		// Date bdate = format1.parse(bDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return true;
		}
		return false;
	}
	    
	  /** 
	   * 得到几天后的时间 
	   * @param d 
	   * @param day 
	   * @return 
	   */  
	  public static Date getDateAfter(Date d,int day){  
	   Calendar now =Calendar.getInstance();  
	   now.setTime(d);  
	   now.set(Calendar.DATE,now.get(Calendar.DATE)+day);  
	   return now.getTime();  
	  }

	/**
	  /**
     * 1h  一小时
     * 3d  3天
     * 4m  4月
     * 
     * 
     
	 */
	public static Object getYyrq(Date date, String p) {
		Calendar now =Calendar.getInstance();  
  	   now.setTime(date);  
        if (p.endsWith("s"))
        { 
     	   now.set(Calendar.SECOND,now.get(Calendar.SECOND)+Integer.valueOf(  p.replace("s", "")));
     	 
        }
        else if (p.endsWith("h")) { 
        	 now.set(Calendar.HOUR,now.get(Calendar.HOUR)+Integer.valueOf(  p.replace("h", "")));
            
        }else if (p.endsWith("d")) { 
        	 now.set(Calendar.DAY_OF_MONTH,now.get(Calendar.DAY_OF_MONTH)+Integer.valueOf(  p.replace("d", "")));
        }
        else if (p.endsWith("m"))
        {
        	now.set(Calendar.MONTH,now.get(Calendar.MONTH)+Integer.valueOf(  p.replace("m", "")));
        }
        else if (p.endsWith("w"))
        {
        	now.set(Calendar.WEEK_OF_MONTH,now.get(Calendar.WEEK_OF_MONTH)+Integer.valueOf( p.replace("w", "")));
        } 
        return now.getTime();
    }
	
	public static Date getDate(){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	public  static  void  main(String[]  args)  { 
		System.out.println(getDate());
    } 
}
