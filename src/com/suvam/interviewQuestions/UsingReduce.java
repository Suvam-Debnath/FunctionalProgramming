// Compute the product of all numbers in a list

package com.suvam.interviewQuestions;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        Optional<Integer> result = numbers.stream()
                .reduce((a,b)->a+b);
        System.out.println(result);
    }
}
