package Part5_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Q6_8958_OX {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in); -> 백준으로 채점하려고 하니 런타임에러 발생
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count=0;
        int[] sum_array = new int[N];


        while(count<N){
            String str_OX = br.readLine();
            char[] OX_char = str_OX.toCharArray(); // 읽은 문자열을 char배열로 전환
            int OX_countinue_counter=0;
            int sum=0;
            for (int i=0; i<OX_char.length; i++){
                if(OX_char[i]=='O'){
                    OX_countinue_counter++;
                    sum += OX_countinue_counter;
                } else {
                    OX_countinue_counter =0;
                }
            }
            sum_array[count] = sum;
            count++;
        }
        br.close();
        for(int i : sum_array){
            System.out.println(i);
        }

    }
}
