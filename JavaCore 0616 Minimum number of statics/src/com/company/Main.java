package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0616 Минимальное число статиков

Расставьте минимальное количество static-ов,
чтобы код начал работать,
и программа успешно завершилась.

Требования:
1. Реализацию методов менять нельзя.
2. Добавь модификаторы static в нужные места.
3. В программе должно быть только 4 модификатора static.
4. Программа должна выводить текст на экран.

Минимальное число статиков

*/

// public class Solution
public class Main {

    public static int step;

    public static void main(String[] args) {

        method1();
    }
    public static void method1() {
        method2();
    }

    public static void method2() {
        new Main().method3();
    }

    public void method3() {

        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}











