package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<String, String>();

        map.put("john",   "123");
        map.put("amy",    "456");
        map.put("austin", "789");

        for(Map.Entry<String,String> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " - " + temp.getValue());
        }


    }

}
