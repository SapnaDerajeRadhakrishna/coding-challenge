package org.maxwell.challenge;

public class SimpleSymbolsChallenge {

    public static boolean SimpleSymbols(String str) {
        boolean isValid = false;
        if(str.charAt(0) == '+' && (str.charAt(str.length()-1) == '+')){
          isValid = true;
        }
       return isValid; 
      }

      public static void main (String[] args) {  
        String input = "+z+z+z+";
        System.out.print(SimpleSymbols(input)); 
      }
}
