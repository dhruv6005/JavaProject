package com.practice.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortUsingLastDigit {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(72);
        nums.add(81);
        nums.add(22);
        nums.add(54);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 10) > (o2 % 10))
                    return 1;
                else if ((o1 %10) == (o2 %10))
                    return 0;
                else
                    return -1;
            }
        };
        nums.sort(comparator);

        System.out.println(nums);
    }
}
