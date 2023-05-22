package Streams;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Squreslambda {
    public static void main(String[] args) {
        List<Integer>a= Arrays.asList(2,4,6,7,8,9,10);
        System.out.println(a);

        System.out.println("******************SQUARE***********************************");
        List<Integer>numbersqure= a.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(numbersqure);

        System.out.println("************BY USING TERMINAL OPERATOR*********************************");
        a.stream().map(x->x*x).forEach(x->{System.out.println(x);});

        System.out.println("************Addition*********************************");
        List<Integer>numberadd=a.stream().map(x->x+x).collect(Collectors.toList());
        System.out.println(numberadd);

        System.out.println("************BY USING TERMINAL OPERATOR*********************************");
        a.stream().map(x->x+x).forEach(x-> System.out.println(x));

        System.out.println("************SUBTRACTION MINUS 2*********************************");
        List<Integer>numbesub=a.stream().map(x->x-2).collect(Collectors.toList());
        System.out.println(numbesub);

        System.out.println("************BY USING TERMINAL OPERATOR*********************************");
        a.stream().map(x->x-2).forEach(x-> System.out.println(x));

        System.out.println("************Division by 2*********************************");
        List<Integer>numdivis=a.stream().map(x->x/2).collect(Collectors.toList());
        System.out.println(numdivis);

        System.out.println("************BY USING TERMINAL OPERATOR*********************************");
        a.stream().map(x->x/2).forEach(x-> System.out.println(x));

        System.out.println("**************************Even Number***********************************");

        List<Integer>even=a.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(even);

        System.out.println("************BY USING TERMINAL OPERATOR*********************************");
        a.stream().filter(x->x%2!=0).forEach(x-> System.out.println(x));

        System.out.println("**************************Range*******************");
        IntStream.range(1,10).filter(x->x%2==0).forEach(x-> System.out.println(x));

    }
}
