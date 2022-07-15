package com.ywh.dp.strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apple [] apples = new Apple[]{new Apple(5,10),new Apple(7,2),new Apple(1,9)};
        Sorter<Apple> sorter = new Sorter<>();

        AppleComparator<Apple> appleComparator = new PriceAppleComparator();
        sorter.sort(apples,appleComparator);
        System.out.println(Arrays.toString(apples));

        appleComparator = new SizeAppleComparator();
        sorter.sort(apples,appleComparator);
        System.out.println(Arrays.toString(apples));
    }
}
