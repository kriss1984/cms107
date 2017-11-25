package com.kriss.util;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by kriss on 2017/5/19.
 * id 生成器
 * 主要为各表生成 32 位 或者 64 位的 字符主键值
 */
public class IDGenerator {

    /**
     * 利用JDK 自带的UUID 生成 uuid
     *
     * @return
     */
    public synchronized static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public static void main(String args[]) {
        Set randomIds = new HashSet();
        String id = UUID.randomUUID().toString();
        randomIds.add(id);
        System.out.println(id.replaceAll("-", ""));

    }
}
