package com.springboot.gradu.data.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 侧边栏
 */
@Entity
@Table(name = "nav")
public class Nav {
    private Integer id;
    private String name;
    private String href;
    private String iconUrl;
    private Integer level;
    private String iconNav;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @Column(name="href")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Column(name = "iconurl")
    public String getIconUrl() {
        return iconUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Column(name = "iconNav")
    public String getIconNav() {
        return "<span class=\"oi "+this.iconNav+"\"><span class=\"navPadding\">"+this.name+"</span></span>";
    }

    public void setIconNav(String iconNav) {

        this.iconNav = iconNav;
    }
}
