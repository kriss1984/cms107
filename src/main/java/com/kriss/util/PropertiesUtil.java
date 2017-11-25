package com.kriss.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.*;

public class PropertiesUtil {

   static Properties prop = new Properties();
   public static Map<String,String> params = new HashMap();
   static{
       try{
           //读取属性文件a.properties
           InputStream in = new BufferedInputStream( PropertiesUtil.class.getResourceAsStream("/config.properties"));
           prop.load(in);     ///加载属性列表
           Set set =prop.keySet();
           Iterator  it=set.iterator();
           while(it.hasNext()){
               String key=(String)it.next();
               params.put(key,prop.getProperty(key));
           }
           in.close();
       }
       catch(Exception e){
           System.out.println(e);
       }
   }
}
