package com.example.lib;


import java.util.HashMap;

public class CalculatorUtils {


    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）n<=39
     *
     * @param n
     * @return 递归
     */
    public static int fibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else if (n > 2 && n < 39) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return 0;
    }

    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）n<=39
     *
     * @param
     * @return 非递归
     */
//    public static int fibonacci(int n) {
//        int sum1 = 1;
//        int sum2 = 1;
//        if (n == 1) {
//            return 1;
//        } else if (n > 1 && n < 39) {
//            for (int i = 2; i < n - 1; i++) {
//                sum2 = sum1 + sum2;
//                sum1 = sum2 - sum1;
//            }
//
//            return sum1 + sum2;
//        }
//        return 0;
//    }


    public static int moreThanHalfNum(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.containsKey(arr[i])?map.get(arr[i])+1:1);
        }

        for (int key : map.keySet()){
            if(map.get(key) >= arr.length/2){
                return key;
            }
        }
        return -1;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * @param target
     * @return
     */
    public static int jumpFloor(int target){

        if(target == 0){
            return 0;
        }else if(target == 1){
            return 1;
        }else{
            return jumpFloor(target-1)+jumpFloor(target-2);
        }

    }

}
