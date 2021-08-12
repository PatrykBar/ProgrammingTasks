package Patryk.company;

import java.util.*;

public class MinAbsoluteDiff {

    public int minimumAbsoluteDifference(List<Integer> arr) {

        int min=Integer.MAX_VALUE;

        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        newArrayList.addAll(arr);
        Collections.sort(newArrayList);

        for(int i=0; i<newArrayList.size()-1; i++){
            if(Math.abs(newArrayList.get(i)-newArrayList.get(i+1))<min){
                System.out.println(newArrayList.get(i) + " " + newArrayList.get(i+1));
                System.out.println(Math.abs(newArrayList.get(i)-newArrayList.get(i+1)));
                System.out.println("hi " + i + " " + i+1);
                min = Math.abs(newArrayList.get(i)-newArrayList.get(i+1));
            }
        }

        return min;
    }
}
