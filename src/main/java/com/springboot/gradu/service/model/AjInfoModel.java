package com.springboot.gradu.service.model;

import java.io.Serializable;

public class AjInfoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1645792803917890079L;
	
	//private String name="";
	private String ay="";
	private String ah;
	private String spt;
	private String cbr;
	private String ajxz;
	private Integer ajxh;
	private String dh;
	private int cs;
	private String dsr;
	
	
	public String getDsr() {
		return dsr;
	}
	public void setDsr(String dsr) {
		this.dsr = dsr;
	}
	public String getDh() {
		return dh;
	}
	public void setDh(String dh) {
		this.dh = dh;
	}
	public int getCs() {
		return cs;
	}
	public void setCs(int cs) {
		this.cs = cs;
	}
	public String getAy() {
		return ay;
	}
	public void setAy(String ay) {
		this.ay = ay;
	}
	public String getAh() {
		return ah;
	}
	public void setAh(String ah) {
		this.ah = ah;
	}
	
	public void setAyList(String ay) {
		this.ay +=ay+",";
	}
	public String getSpt() {
		return spt;
	}
	public void setSpt(String spt) {
		this.spt = spt;
	}
	public String getCbr() {
		return cbr;
	}
	public void setCbr(String cbr) {
		this.cbr = cbr;
	}
	public String getAjxz() {
		return ajxz;
	}
	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}
	public Integer getAjxh() {
		return ajxh;
	}
	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}
}
