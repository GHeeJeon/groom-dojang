package org.example;
import java.io.*;
import java.util.*;
/*
* 막대기
* https://level.goorm.io/exam/48193/%EB%A7%89%EB%8C%80%EA%B8%B0/quiz/1
* 인덱스 에러가 나지 않도록 유의할 것
* */

public class Q48193 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> testList = new ArrayList<Integer>();
        int current = 0;
        int answer = 1;

        for (int i = 0; i < N; i++) {
            testList.add(Integer.parseInt(br.readLine()));
        }
        for (int j = 0; j < N; j++) {
            if (current < testList.get(N - 1 - j))
                current = testList.get(N - 1 - j);
            if (N - 1 - j == 0)
                break;
            if (testList.get(N - 1 - j - 1) > current) {
                answer = answer + 1;
            }
        }
        System.out.println(answer);
    }
}
