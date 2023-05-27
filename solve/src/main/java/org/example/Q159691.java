package org.example;

import java.io.*;
/*
 * 접시 안의 원
 * https://level.goorm.io/exam/159691/%EC%A0%91%EC%8B%9C-%EC%95%88%EC%9D%98-%EC%9B%90/quiz/1
 *
 * 피타고라스의 정리 응용 문제
 * (0.5 * t)^2 + b^2 = a^2 를 이용하여
 * a^2 - b^2 를 출력하는 문제
 * Math.round() 는 주어진 인자와 가장 가까운 "int" 값을 반환한다.
 * 따라서, 3.0 와 같은 상황을 고려할 필요 없이 바로 출력한다. 3으로 바로 나오니까!
 * */

public class Q159691 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double T = Double.parseDouble(br.readLine());

        System.out.println(Math.round((0.5 * T) * (0.5 * T)));
    }
}
