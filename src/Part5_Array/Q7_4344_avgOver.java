package Part5_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Q7_4344_avgOver {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("테스트 케이스 입력: ");
        int C = sc.nextInt(); // 테스트 케이스
        int counter_while=0;
        double[] overAvg = new double[C];

        while(counter_while<C){
            //System.out.print("학생 수 입력: ");
            int N = sc.nextInt(); // 학생수  cf)테스트케이스와 다르다

            int[] num_array = new int[N];
            int sum =0;
            double counter_overAvg=0.0;
            double avg = 0.0;

            for (int i=0; i<N; i++){ // num_array에 학생들 점수 추가
                //System.out.print(i+1+"번학생 점수입력: ");
                num_array[i] = sc.nextInt();
            }
            for (int i : num_array){ // 학생들 점수 총합 sum에 저장
                sum += i;
            }
            avg = sum / N; // avg에 평균값 double로 저장

            for (int i : num_array){ // 배열에 저장되어 있는 학생의 점수가 평균보다 크면 카운터 증가
                if (i > avg){
                    counter_overAvg++; //평균을 넘는 학생을 저장
                }
            }
            overAvg[counter_while] = (counter_overAvg/N) * 100; // 평균넘는 학생을 저장중인 배열에 평균을 넘는 학생들 비율을 계산한 공식 대입해서 넣기
            counter_while++;
        }
        for (double i : overAvg){ // 평균넘는 학생 배열 출력
            System.out.println(String.format("%.3f",i)+"%");
        }
    }
}
/*
* 평균을 넘는 비율?
* 1. 평균값을 구한다
* 2. 각 배열별로 돌아가면서 평균값을 넘는지 검사하고, 넘으면 count를 하나 증가시킨다
* 3. count/학생수 * 100 해서 비율을 구한다
* */