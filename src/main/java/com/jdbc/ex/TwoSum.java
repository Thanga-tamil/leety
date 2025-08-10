package com.jdbc.ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoSum {

    private static List<Integer> list;

    private static Integer target;

    TwoSum(){}

    TwoSum(List<Integer> list, Integer target){
        TwoSum.list = list;
        TwoSum.target = target;
        System.out.println("Array :: " + list + " Target :: " + target );
    }

    public int[] twoSumByBruteForce(){

        int length = list.toArray().length;

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(Integer.parseInt(String.valueOf(list.toArray()[i])) + Integer.parseInt(String.valueOf(list.toArray()[j])) == target){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public int[] twoSumByHashMap(){

        Map<Integer, Integer> indicesAsValue = new HashMap<>();

//        AtomicInteger integerIncrement = new AtomicInteger(0);

//        list.forEach(valuesAsKey -> indicesAsValue.put(valuesAsKey, integerIncrement.getAndIncrement()));

//        System.out.println("indicesAsValue :: " + indicesAsValue);

        for (int i = 0; i <list.toArray().length; i++) {
            if (indicesAsValue.containsKey(target - Integer.parseInt(String.valueOf(list.toArray()[i]))) &&
                    indicesAsValue.get(target - Integer.parseInt(String.valueOf(list.toArray()[i]))) != i ){ // ..The Second Condition Is To Make Sure To Not Pick The Same Index Value Twice..
                return new int[]{i, indicesAsValue.get(target - Integer.parseInt(String.valueOf(list.toArray()[i])))};
            }else {
                indicesAsValue.put(Integer.parseInt(String.valueOf(list.toArray()[i])), i);
            }
        }
        return new int[]{-1, -1};
    }

}
