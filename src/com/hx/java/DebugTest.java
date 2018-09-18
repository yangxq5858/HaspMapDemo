package com.hx.java;

import java.util.HashMap;

/**
 * @author yangxinqiang
 * @content
 * @create 2018-09-18 17:06
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String name = map.get("name");
        System.out.println(name);
        System.out.println("name = " + name);
        map.remove("age");
        System.out.println(map);

    }
}
