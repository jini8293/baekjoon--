package c_반복문;

import java.util.Scanner;

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

public class c3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         //System.out.print(n!=1 ? (n*(n+1))/2 : 1); 써도 됨.
         
         int sum = 0;
         
         for (int i = 1; i < n+1; i++) {
        	 sum += i;
         }
         
         System.out.println(sum);
         sc.close();
    }
}
