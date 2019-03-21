package com.springboot.gradu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by 13314 on 2018/8/9.
 */
public class DateUtil {
    public final static String chineseDtFormat = "yyyy年MM月dd日";
    public final static String shortFormat = "yyyy-MM-dd";

    public final static String webFormat = "yyyy-MM-dd";


    /**
     * 标准化输出
     *
     * @param date
     *            日期对象
     * @param format
     *            日期输出格式
     * @return 按照指定格式输出的字符串
     */
    public static String format(Date date, String format) {
        if (date == null) {
            return null;
        }

        return new SimpleDateFormat(format).format(date);
    }

    public static String formateDateToCH(Date date){
        Calendar calendar = new GregorianCalendar() ;
        calendar.setTime(date);
        StringBuilder sb = new StringBuilder() ;
        sb.append(NumberUtil.numberDirectToCH(calendar.get(Calendar.YEAR)))
                .append("年")
                .append(NumberUtil.numberToCH(calendar.get(Calendar.MONTH)+1))
                .append("月")
                .append(NumberUtil.numberToCH(calendar.get(Calendar.DAY_OF_MONTH)))
                .append("日");
        return sb.toString() ;
    }

    public static Date createDate(int year,int month,int day){
        Calendar calendar = new GregorianCalendar(year,month,day) ;
        return calendar.getTime() ;
    }
    /**
     * 比较两个日期的先后关系
     *
     * @param one
     *            日期1
     * @param two
     *            日期2
     * @return  0 ： 表示相等    1 ： one大于two     -1 ： two大于one
     */
    public static int compareDate(Date one, Date two) {
        // 合法性判断
        if (one == null && two != null) {
            return -1;
        } else if (one != null && two == null) {
            return 1;
        } else if (one == null && two == null) {
            return 0;
        } else {
            if (one.getTime() > two.getTime()) {
                return 1;
            }
            if (one.getTime() == two.getTime()) {
                return 0;
            }
            return -1;
        }
    }

    public static Date parseDate(String date) throws ParseException {
        if (date == null || date.equals("")) {
            return null;
        }

        return new SimpleDateFormat().parse(date);

    }

    public static Date parse(String s_date, String format) {
        if (s_date == null)
            return null;
        try {
            return new SimpleDateFormat(format).parse(s_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
