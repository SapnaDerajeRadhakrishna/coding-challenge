package org.maxwell.challenge;

public class ReverseString {

    public static String FirstReverse(String str) {
        int strLength = str.length();
        String result = "";
        while (strLength > 0) {
            result = result + str.charAt(strLength - 1);
            strLength --;
        }
        return result;
      }

      public static void main (String[] args) {  
        String input = "i love to code";
        System.out.print(FirstReverse(input)); 
      }

}
