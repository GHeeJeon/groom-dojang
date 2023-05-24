package org.example;
import java.io.*;
/*
 * 구름 크기 출력하기
 * https://level.goorm.io/exam/150332/%ED%98%84%EB%8C%80%EB%AA%A8%EB%B9%84%EC%8A%A4-%EB%AA%A8%EC%9D%98%ED%85%8C%EC%8A%A4%ED%8A%B8-%EA%B5%AC%EB%A6%84-%ED%81%AC%EA%B8%B0-%EC%B8%A1%EC%A0%95%ED%95%98%EA%B8%B0/quiz/1
 *
 * 문자열을 문자로 떼내고, 이를 정수형으로 바꿔야 한다.
 * string array 를 int array 로 한꺼번에 변환해 풀어도 되지만,
 * 굳이 그럴 필요 있나? for 문 돌리면서 요소를 그때그때 곱해버리면 되지
 * */
public class Q150332 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 1;

        String[] arr = input.split("\\s+");
        for(String s : arr) {
            answer = answer * Integer.parseInt(s);
        }
        System.out.print(answer);
    }
}
