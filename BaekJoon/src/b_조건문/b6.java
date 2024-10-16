package b_조건문;
import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        if (a<30 && m<=30){
            m += a;
            System.out.println(h + " " + m);
        }else{
            int c = m+a;
            int d = c-60;
            if(d==60){
                m=0;
                if(h==23){
                    h=0;
                    h+=1;
                }else{
                    h+=2;
                }
            }else if(d>60){
                m = d-60;
                if(h==23){
                    h=0;
                    h+=1;
                }else{
                    h+=2;
                }
            }else{
                m = d;
                if(h==23){
                    h=0;
                }else{
                    h+=1;
                }
            }
            System.out.println(h + " " + m);
        }
    }
}
