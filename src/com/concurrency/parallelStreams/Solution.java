package com.concurrency.parallelStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
        Stream<Integer> parallelStream = stream.parallel();

        Stream<Integer> parallelStream2 = Arrays.asList(6,5,4,3,2,1).parallelStream();
        Arrays.asList(1,2,3,4,5,6).stream().forEach(s -> System.out.print(s+" "));
        System.out.println();
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(s -> System.out.print(s+" "));
        System.out.println();
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s -> System.out.print(s+" "));
    }
}
