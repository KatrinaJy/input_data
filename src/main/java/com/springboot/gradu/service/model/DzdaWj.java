package com.springboot.gradu.service.model;

import java.util.Date;

public class DzdaWj {

	private String wjid;
	private int wjbh;
	private String wjmc;
	private String wjlj;
	private String wjsswjj;
	private String scszjd;
	private Date wjscsj;
	public DzdaWj() {

	}

	public DzdaWj(String wjid, int wjbh, String wjmc, String wjlj) {
		super();
		this.wjid = wjid;
		this.wjbh = wjbh;
		this.wjmc = wjmc;
		this.wjlj = wjlj;
	}

	public String getWjid() {
		return wjid;
	}

	public void setWjid(String wjid) {
		this.wjid = wjid;
	}

	public int getWjbh() {
		return wjbh;
	}

	public void setWjbh(int wjbh) {
		this.wjbh = wjbh;
	}

	public String getWjmc() {
		return wjmc;
	}

	public void setWjmc(String wjmc) {
		this.wjmc = wjmc;
	}

	public String getWjlj() {
		return wjlj;
	}

	public void setWjlj(String wjlj) {
		this.wjlj = wjlj;
	}

	public String getWjsswjj() {
		return wjsswjj;
	}

	public void setWjsswjj(String wjsswjj) {
		this.wjsswjj = wjsswjj;
	}

	public String getScszjd() {
		return scszjd;
	}

	public void setScszjd(String scszjd) {
		this.scszjd = scszjd;
	}

	public Date getWjscsj() {
		return wjscsj;
	}

	public void setWjscsj(Date date) {
		this.wjscsj = date;
	}


	

}
