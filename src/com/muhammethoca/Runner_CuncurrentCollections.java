package com.muhammethoca;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Runner_CuncurrentCollections {
    public static void main(String[] args) {
        Map<Integer,String> map = new ConcurrentHashMap<>();
        List<String> listem = new  CopyOnWriteArrayList<>(List.of("Bugün","Yarın"));

    }
}
