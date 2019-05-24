package com.ezsoft.domain;

import java.sql.Timestamp;
import java.util.Date;

public class SeniorTalent {
    private Long jlxh;

    private String name;

    private String sfzh;

    private Integer brxb;

    private Timestamp csny;

    private String lxdh;

    private String lxdz;

    private Integer zfpb;

    private String mzhm;

    private String zyhm;

    private String disease;

    private String brid;

    private Date createTime;

    private String createYgdm;

    private double height;
    
	private double weight;

    private Integer searchBz;

    private Integer sfNo;

    private Integer orderNo;

    private String gms;
    
    private String extraGms;

    private String education;

    private String unit;

    private String bloodType;

    private String marriage;

    private String profession;
    
    private int age;
    
    private String brxbShow;
    
    private String abnormalStr;
    
    private Integer topBloodPressure;
    
    private Integer downBloodPressure;
    
    private Integer bloodSugar;

	public Long getJlxh() {
		return jlxh;
	}

	public void setJlxh(Long jlxh) {
		this.jlxh = jlxh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public Integer getBrxb() {
		return brxb;
	}

	public void setBrxb(Integer brxb) {
		this.brxb = brxb;
	}

	public Timestamp getCsny() {
		return csny;
	}

	public void setCsny(Timestamp csny) {
		this.csny = csny;
	}

	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getLxdz() {
		return lxdz;
	}

	public void setLxdz(String lxdz) {
		this.lxdz = lxdz;
	}

	public Integer getZfpb() {
		return zfpb;
	}

	public void setZfpb(Integer zfpb) {
		this.zfpb = zfpb;
	}

	public String getMzhm() {
		return mzhm;
	}

	public void setMzhm(String mzhm) {
		this.mzhm = mzhm;
	}

	public String getZyhm() {
		return zyhm;
	}

	public void setZyhm(String zyhm) {
		this.zyhm = zyhm;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getBrid() {
		return brid;
	}

	public void setBrid(String brid) {
		this.brid = brid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateYgdm() {
		return createYgdm;
	}

	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Integer getSearchBz() {
		return searchBz;
	}

	public void setSearchBz(Integer searchBz) {
		this.searchBz = searchBz;
	}

	public Integer getSfNo() {
		return sfNo;
	}

	public void setSfNo(Integer sfNo) {
		this.sfNo = sfNo;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getGms() {
		return gms;
	}

	public void setGms(String gms) {
		this.gms = gms;
	}

	public String getExtraGms() {
		return extraGms;
	}

	public void setExtraGms(String extraGms) {
		this.extraGms = extraGms;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBrxbShow() {
		return brxbShow;
	}

	public void setBrxbShow(String brxbShow) {
		this.brxbShow = brxbShow;
	}

	public String getAbnormalStr() {
		return abnormalStr;
	}

	public void setAbnormalStr(String abnormalStr) {
		this.abnormalStr = abnormalStr;
	}

	public Integer getTopBloodPressure() {
		return topBloodPressure;
	}

	public void setTopBloodPressure(Integer topBloodPressure) {
		this.topBloodPressure = topBloodPressure;
	}

	public Integer getDownBloodPressure() {
		return downBloodPressure;
	}

	public void setDownBloodPressure(Integer downBloodPressure) {
		this.downBloodPressure = downBloodPressure;
	}

	public Integer getBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(Integer bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	@Override
	public String toString() {
		return "SeniorTalent {jlxh=" + jlxh + ", name=" + name + ", sfzh=" + sfzh + ", brxb=" + brxb + ", csny=" + csny
				+ ", lxdh=" + lxdh + ", lxdz=" + lxdz + ", zfpb=" + zfpb + ", mzhm=" + mzhm + ", zyhm=" + zyhm
				+ ", disease=" + disease + ", brid=" + brid + ", createTime=" + createTime + ", createYgdm="
				+ createYgdm + ", height=" + height + ", weight=" + weight + ", searchBz=" + searchBz + ", sfNo=" + sfNo
				+ ", orderNo=" + orderNo + ", gms=" + gms + ", extraGms=" + extraGms + ", education=" + education
				+ ", unit=" + unit + ", bloodType=" + bloodType + ", marriage=" + marriage + ", profession="
				+ profession + ", age=" + age + ", brxbShow=" + brxbShow + ", abnormalStr=" + abnormalStr
				+ ", topBloodPressure=" + topBloodPressure + ", downBloodPressure=" + downBloodPressure
				+ ", bloodSugar=" + bloodSugar + "}";
	}
}