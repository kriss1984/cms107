package com.kriss.util;

public class StringUtil {

    public static boolean isEmpty(String str){
        boolean flag  = false;
        if(str==null)
            flag = true;
        if(str.trim().length()==0)
            flag =  true;
        return flag;
    }
}
