package org.example;
import java.io.*;
/*
* 대소문자 바꾸기
* https://level.goorm.io/exam/174732/%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90-%EB%B0%94%EA%BE%B8%EA%B8%B0/quiz/1
*
* 굳이 아스키 값 더하기 빼기 안 해도 되는구나!
* */

public class Q174732 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuffer answer = new StringBuffer(S);

        for(int i = 0; i < N; i++) {
            if(Character.isLowerCase(S.charAt(i))) {
                answer.setCharAt(i, Character.toUpperCase(S.charAt(i)));
            }
            else if(Character.isUpperCase(S.charAt(i))) {
                answer.setCharAt(i, Character.toLowerCase(S.charAt(i)));
            }
        }
        System.out.println(answer);
    }
}
