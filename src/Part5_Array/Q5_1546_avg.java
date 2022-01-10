package Part5_Array;


import java.util.Arrays;
import java.util.Scanner;

public class Q5_1546_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시험과목 개수
        double[] scores = new double[N]; // 원본배열 -> sort를 통해서 최대값 구하기
        double[] scores_copy = new double[N]; // 원본배열 카피 >> 조작할 때 원점수 필요한데 그떄 사용
        double[] scores_new = new double[N]; // 조작한 점수 저장 배열

        double max_scores=0.0;
        double sum = 0.0;

        for (int i=0; i<scores.length; i++){ // 원점수 입력
            scores[i] = sc.nextInt();
        }
        System.arraycopy(scores, 0, scores_copy, 0, scores.length); // 원점수 복사한 배열
        Arrays.sort(scores); // 원점수 정렬시킴(값변함)
        max_scores = scores[N-1]; // 변형시킨 원점수에서 최대값 구하기

        for (int i=0; i<scores.length; i++){
            scores_new[i] = scores_copy[i] / max_scores * 100; // scores_new에 저장이 안됨
        }
        for (int i=0; i<scores.length; i++){
            sum += scores_new[i]; // scores_new에 저장이 안됨
        }
        System.out.println(sum/scores_new.length);
    }
}
