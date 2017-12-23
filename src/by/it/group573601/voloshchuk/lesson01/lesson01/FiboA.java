package by.it.group573601.voloshchuk.lesson01.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboA fibo;
        fibo= new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA();
        n = 33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }


    private int calc(int n) {
        if(n<=1)
            return n;
        else
            return calc(n-1)+calc(n-2);
        //здесь простейший вариант, в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)

    }


    BigInteger slowA(Integer n) {
        if(n<=1)
            return BigInteger.valueOf(n);
        else
            return slowA(n-1).add(slowA(n-2));
        //рекурсия
        //здесь нужно реализовать вариант без ограничения на размер числа,
        //в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)

        //return BigInteger.ZERO;
    }



}
