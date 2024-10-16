package c_반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//각 테스트 케이스마다 A+B를 출력한다.

public class c2 {
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st; //문자열을 특정 구분자로 나누는 클래스
		StringBuilder sb = new StringBuilder(); //문자열을 효율적으로 연결하거나 수정할 때 사용하는 클래스
 
		for (int i = 0; i < N; i++) {
			//문자열을 특정 구분자로 나눔 -> " " 공백을 기준으로 나눔
			/*
			무조건 for문 안에 써줘야함 -> 
			1. for문에서 각 반복마다 새로운 한 줄을 입력받아야함, 그 줄에서 두 숫자를 나눠 사용해야 하므로, st도 매번 초기화되어야함
			2. StringTokenizer는 한 번 사용하면 끝임, 하나의 줄에서만 작동하기 때문에, 새로운 줄이 입력될 때마다 새로운 st객체 만들어야함
			*/
			st = new StringTokenizer(br.readLine(), " ");
			//두 숫자를 읽고 더한뒤 StringBuilder에 추가
			//st.nextToken() -> 공백으로 나뉜 문자열 중 하나의 토큰을 반환
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			//숫자 두 개를 더한 결과를 출력할 때, 줄바꿈 추가
			sb.append('\n');
		}
 
		System.out.println(sb);
    }
}
