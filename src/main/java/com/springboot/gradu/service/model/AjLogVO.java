package com.springboot.gradu.service.model;

import java.util.Date;

public class AjLogVO {

	// ��Ժ����
	private String fydm;
	// �������
	private int ajxh;
	// �᰸����
	private Date jarq;
	// ����״̬
	private String exportStatus;
	// ���һ�α���ʱ��
	private Date lastExportDate;

	public String getFydm() {
		return fydm;
	}

	public void setFydm(String fydm) {
		this.fydm = fydm;
	}

	public int getAjxh() {
		return ajxh;
	}

	public void setAjxh(int ajxh) {
		this.ajxh = ajxh;
	}

	public Date getJarq() {
		return jarq;
	}

	public void setJarq(Date jarq) {
		this.jarq = jarq;
	}

	public String getExportStatus() {
		return exportStatus;
	}

	public void setExportStatus(String exportStatus) {
		this.exportStatus = exportStatus;
	}

	public Date getLastExportDate() {
		return lastExportDate;
	}

	public void setLastExportDate(Date lastExportDate) {
		this.lastExportDate = lastExportDate;
	}

}
