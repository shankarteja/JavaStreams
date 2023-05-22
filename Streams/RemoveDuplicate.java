package Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {


        List<Integer> deletduplicat = Arrays.asList(5, 5, 4, 5, 6, 7, 8, 8, 4, 5, 7, 12, 11, 7, 9, 5, 6, 4, 5);
        List<Integer> duplicate = deletduplicat.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicate);
        System.out.println("**********************BY USING TEMINAL OPERATOR ************************");
        deletduplicat.stream().distinct().forEach(x-> System.out.println(x));

        System.out.println("******************avoid  Duplicate and  sorting the order ******************");

        List<Integer>duplicatesortingorder=deletduplicat.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(duplicatesortingorder);
        System.out.println("******************by using Terminal orerator avoid  Duplicate and  sorting the order ******************");

        duplicatesortingorder.stream().distinct().sorted().forEach(x-> System.out.println(x));


        List<Integer> limit = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("************************** limits date**************************");
        List<Integer>limits=limit.stream().limit(3).collect(Collectors.toList());
        System.out.println(limits);

        System.out.println("******************By using terminal operator limits ********************");
        limits.stream().limit(3).forEach(x-> System.out.println(x));

        System.out.println("************************** skip data **************************");


        List<Integer>skipvalue=limits.stream().skip(2).collect(Collectors.toList());
        System.out.println(skipvalue);
        System.out.println("*****************by using terminla operator ***************");
        limits.stream().skip(3).forEach(x-> System.out.println(x));


    }
}