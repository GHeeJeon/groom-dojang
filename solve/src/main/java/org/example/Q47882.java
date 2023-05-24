package org.example;
import java.io.*;
/*
 * 헷갈리는 작대기
 * https://level.goorm.io/exam/47882/%ED%97%B7%EA%B0%88%EB%A6%AC%EB%8A%94-%EC%9E%91%EB%8C%80%EA%B8%B0/quiz/1
 *
 * 문제 자체는 간단하지만, String 과 String array, char 의 차이를 유의해야 한다.
 * if (input[i] == "|") 의 경우, array required, but String found 오류가 발생한다.
 * charAt() 매서드는 char 형을 반환한다!
 */
public class Q47882 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count_1 = 0;
        int count_I = 0;
        int count_l = 0;
        int count_bar = 0;

        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1')
                count_1++;
            else if (input.charAt(i) == 'I')
                count_I++;
            else if (input.charAt(i) == 'l')
                count_l++;
            else if (input.charAt(i) == '|')
                count_bar++;
        }
        System.out.print(count_1 + "\n" + count_I + "\n" + count_l + "\n" + count_bar);
    }
}
