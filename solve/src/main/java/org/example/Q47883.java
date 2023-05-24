package org.example;
import java.io.*;
import java.util.StringTokenizer;
import org.apache.commons.lang3.StringUtils;

/*
 * 단어의 개수 세기
 * https://level.goorm.io/exam/47883/%EB%8B%A8%EC%96%B4%EC%9D%98-%EA%B0%9C%EC%88%98-%EC%84%B8%EA%B8%B0/quiz/1
 * */

public class Q47883 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input," ");

        System.out.println(st.countTokens());
    }

    /* 코테 환경에서는 StringUtils 를 못 쓰니까...
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input = br.readLine();
	String input_strip = input.strip();
	String[] words = input_strip.split("\\s+");

	if (StringUtils.isBlank(input_strip)) 예외처리 - 문자열이 "" 인 경우
		System.out.print(0);
	else
	    System.out.print(words.length);
	}
    */

}
