package org.example;
import java.io.*;
/*
* 고장난 컴퓨터
* https://level.goorm.io/exam/49095/%EA%B3%A0%EC%9E%A5%EB%82%9C-%EC%BB%B4%ED%93%A8%ED%84%B0/quiz/1
*
* */

public class Q49095 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] NC = input.split("\\s");
        String input_time = br.readLine();
        String[] time = input_time.split("\\s");
        int answer = 1;
        int N = Integer.parseInt(NC[0]);
        int C = Integer.parseInt(NC[1]);

        for (int i = 0; i < N - 1; i++) { // 'i < N - 1' 유의, i + 1 을 비교해야해
            if ((Integer.parseInt(time[i + 1]) - Integer.parseInt(time[i])) > C)
                answer = 1;
            else
                answer++;
        }
        System.out.print(answer);
    }
}
