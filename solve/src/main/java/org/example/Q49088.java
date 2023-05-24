package org.example;
import java.io.*;
/*
* 의좋은 형제
* https://level.goorm.io/exam/49088/%EC%9D%98%EC%A2%8B%EC%9D%80-%ED%98%95%EC%A0%9C/quiz/1
*
* 형변환 문제
* 문자열에서 문자를 떼내고, 더블형으로 바꿔 연산하고, 다시 정수형으로 바꾸고
* 굳이 다시 문자로 바꿔서 문자열에 넣고, 그 문자를 출력할 필요가 없다.
* 사이에 공백만 있으면 된다잖아! 바로 뱉어내란 말야!
* */

public class Q49088 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int D = Integer.parseInt(br.readLine());

        String[] arr = input.split("\\s+");
        double J = Double.parseDouble(arr[0]);
        double S = Double.parseDouble(arr[1]);
        for(int i = 0; i < D; i++) {
            if (i % 2 == 0) {
                S = S + Math.ceil(J / 2);
                J = J - Math.ceil(J / 2);
            }
            else {
                J = J + Math.ceil(S / 2);
                S = S - Math.ceil(S / 2);
            }
        }
        System.out.print((int)J + " " + (int)S);
    }
}
