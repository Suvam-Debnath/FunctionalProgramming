// print each element of a list of strings with prefix "Item"

package com.suvam.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class UsingforEach {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry");
        words.stream()
                .forEach(n-> System.out.println("Item:"+n));
    }

}
