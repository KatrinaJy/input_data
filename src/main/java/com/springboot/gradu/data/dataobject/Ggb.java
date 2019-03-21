package com.springboot.gradu.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 28643 on 2018/11/30.
 */
/*
* 公告表
* */
@Entity
@Table(name = "ggb")
public class Ggb {
    @Id
    @Column(name = "ID")
    private int id ;
    @Column(name = "GGMC")
    private String ggmc ;
    @Column(name = "STATUS")
    private int status ;
    @Column(name = "GGLX")
    private int gglx ;

    @Column(name = "BFFS")
    private int bffs ;

    @Column(name = "BFKSSJ")
    private Date bfkssj ;

    @Column(name = "BFJSSJ")
    private Date bfjssj ;
    @Column(name = "BFKSSD")
    private Date bfkssd ;
    @Column(name = "SHSM")
    private String shsm ;
    @Column(name = "FBSJ")
    private Date fbsj ;
    @Column(name = "GGSC")
    private int ggsc ;
    @Column(name = "AH")
    private String ah ;
    @Column(name = "AJMC")
    private String ajmc ;
    @Column(name = "FBR")
    private String fbr ;
    @Column(name = "GGNR")
    private String ggnr ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGgmc() {
        return ggmc;
    }

    public void setGgmc(String ggmc) {
        this.ggmc = ggmc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGglx() {
        return gglx;
    }

    public void setGglx(int gglx) {
        this.gglx = gglx;
    }

    public int getBffs() {
        return bffs;
    }

    public void setBffs(int bffs) {
        this.bffs = bffs;
    }

    public Date getBfkssj() {
        return bfkssj;
    }

    public void setBfkssj(Date bfkssj) {
        this.bfkssj = bfkssj;
    }

    public Date getBfjssj() {
        return bfjssj;
    }

    public void setBfjssj(Date bfjssj) {
        this.bfjssj = bfjssj;
    }

    public Date getBfkssd() {
        return bfkssd;
    }

    public void setBfkssd(Date bfkssd) {
        this.bfkssd = bfkssd;
    }

    public String getShsm() {
        return shsm;
    }

    public void setShsm(String shsm) {
        this.shsm = shsm;
    }

    public Date getFbsj() {
        return fbsj;
    }

    public void setFbsj(Date fbsj) {
        this.fbsj = fbsj;
    }

    public int getGgsc() {
        return ggsc;
    }

    public void setGgsc(int ggsc) {
        this.ggsc = ggsc;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    public String getFbr() {
        return fbr;
    }

    public void setFbr(String fbr) {
        this.fbr = fbr;
    }

    public String getGgnr() {
        return ggnr;
    }

    public void setGgnr(String ggnr) {
        this.ggnr = ggnr;
    }
}
