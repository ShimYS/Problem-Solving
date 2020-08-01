package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no1_java {
    public static void main(String[] args) {
        /*
            문제 설명
                수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

                1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
                2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
                3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

                1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

            제한 조건
                시험은 최대 10,000 문제로 구성되어있습니다.
                문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
                가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
            입출력 예
                answers	        return
                [1,2,3,4,5]	    [1]
                [1,3,2,4,2]	    [1,2,3]
         */
        int[] answers = {1,3,2,4,2};
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 각 학생별 정답 개수 구하기
        // 1번학생 count1, 2번학생 count2, 3번학생 count3
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) {
                count1++;
            }
            if (answers[i] == student2[i % student2.length]) {
                count2++;
            }
            if (answers[i] == student3[i % student3.length]) {
                count3++;
            }
        }
        
        // 최다득점 점수 구하기
        // 3명의 점수를 비교해서 가장 높은 점수를 구한다.
        int temp = count1;
        int arrayCount = 1;
        if(temp < count2) {
            temp = count2;
        }

        if(temp < count3) {
            temp = count3;
        }
        
        // 최다득점 점수와 동일한 점수를 받은 학생을 리스트에 저장하기
        List<Integer> listResult = new ArrayList<Integer>();
        if(temp == count1) {
            listResult.add(1);
        }
        if (temp == count2) {
            listResult.add(2);
        }
        if (temp == count3) {
            listResult.add(3);
        }

        // int[]에 담아서 출력하기
        int[] finalResult = new int[listResult.size()];
        for(int j=0; j<listResult.size(); j++){
            finalResult[j] = listResult.get(j);
        }
        System.out.println(finalResult.length);
    }
}