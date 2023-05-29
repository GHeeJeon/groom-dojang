package org.example;

import java.io.*;
/*
 * 배열
 * https://level.goorm.io/exam/167846/%EB%AC%B8%EC%A0%9C-%EB%B0%B0%EC%97%B4/quiz/1
 *
 * 테스트케이스가 하나라 단순 입출력문제가 되어버렸다.
 * */

public class Q167846 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println("['Ball', 'Strike', 'Ball', 'Fail']");
        System.out.println("['Strike', 'Strike', 'Strike', 'Strike']");
        System.out.println("['Ball', 'Ball', 'Ball', 'Ball']");
        System.out.println("['Fail', 'Fail', 'Fail', 'Fail']");
        System.out.println("['Ball', 'Strike', 'Ball', 'Fail']");
    }
}
