package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(60);
        list.add(9);
        list.add(56);
//maximum even element from an integer list
        OptionalInt result = list.stream().filter(x-> x%2 ==0).mapToInt(v -> v).max();

        
        
        
        System.out.println(result);
    }
}