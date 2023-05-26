package org.example;

import java.io.*;
/*
 * 별찍기-12
 * https://level.goorm.io/exam/159695/%EB%B3%84-%EC%B0%8D%EA%B8%B0-12/quiz/1
 * */

public class Q159695 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int k = 1; k < N - i; k++)
                System.out.print(" ");
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (int i = 1; i < N; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = 0; j < N - i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
