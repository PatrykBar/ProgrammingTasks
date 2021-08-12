package Patryk.company.hackarranks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MakingAnagramsv1 {


        /*
         * Complete the 'makeAnagram' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING a
         *  2. STRING b
         */

        public int makeAnagram(String a, String b) {
            int count=0;

            System.out.println(a.length());
            System.out.println(b.length());

            if (a.length()>=b.length()){
                for(int i=0; i<a.length(); i++){
                    for(int j=0; j<b.length(); j++){
                        System.out.println(i + " " + j);
                        if (a.substring(i,i+1).equals(b.substring(j,j+1))){
                            count++;
                            a = a.substring(0,i) + a.substring(i+1);
                            System.out.println(a);
                            b = b.substring(0,j) + b.substring(j+1);
                            System.out.println(b);
                        }
                    }
                }
            }else{
                for(int i=0; i<b.length(); i++){
                    for(int j=0; j<a.length(); j++){
                        System.out.println(i + " " + j);
                        if (b.substring(i,i+1).equals(a.substring(j,j+1))){
                            count++;
                            b = b.substring(0,i) + b.substring(i+1);
                            System.out.println(b);
                            a = a.substring(0,j) + a.substring(j+1);
                            System.out.println(a);
                        }
                    }
                }
            }

            return count;
        }

}
