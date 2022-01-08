package Part3_For;

import java.util.StringTokenizer;

public class ex {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            int check=5;
            for(int j=0; j<5; j++){
                System.out.print(" ");
            }
            for(int k=check; k>0; k--){
                System.out.println("*");
            }
            System.out.println();
            check--;
        }
    }
}
