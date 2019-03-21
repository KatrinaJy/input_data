package com.springboot.gradu.data.dynamicdDatabases;


import com.springboot.gradu.util.StringUtil;

/**
 * 数据源枚举
 * @author 13314
 * @date 2018/7/26
 */
public enum DataSourceEnum {

    LOCAL("1","local"),
    /**
     * 测试库
     */
    TEST("0000","Test") ,
    /**
     * 天津高院
     */
    TJGY("120000 200","Tjgy"),
    /**
     * 天津一中院
     */
    TJYZY("120100 210","Tjyzy"),
    /**
     * 天津二中院
     */
    TJEZY("120200 220","Tjezy"),
    /**
     * 天津海事法院
     */
    TJHSFY("960200 230","Tjhsfy"),
    /**
     * 天津和平法院
     */
    TJHPFY("120101 211","Tjhpfy"),
    /**
     * 天津南开法院
     */
    TJNKFY("120104 212","Tjnkfy"),
    /**
     * 天津河北法院
     */
    TJHBFY("120105 213","Tjhbfy"),
    /**
     * 天津红桥法院
     */
    TJHQFY("120106 214","Tjhqfy"),
    /**
     * 天津西青法院
     */
    TJXQFY("120107 215","Tjxqfy"),
    /**
     * 天津北辰法院
     */
    TJBCFY("120108 216","Tjbcfy"),
    /**
     * 天津河东法院
     */
    TJHDFY("120202 221","Tjhdfy"),

    /**
     * 天津河西法院
     */
    TJHXFY("120203 222","Tjhxfy"),

    /**
     * 天津塘沽法院
     */
    TJTGFY("120204 223","Tjtgfy"),

    /**
     * 天津汉沽法院
     */
    TJHGFY("120205 224","Tjhgfy"),

    /**
     * 天津大港法院
     */
    TJDGFY("120206 225","Tjdgfy"),

    /**
     * 天津东丽法院
     */
    TJDLFY("120207 226","Tjdlfy"),

    /**
     * 天津津南法院
     */
    TJJNFY("120208 227","Tjjnfy"),

    /**
     * 天津宁河法院
     */
    TJNHFY("120221 228","Tjnhfy"),

    /**
     * 天津武清法院
     */
    TJWQFY("120222 217","Tjwqfy"),

    /**
     * 天津静海法院
     */
    TJJHFY("120223 218","Tjjhfy"),

    /**
     * 天津宝坻法院
     */
    TJBDFY("120224 219","Tjbdfy"),

    /**
     * 天津蓟县法院
     */
    TJJXFY("120225 21A","Tjjxfy"),
    /**
     * 天津开发区人民法院
     */
    TJKFQFY("120241 229","Tjkfqfy"),
    /**
     * 天津滨海新区法院
     */
    TJBHXQFY("120242 22A","Tjbhxqfy"),
    /**
     * 天津铁路法院
     */
    TJTLFY("920103 132","Tjtlfy");

    private String key ;
    private String fydm ;
    DataSourceEnum(String fydm,String key){
        this.fydm = fydm ;
        this.key = key ;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFydm() {
        return fydm;
    }

    public void setFydm(String fydm) {
        this.fydm = fydm;
    }

    public static String getSourceByFydm(String fydm){
        if(StringUtil.isEmpty(fydm)) {
            return null;
        }
        for (DataSourceEnum src : DataSourceEnum.values()) {
            if (StringUtil.equals(fydm, src.getFydm())) {
                return src.getKey();
            }
        }
        return null;
    }
}
