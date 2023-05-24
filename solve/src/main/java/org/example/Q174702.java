package org.example;
import java.io.*;
/*
 * A + B
 * https://level.goorm.io/exam/174702/a-b/quiz/1
 *
 * 음수도 고려해야 한다. 풀이는 170788과 동일하다.
 * 입력 문자열에 정확한 음수 부호(-)가 있었기 때문에
 * split() 으로 "-7" 을 떼어내 parseInt() 로 음수 -7을 표현할 수 있었다.
 * 만약 주어지는 입력값이 "5 ㅡ7", "─1 ―2" 과 같은, 정확한 음수 부호(-)가 아닌 경우
 * 정규식이나 StringUtils 를 활용해 해당 부호를 정확한 음수 부호로 바꿔주는 작업이 필요하다.
 * */
public class Q174702 {
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
