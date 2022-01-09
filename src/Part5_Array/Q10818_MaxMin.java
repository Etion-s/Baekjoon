/*
* N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오
* 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.*/
package Part5_Array;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10818_MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 출력할것은 버퍼가 아닌 array임으로 삭제
        StringTokenizer st;

        // int max =0, min = 1000001; //sort메소드 사용으로 인한 삭제
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        st = new StringTokenizer(br.readLine());
        int index = 0;
        while(st.hasMoreTokens()){ // .hasMoreTokens메소드는 토큰남아있으면 true, 아니면 false
            array[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(array);
        System.out.println(array[0]+" "+array[N-1]);

        /*for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<N; i++){
            if (array[i]>max)
                max = array[i];
        }
        for (int i=0; i<N; i++){
            if (array[i]<min)
                min = array[i];
        }
        bw.write(String.valueOf(min)+" ");
        bw.write(String.valueOf(max));*/ // sort사용으로 인해 for문을 통한 대입 x


        br.close();


    }
}
