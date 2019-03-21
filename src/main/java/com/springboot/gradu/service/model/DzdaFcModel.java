package com.springboot.gradu.service.model;


/**
 * ���ӵ����ֲ�Model
 * @author wzq
 *
 */
public class DzdaFcModel {
	private Integer ajxh;
	private String cm;
	private Integer qsym;
	private Integer ys;
	private String sfzj;
	
	public DzdaFcModel() {
	}

	public DzdaFcModel(Integer ajxh, String cm, Integer qsym, Integer ys, String sfzj) {
		super();
		this.ajxh = ajxh;
		this.cm = cm;
		this.qsym = qsym;
		this.ys = ys;
		this.sfzj = sfzj;
	}

	public Integer getAjxh() {
		return ajxh;
	}
	
	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}
	
	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public Integer getQsym() {
		return qsym;
	}

	public void setQsym(Integer qsym) {
		this.qsym = qsym;
	}

	public Integer getYs() {
		return ys;
	}

	public void setYs(Integer ys) {
		this.ys = ys;
	}

	public String getSfzj() {
		return sfzj;
	}

	public void setSfzj(String sfzj) {
		this.sfzj = sfzj;
	}
	
}
