package com.springboot.gradu.data.dataobject;

import javax.persistence.*;
import java.util.Date;

/**
 * PubDmb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "PUB_DMB")
@IdClass(value=PubDmbId.class)
public class PubDmb implements java.io.Serializable {

	// Fields

    private String lbbh;
    private String dmbh;

	private String dmms;
	private String xgdm;
	private String bz;
	private String modflag;
	private String transflag;
	private Date xgsj;
	private double xssx;
	private String dqbs;
	private Integer fybh;
	private String fysx;
	private String fylbdm;
	private Integer xzqdmbh;
	private Integer dmbbh;
	private String spbm;
	private String bmzt;
	private String xgdm2;

	// Constructors

	/** default constructor */
	public PubDmb() {
	}

	/** minimal constructor */
    public PubDmb(String dmbh, String lbbh) {
        this.dmbh = dmbh;
        this.lbbh = lbbh;
    }

    /** full constructor */
	public PubDmb(String dmbh, String lbbh, String dmms, String xgdm, String bz,
			String modflag, String transflag, Date xgsj, double xssx,
			String dqbs, Integer fybh, String fysx, String fylbdm,
			Integer xzqdmbh, Integer dmbbh, String spbm, String bmzt,
			String xgdm2) {
        this.dmbh = dmbh;
        this.lbbh = lbbh;
		this.dmms = dmms;
		this.xgdm = xgdm;
		this.bz = bz;
		this.modflag = modflag;
		this.transflag = transflag;
		this.xgsj = xgsj;
		this.xssx = xssx;
		this.dqbs = dqbs;
		this.fybh = fybh;
		this.fysx = fysx;
		this.fylbdm = fylbdm;
		this.xzqdmbh = xzqdmbh;
		this.dmbbh = dmbbh;
		this.spbm = spbm;
		this.bmzt = bmzt;
		this.xgdm2 = xgdm2;
	}


    @Id
    @Column(name = "DMBH")
    public String getDmbh() {
        return dmbh;
    }

    public void setDmbh(String dmbh) {
        this.dmbh = dmbh;
    }
    @Id
    @Column(name = "LBBH")
    public String getLbbh() {
        return lbbh;
    }

    public void setLbbh(String lbbh) {
        this.lbbh = lbbh;
    }

    @Column(name = "DMMS", length = 250)
	public String getDmms() {
		return this.dmms;
	}

	public void setDmms(String dmms) {
		this.dmms = dmms;
	}

	@Column(name = "XGDM", length = 250)
	public String getXgdm() {
		return this.xgdm;
	}

	public void setXgdm(String xgdm) {
		this.xgdm = xgdm;
	}

	@Column(name = "BZ", length = 200)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Column(name = "MODFLAG", length = 1)
	public String getModflag() {
		return this.modflag;
	}

	public void setModflag(String modflag) {
		this.modflag = modflag;
	}

	@Column(name = "TRANSFLAG", length = 1)
	public String getTransflag() {
		return this.transflag;
	}

	public void setTransflag(String transflag) {
		this.transflag = transflag;
	}

	@Column(name = "XGSJ", length = 23)
	public Date getXgsj() {
		return this.xgsj;
	}

	public void setXgsj(Date xgsj) {
		this.xgsj = xgsj;
	}

	@Column(name = "XSSX", precision = 15, scale = 0)
	public double getXssx() {
		return this.xssx;
	}

	public void setXssx(double xssx) {
		this.xssx = xssx;
	}

	@Column(name = "DQBS", length = 1)
	public String getDqbs() {
		return this.dqbs;
	}

	public void setDqbs(String dqbs) {
		this.dqbs = dqbs;
	}

	@Column(name = "FYBH")
	public Integer getFybh() {
		return this.fybh;
	}

	public void setFybh(Integer fybh) {
		this.fybh = fybh;
	}

	@Column(name = "FYSX", length = 100)
	public String getFysx() {
		return this.fysx;
	}

	public void setFysx(String fysx) {
		this.fysx = fysx;
	}

	@Column(name = "FYLBDM", length = 10)
	public String getFylbdm() {
		return this.fylbdm;
	}

	public void setFylbdm(String fylbdm) {
		this.fylbdm = fylbdm;
	}

	@Column(name = "XZQDMBH")
	public Integer getXzqdmbh() {
		return this.xzqdmbh;
	}

	public void setXzqdmbh(Integer xzqdmbh) {
		this.xzqdmbh = xzqdmbh;
	}

	@Column(name = "DMBBH")
	public Integer getDmbbh() {
		return this.dmbbh;
	}

	public void setDmbbh(Integer dmbbh) {
		this.dmbbh = dmbbh;
	}

	@Column(name = "SPBM", length = 1)
	public String getSpbm() {
		return this.spbm;
	}

	public void setSpbm(String spbm) {
		this.spbm = spbm;
	}

	@Column(name = "BMZT", length = 250)
	public String getBmzt() {
		return this.bmzt;
	}

	public void setBmzt(String bmzt) {
		this.bmzt = bmzt;
	}

	@Column(name = "XGDM2", length = 250)
	public String getXgdm2() {
		return this.xgdm2;
	}

	public void setXgdm2(String xgdm2) {
		this.xgdm2 = xgdm2;
	}

}