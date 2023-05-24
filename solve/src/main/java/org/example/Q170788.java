package org.example;
import java.io.*;
/*
 * 두 정수 더하기
 * https://level.goorm.io/exam/170788/%EB%91%90-%EC%A0%95%EC%88%98-%EB%8D%94%ED%95%98%EA%B8%B0/quiz/1
 * */
public class Q170788 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] words = input.split("\\s");
        int answer = 0;

        for (String wo : words){
            answer = answer + Integer.parseInt(wo);
        }
        System.out.print(answer);
    }
}
