package Part3_For;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String star = "*";
        String blank =" ";
        int n = sc.nextInt(); // 5

        for (int i=1; i<=n; i++){ // 줄을 바꿔주는 for문
            for (int j=1; j<=n-i; j++){
                System.out.print(blank);
            }
            for (int k=1; k<=i; k++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
