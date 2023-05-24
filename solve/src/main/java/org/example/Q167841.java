package org.example;
import java.io.*;
/*
 * 반복과 조건
 * https://level.goorm.io/exam/167841/%EB%AC%B8%EC%A0%9C-%EB%B0%98%EB%B3%B5%EA%B3%BC-%EC%A1%B0%EA%B1%B4/quiz/1
 * */
public class Q167841 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int input_int = Integer.parseInt(input);

        for (int i = 1; i <= input_int; i++) {
            for (int j = 1; j <= input_int; j++) {
                if (i == j || i + j == input_int + 1)
                    System.out.print(i);
                else
                    System.out.print(0);
            }
            if (i != input_int)
                System.out.println();
        }
    }
}

