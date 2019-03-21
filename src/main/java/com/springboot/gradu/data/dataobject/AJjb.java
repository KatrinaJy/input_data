package com.springboot.gradu.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "PUB_AJJB")
public class AJjb {

    private Integer ajxh;
    private String ah;
    private String ajmc;
    private String ajxz;
    private Date larq;
    private Date jarq;
    private Date gdrq;
    private String sycx;


    @Column(name = "JARQ")
    public Date getJarq() {
        return this.jarq;
    }

    public void setJarq(Date jarq) {
        this.jarq = jarq;
    }
    @Column(name = "AH")
    public String getAh() {
        return ah;
    }

    @Id
    @Column(name = "AJXH")
    public Integer getAjxh() {
        return ajxh;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public void setAjxh(Integer ajxh) {
        this.ajxh = ajxh;
    }

    public void setLarq(Date larq) {
        this.larq = larq;
    }

    @Column(name = "LARQ")
    public Date getLarq() {
        return larq;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    @Column(name = "AJMC")
    public String getAjmc() {
        return ajmc;
    }

    public void setAjxz(String ajxz) {
        this.ajxz = ajxz;
    }

    @Column(name = "AJXZ")
    public String getAjxz() {
        return ajxz;
    }

    public void setGdrq(Date gdrq) {
        this.gdrq = gdrq;
    }

    @Column(name = "GDRQ")
    public Date getGdrq() {
        return gdrq;
    }

    public void setSycx(String sycx) {
        this.sycx = sycx;
    }

    @Column(name = "SYCX")
    public String getSycx() {
        return sycx;
    }
}
