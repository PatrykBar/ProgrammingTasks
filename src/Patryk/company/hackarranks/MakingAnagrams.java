package Patryk.company.hackarranks;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        int count=0;
        int lengthOfAandB= a.length() + b.length();

        if (a.length()>b.length()){
            for(int i=0; i<a.length(); i++){
                for (int j=0; j<b.length(); j++){
                    if (a.charAt(i)== b.charAt(j)){
                        count = count + 2;
                        b = b.substring(0, j) + b.substring(j+1);
                        System.out.println(b);
                        break;
                    }
                }
            }
        }else {
            for(int i=0; i<b.length(); i++){
                for (int j=0; j<a.length(); j++){
                    if (b.charAt(i) == a.charAt(j)){
                        count = count + 2;
                        a = a.substring(0, j) + a.substring(j+1);
                        System.out.println(a);
                        break;
                    }

                }
            }
        }

        System.out.println(lengthOfAandB);
        System.out.println(count);


        return lengthOfAandB - count;
    }
}
