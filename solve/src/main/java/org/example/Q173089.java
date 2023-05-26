package org.example;

import java.io.*;

/*
 * 정수의 길이
 * https://level.goorm.io/exam/173089/%EC%A0%95%EC%88%98%EC%9D%98-%EA%B8%B8%EC%9D%B4/quiz/1
 *
 * 굳이 음수 판별해서 길이 + 1 해줄 필요가 있나?
 * 그냥 스트링으로 받아와서 길이 출력하면 되지!
 * */

public class Q173089 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input.length());
    }
}
