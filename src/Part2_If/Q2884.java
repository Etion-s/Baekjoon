/*
* 원래 설정한 시간보다 45분 먼저 알람이 울리게 하는 프로그램*/

package Part2_If;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        H *= 60;
        int HM = H + M;

        if(HM-45>=0){
            HM -= 45;
            int h1 = HM/60;
            int m1 = HM%60;
            System.out.println(h1 + " " + m1);
        } else{
            HM -= 45;
            int h1 = 23;
            int m1 = 60 + HM;
            System.out.println(h1 + " " + m1);
        }
    }
}