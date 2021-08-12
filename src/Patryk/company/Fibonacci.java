package Patryk.company;

public class Fibonacci {

    public int tribonacci(int lastElement){
        if (lastElement==1)
            return 0;
        else if (lastElement==2)
            return 1;
        else if (lastElement==3)
            return 2;
        else if (lastElement<=1)
            return lastElement;
        return tribonacci(lastElement-1) + tribonacci(lastElement-2) + tribonacci(lastElement-3);
    }
}