package a_입출력과_사칙연산;

import java.util.Scanner;


//(세 자리 수) × (세 자리 수)
public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x*(y%10));
        System.out.println(x*((y%100)/10));
        System.out.println(x*(y/100));
        System.out.println(x*y);

    } 
}

