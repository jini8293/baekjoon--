package a_입출력과_사칙연산;
import java.util.Scanner;

//준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
//첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.


import java.util.Scanner;

public class a3 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String result = sc.next();
      System.out.println(result+"??!");
  }
}

