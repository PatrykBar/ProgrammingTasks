package Patryk.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeftRotation {

    public List<Integer> rotateLeft(int d, List<Integer> arr) {
//        int number=0;
//        int lastElement=0;

//        for(int i=0; i<d; i++){
//            for (int j=0; j<arr.size()-1; j++){
//                if (j==0){
//                    number = arr.get(j);
//                    arr.set(j, arr.get(j+1));
//                    lastElement = arr.get(arr.size()-1);
//                    arr.set(arr.size()-1, number);
//                }else if (j==arr.size()-2){
//                    arr.set(j, lastElement);
//                }else{
//                    arr.set(j, arr.get(j+1));
//                }
//            }
//        }

        d = d%arr.size();
        int x;
        for(int i=0;i<d;i++){
            x=arr.get(0);
            arr.remove(arr.get(0));
            arr.add(x);
        }
        return arr;
    }
}
