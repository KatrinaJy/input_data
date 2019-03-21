package com.springboot.gradu.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PUB_XTGL_YHB")
public class Yhb {

    private Integer yhbh;
    private String yhmc;
    private String yhdm;
    private String yhkl;

    @Column(name = "YHKL")
    public String getYhkl() {
        return yhkl;
    }

    @Id
    @Column(name = "YHBH")
    public Integer getYhbh() {
        return yhbh;
    }

    @Column(name = "YHDM")
    public String getYhdm() {
        return yhdm;
    }

    @Column(name = "YHMC")
    public String getYhmc() {
        return yhmc;
    }

    public void setYhbh(Integer yhbh) {
        this.yhbh = yhbh;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public void setYhkl(String yhkl) {
        this.yhkl = yhkl;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }
}
