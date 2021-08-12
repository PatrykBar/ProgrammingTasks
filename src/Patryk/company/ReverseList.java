package Patryk.company;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    private List<Integer> reverseIntegere = new ArrayList<>();

    public List<Integer> reverseListMethod(List<Integer> simpleList){

        for (int i = simpleList.size()-1; i >= 0; i--) {
            reverseIntegere.add(simpleList.get(i));
        }


        return reverseIntegere;
    }

}
