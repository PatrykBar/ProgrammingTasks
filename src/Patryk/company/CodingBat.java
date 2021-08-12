package Patryk.company;

import Patryk.company.decorator.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingBat {

    String str;

    public CodingBat(String str) {
        this.str = str;
        catDog(str);
    }

    public boolean catDog(String str) {
        List<String> test = new ArrayList<>(Arrays.asList("2", "3"));


        int countCat=0;
        int countDog=0;

        for (int i=0; i<str.length()-2; i++){
            if (str.substring(i,i+3).equals("cat")){
                countCat++;
            }else if (str.substring(i,i+3).equals("dog")){
                countDog++;
            }
        }

        System.out.println(countCat + " " + countDog);

        if (countCat==countDog){
            return true;
        }else {
            return false;
        }
    }
}
