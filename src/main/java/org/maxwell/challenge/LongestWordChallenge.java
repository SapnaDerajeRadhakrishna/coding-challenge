package org.maxwell.challenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestWordChallenge {

    public static String LongestWord(String sen) {
        String inputArray[] = sen.split(" ");
        Map<String, Integer> inputMap= new HashMap<String, Integer>();
        for (String inputString : inputArray) {
            inputString = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase();
            inputMap.put(inputString, inputString.length());
        }
        Stream<Entry<String, Integer>> sortedMap = inputMap.entrySet().stream()
                   .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        Optional<Entry<String, Integer>> longestWord = sortedMap.findFirst();
        String result = longestWord.get().getKey();
        return result;
      }

      public static void main (String[] args) {  
        String input = "test!@@@# testttttt testtt ttttyy";
        System.out.print(LongestWord(input)); 
      }
}
