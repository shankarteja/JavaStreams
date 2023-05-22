package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDuplicates {
    public static void main(String[] args) {

        System.out.println("**********************IT WILL PRINT SAME ORDER**********************************");
        List<Integer> numbers= Arrays.asList(2,4,6,2,6,8,8,10,10,12,14,2,4);
        System.out.println(numbers);

        System.out.println("*****************************ASSCENDING ORDER*************************");

        List<Integer>numasc=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(numasc);
        System.out.println("*****************************BY USING TERMINAL OPERATOR ASSCENDING ORDER****************");
        numbers.stream().sorted().forEach(x-> System.out.println(x));


        System.out.println("*****************************Descending Order*************************");


        List<Integer>numberdesc=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(numberdesc);
        System.out.println("*****************************BY USING TERMINAL OPERATOR DESCENDING ORDER****************");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));

    }
}
