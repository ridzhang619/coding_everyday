package com.morgan.ridzhang.testjava;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void strShowTimes() {

        String s = "khashbcakbkachbakahjvacwhcveoduswcpsudhkkshcwahsbkkhuowcabkhdswcakds";

        char[] ss = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char cc : ss) {

            map.put(cc, map.containsKey(cc) ? map.get(cc) + 1 : 1);

        }
        System.out.print(map);

    }

    @Test
    public void twoLockPrint() throws InterruptedException {








    }


}