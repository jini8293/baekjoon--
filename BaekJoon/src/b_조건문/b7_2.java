package b_조건문;

import java.util.Scanner;

public class b7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            // 세 숫자가 모두 같을 때
            System.out.println(10000 + a * 1000);
        } else if (a == b || a == c) {
            // 두 숫자가 같을 때 (a가 다른 두 숫자와 같을 경우)
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            // 두 숫자가 같을 때 (b와 c가 같을 경우)
            System.out.println(1000 + b * 100);
        } else {
            // 세 숫자가 모두 다를 때 최댓값 구하기
            //Math.max()함수 -> Math.max(x,y)는 두 값 x, y중에 더 큰 값을 반환하는 함수
            //즉, a,와 b,c를 3개 다 비교하는 셈!
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}
