package com.springboot.gradu.service.model;

import java.io.Serializable;

public class DaInfoOldModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8796445867238526077L;
	private String dh;
	private String ah;
	private String ay;
	private String dsr;
	private int cs;
	public String getDh() {
		return dh;
	}
	public void setDh(String dh) {
		this.dh = dh;
	}
	public String getAh() {
		return ah;
	}
	public void setAh(String ah) {
		this.ah = ah;
	}
	public String getAy() {
		return ay;
	}
	public void setAy(String ay) {
		this.ay = ay;
	}
	public String getDsr() {
		return dsr;
	}
	public void setDsr(String dsr) {
		this.dsr = dsr;
	}
	public int getCs() {
		return cs;
	}
	public void setCs(int cs) {
		this.cs = cs;
	}

}
