package Patryk.company;

import java.util.Random;

public class Facker {
    private Random random = new Random();

    public String letterify(String letterString) {
        String withoutQuestionMark = "";
        String setOfLetter = "qwertyuiopasdfghjklzxcvbnm";
        int randomInt = random.nextInt(setOfLetter.length());
        char randomChar = setOfLetter.charAt(randomInt);

        if (letterString == null){
            return null;
        }
        for (int i=0; i<letterString.length(); i++){
            if (letterString.charAt(i) == '?'){
                withoutQuestionMark = withoutQuestionMark + randomChar;
            }else {
                withoutQuestionMark = withoutQuestionMark + letterString.charAt(i);
            }
        }

        return withoutQuestionMark;
    }

    public String numerify(String numberString) {
        String withoutQuestionMark = "";
        int randomInt = random.nextInt(10);
        for (int i=0; i<numberString.length(); i++){
            if (numberString.charAt(i) == '#'){
                withoutQuestionMark = withoutQuestionMark + randomInt;
            }else {
                withoutQuestionMark = withoutQuestionMark + numberString.charAt(i);
            }
        }

        return withoutQuestionMark;
    }

    public String bothify(String string) {
//        return letterify(numerify(string));
        String withoutQuestionMark = "";
        String setOfLetter = "qwertyuiopasdfghjklzxcvbnm";
        int randomInt1 = random.nextInt(10);
        int randomInt2 = random.nextInt(setOfLetter.length());
        char randomChar = setOfLetter.charAt(randomInt2);
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i) == '#'){
                withoutQuestionMark = withoutQuestionMark + randomInt1;
            }else if (string.charAt(i) == '?'){
                withoutQuestionMark = withoutQuestionMark + randomChar;
            }else {
                withoutQuestionMark = withoutQuestionMark + string.charAt(i);
            }
        }

        return withoutQuestionMark;
    }
}



