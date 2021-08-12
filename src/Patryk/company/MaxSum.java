package Patryk.company;

import java.util.Collections;
import java.util.List;

public class MaxSum {

    public int findMaxSum(List<Integer> list){
        Collections.sort(list);
        return list.get(list.size()-2) + list.get(list.size()-1);
    }

}
