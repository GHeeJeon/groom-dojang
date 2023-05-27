package org.example;

import java.io.*;
/*
 * 별 찍기
 * https://level.goorm.io/exam/167341/%EB%B3%84%EC%B0%8D%EA%B8%B0/quiz/1
 *
 * 굳이 바로 출력해줄 필요가 없다. 한 줄 완성하면 그 때 개행과 함께 출력하기!
 * */

public class Q167341 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String stars = "";
            for (int j = 1; j <= N - i; j++)
                stars = stars + " ";
            for (int j = 1; j <= i; j++)
                stars = stars + "*";

            System.out.println(stars);
        }
    }
}
