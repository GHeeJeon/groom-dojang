package org.example;

import java.io.*;
/*
 * 달달함이 넘쳐흘러
 * https://level.goorm.io/exam/159697/%EB%8B%AC%EB%8B%AC%ED%95%A8%EC%9D%B4-%EB%84%98%EC%B3%90%ED%9D%98%EB%9F%AC/quiz/1
 *
 * 긴 문제였지만, 어렵지 않았다.
 * a 🍰b = c 를 이용해 b를 도출하는 문제
 * */

public class Q159697 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int a_x = Integer.parseInt(a[0]);
        int a_y = Integer.parseInt(a[1]);
        int a_z = Integer.parseInt(a[2]);
        String[] c = br.readLine().split(" ");
        int c_x = Integer.parseInt(c[0]);
        int c_y = Integer.parseInt(c[1]);
        int c_z = Integer.parseInt(c[2]);

        System.out.print((c_x - a_z) + " " + (c_y / a_y) + " " + (c_z - a_x));
    }
}
