package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDuplicate {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(15);
            list.add(20);
            list.add(15);

            List<Integer> unique = list.stream()
                    .map(x -> x * x)
                    .filter(x -> checkDuplicate(list, x))
                    .collect(Collectors.toList());

            System.out.println(unique);
        }

        public static boolean checkDuplicate(List<Integer> list, int x) {
            int count = 0;
            for (int y : list) {
                if (x == y * y) {
                    count++;
                }
            }
            return count == 1;
        }
    }



