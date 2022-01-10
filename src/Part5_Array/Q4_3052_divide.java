package Part5_Array;
// 서로 다른 나머지가 몇개인지 출력
import java.util.ArrayList;
import java.util.Scanner;

public class Q4_3052_divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array_divde42 = new ArrayList<>(); // 42로 나눈 나머지 저장하는 List
        ArrayList<Integer> array_nonSame = new ArrayList<>(); // 같지 않은 나머지들을 저장하는곳

        for (int i=0; i<10; i++){
            array_divde42.add(sc.nextInt()%42);
        }
        for (int i=0; i<array_divde42.size(); i++){
            if(!array_nonSame.contains(array_divde42.get(i)))
                array_nonSame.add(array_divde42.get(i));
        }

        System.out.println(array_nonSame.size());
        /*
        * 16줄 해석 : array_divde42.get(i)를 통해서 42로 나눈 배열의 i값을 챙겨온다. 그리고
        *           array_nonSame.contains을 통해 해당값이 있으면 true를 리턴한다
        *           그런데 앞에 !연산자가 있으므로 반전이 된다
        *           -> 즉 해당 값이 없으면 true가 되서 if문이 동작을 하고 add함수를 통해
        *              nonSame리스트에 값을 추가한다
        * */

        //=================================================================================================
        //int[] array_10numbers = new int[10]; // 크기가10, 인덱스 번호랑 착오x

        /*for (int i=0; i< array_10numbers.length; i++){ // 입력을 받으면서 동시에 나누어 버린다
            array_10numbers[i] = sc.nextInt()%42;
        }

        int standard = 0; // 배열의 비교하는 곳의 인덱스 번호
        int count = 0; // 만약 서로 같으면 카운트를 증가시켜서 전체 길이에서 빼면 나머지가 다른 것의 총 수가 나온다
        int count_while = 0;

        while(count_while<array_10numbers.length){
            for(int i=0; i<array_10numbers.length; i++){
                if(array_10numbers[standard] == array_10numbers[i]){ // standrad도 상승함에 따라서 결국 i=2부터는 일정 반복이후에는 인덱스를 벗어난다
                    count++;
                }
            }
            standard++;
            count_while++;
            count--;
        }
        if(count<=-80){
            System.out.println(1);
        } else {
            System.out.println(array_10numbers.length-count);
        }*/


        /*int count = 0;
        int check = array_check[0];
        if(check == array_check[0+1])
            count++;*/

        /*for (int i=0; i< array_check.length; i++){
            System.out.println(array_check[i]);;
        }*/


    }
}
/*
* 1. int배열 내에서 그냥 비교
*    > 자신의 배열 그대로 자기와 비교
* 2. 새로운 배열을 등록해서비교
*   > 이것도 결국 기준숫자(즉, 배열은 인덱스번호로하기때문에 기준배열인덱스번호)와 비교되어지는 곳의숫자가 반드시 같을때가 온다
*     왜냐하면 나는 for문이나 while반복+변수값 증가를 사용한다. 즉 증가를 사용하게 되면 반드시 한번은 기준 숫자와 비교되어지는 곳의
*     숫자가 같아 지는 지점이 온다. 이것을 어떻게 해결 해야 할까
*  @@@해결방안@@@
*  1. 반복문 안에 if문을 두어서 인덱스번호가 서로 같아지면 넘긴다
*       > continue사용
* TLqkf 결국 배열이 아니고 List를 사용했다
*
* */