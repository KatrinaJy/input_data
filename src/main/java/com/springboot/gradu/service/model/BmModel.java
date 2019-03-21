package com.springboot.gradu.service.model;

/**
 * ���������������Ժʹ�õĲ���Model
 * @author wzq
 *
 */
public class BmModel {
	private String src_bmbh;
	private String src_bmmc;
	private String des_fydm;
	private String des_bmbh;
	private String des_bmmc;
	
	public BmModel() {
		this.des_fydm="120242 22A";//������������Ժ
	}
	
	public BmModel(String src_bmbh, String src_bmmc,
			String des_bmbh, String des_bmmc) {
		super();
		this.src_bmbh = src_bmbh;
		this.src_bmmc = src_bmmc;
		this.des_bmbh = des_bmbh;
		this.des_bmmc = des_bmmc;
	}

	public String getSrc_bmbh() {
		return src_bmbh;
	}

	public void setSrc_bmbh(String src_bmbh) {
		this.src_bmbh = src_bmbh;
	}

	public String getSrc_bmmc() {
		return src_bmmc;
	}

	public void setSrc_bmmc(String src_bmmc) {
		this.src_bmmc = src_bmmc;
	}

	public String getDes_fydm() {
		return des_fydm;
	}

	public void setDes_fydm(String des_fydm) {
		this.des_fydm = des_fydm;
	}

	public String getDes_bmbh() {
		return des_bmbh;
	}

	public void setDes_bmbh(String des_bmbh) {
		this.des_bmbh = des_bmbh;
	}

	public String getDes_bmmc() {
		return des_bmmc;
	}

	public void setDes_bmmc(String des_bmmc) {
		this.des_bmmc = des_bmmc;
	}
}
