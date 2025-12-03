package Assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

        public static void main(String[] args) {

            int[] inputArray = {2, 5, 3, 23, 7, 78, 99, 1};
            int num = 10;

            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            for (int value : inputArray) {
                if (value < num) {
                    left.add(value);
                } else if (value > num) {
                    right.add(value);
                }
            }
            List<Integer> result = new ArrayList<>();
            result.addAll(left);
            result.add(num);
            result.addAll(right);
            System.out.println(result);
        }
    }

