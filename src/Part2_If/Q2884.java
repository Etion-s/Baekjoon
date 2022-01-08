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

        if (M-45>=0){
            M = M-45;
            H--;
            if(H<0)
                H=23;
            System.out.println(H + " " + M);
        }
        else{
            int M1 = 45 - M;
            M = 60 - M1;
            H--;
            if(H<0)
                H=23;
            System.out.println(H + " " + M);
        }
    }
}
