package org.example;
import java.io.*;
/*
 * 정사각형의 개수
 * https://level.goorm.io/exam/49086/%EC%A0%95%EC%82%AC%EA%B0%81%ED%98%95%EC%9D%98-%EA%B0%9C%EC%88%98/quiz/1
 *
 * 생각보다 정수 N이 크고, 답의 자릿수가 N*N, 더더 크다.
 * int 로는 부족하다.
 * */

public class Q49086 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt((br.readLine()));
        long answer = 0;
        for (int i = 1; i <= input; i++) {
            long temp = (long)i * i;
            answer = answer + temp;
        }
        System.out.println(answer);
    }
}
