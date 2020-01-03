package org.maxwell.challenge;

public class LetterCapitalizeChallenge {

    public static String LetterCapitalize(String str) {
        String[] input_array = str.split(" ");
        String resultString = "";
        for (int i = 0; i < input_array.length; i++) {
            char upperCaseChar = Character.toUpperCase(input_array[i].charAt(0));
            String newString =  upperCaseChar + input_array[i].substring(1, input_array[i].length());
            resultString = resultString + " " +newString;
        }
        return resultString.trim();
      }

      public static void main (String[] args) {  
        String input = "test test";
        System.out.print(LetterCapitalize(input)); 
      }
}
