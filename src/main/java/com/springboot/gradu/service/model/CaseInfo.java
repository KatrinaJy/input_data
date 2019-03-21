package com.springboot.gradu.service.model;

/**
 * ��ת�������ķ�Ժ���롢�������
 * 
 * @author YU
 *
 */
public class CaseInfo {

	private String fydm;
	private long ajxh;
	private String ah;

	public CaseInfo(String fydm, long ajxh) {
		super();
		this.fydm = fydm;
		this.ajxh = ajxh;
	}

	public CaseInfo(String fydm, String ah) {
		super();
		this.fydm = fydm;
		this.ah = ah;
	}

	public String getFydm() {
		return fydm;
	}

	public void setFydm(String fydm) {
		this.fydm = fydm;
	}

	public long getAjxh() {
		return ajxh;
	}

	public void setAjxh(long ajxh) {
		this.ajxh = ajxh;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

}
