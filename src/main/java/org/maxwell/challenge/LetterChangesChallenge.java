package org.maxwell.challenge;

public class LetterChangesChallenge {

    public static String LetterChanges(String str) {
        String testString = str.toLowerCase();
        String resultString = "";
        int strLength = testString.length();
        for (int i = 0; i < strLength; i++) {
            char input = testString.charAt(i);
            char newInput = input;
            if ((int) (input) > 97 && (int) (input) < 122) {
                newInput = (char) ((char) input + 1);
                switch (newInput) {
                case 'a':
                    newInput = 'A';
                    break;
                case 'e':
                    newInput = 'E';
                    break;
                case 'i':
                    newInput = 'I';
                    break;
                case 'o':
                    newInput = 'O';
                    break;
                case 'u':
                    newInput = 'U';
                    break;
                }
            }
            resultString = resultString + newInput;
        }
        return resultString;
    }

    public static void main(String[] args) {
        String inputString = "fun times!";
        System.out.print(LetterChanges(inputString));
    }

}
