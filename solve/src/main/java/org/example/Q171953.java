package org.example;

import java.io.*;
/*
 * 대문자 만들기
 * https://level.goorm.io/exam/e/%EB%8C%80%EB%AC%B8%EC%9E%90-%EB%A7%8C%EB%93%A4%EA%B8%B0/quiz/1
 * */

public class Q171953 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuffer answer = new StringBuffer(S);

        for (int i = 0; i < N; i++) {
            if (Character.isLowerCase(S.charAt(i))) {
                answer.setCharAt(i, Character.toUpperCase(S.charAt(i)));
            }
        }
        System.out.println(answer);
    }
}
