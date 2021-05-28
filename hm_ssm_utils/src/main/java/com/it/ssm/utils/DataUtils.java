package com.it.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    public static  String dateToString(Date date,String patt){
        SimpleDateFormat sdf = new SimpleDateFormat(patt);

        String format =sdf.format(date);

        return format;
    }

    public static Date  stringToDate(String str,String patt) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);

        Date parse = sdf.parse(str);

        return parse;
    }
}
