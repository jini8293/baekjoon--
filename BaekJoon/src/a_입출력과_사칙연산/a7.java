package a_입출력과_사칙연산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//(세 자리 수) × (세 자리 수)
public class a7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();

        System.out.println(x+y+z);

    } 
    public static void main2(String[] args) throws IOException {
        // 한 줄의 입력을 버퍼로 읽고, 공백으로 구분하여 문자열 배열에 저장  ---> 왜 다들 버퍼를 쓰는거지??
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String data[] = br.readLine().split(" ");

        // A, B, C는 최대 10의 12승이므로 long 타입에 저장해야함
        // 문자열을 long 타입으로 변환하기 위해서는 Long.parseLong() 메서드 사용
        long a = Long.parseLong(data[0]);
        long b = Long.parseLong(data[1]);
        long c = Long.parseLong(data[2]);

        System.out.println(a + b + c);
    }
}
