package com.jirly.exam;

/**
 * Created by User on 2018/7/15.
 */
public class Practice {

    /**
     * practice1
     */
    public static void practice1() {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                if (i%5 != 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println("FizzBuzz");
                }

            } else if (i%5 == 0) {
                if (i%3 != 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println("FizzBuzz");
                }
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * practeice2
     */
    public static void practice2() {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0 || containsDigtal(i,3)) {
                if (i%5 != 0 && !containsDigtal(i,5)) {
                    System.out.println("Fizz");
                } else {
                    System.out.println("FizzBuzz");
                }

            } else if (i%5 == 0 || containsDigtal(i,5)) {
                if (i%3 != 0 && !containsDigtal(i,3)) {
                    System.out.println("Buzz");
                } else {
                    System.out.println("FizzBuzz");
                }
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * 检查是否某个数字orgDigtal 中是否含有另外一个数字containDigtal
     * check the original digital contains another digital
     * @param orgDigtal
     * @param containDigtal
     * @return
     */
    private static boolean containsDigtal(int orgDigtal,int containDigtal) {
        return String.valueOf(orgDigtal).contains(String.valueOf(containDigtal));
    }


    public static void main(String[] args) {
        //Practice.practice1();
        Practice.practice2();
    }
}
