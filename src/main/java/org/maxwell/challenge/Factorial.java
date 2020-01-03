package org.maxwell.challenge;

public class Factorial {

    public static int FirstFactorial(int num) {
        int result = 1;
        while (num > 1){
          result = result * num;
          num --;
        }
        return result;
      }

      public static void main (String[] args) {      
        int num = 8;
        System.out.println(FirstFactorial(num)); 
      }

}
