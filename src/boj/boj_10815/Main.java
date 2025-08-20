package boj.boj_10815;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 숫자 카드는 정수 하나가 적혀있는 카드
        // 상근이는 N개의 숫자카드 가지고 있다.
        // 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고있는지 아닌지를 구하여라

        Scanner sc = new Scanner(System.in);
        // 상근이 숫자카드
        int n = sc.nextInt();
        List<Integer> listN = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listN.add(sc.nextInt());
        }
        // 입력받은 숫자카드
        int m = sc.nextInt();
        List<Integer> listM = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            listM.add(sc.nextInt());
        }

        // set으로 변환해줘야함
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            listResult.add(0);
        }


        for (int i = 0; i < listM.size(); i++) {
            for (int j = 0; j <listN.size(); j++) {
                if (listM.get(i).equals(listN.get(j))) {
                    listResult.set(i, 1);
//                    System.out.println(i + "번째 인덱스 값 : " + listResult.get(i));
                    break;  // 맞는값 찾으면 바로 중단
                }
            }
        }

        for (Integer result : listResult){
            System.out.print(result + " ");
        }

        // 전부 값이 0이 나와버림
        // 그래서 for문을 프린트로 찍어보니 반복(비교하면서)는 문제가 없음.
        // 결국 문제는 조건문에 들어있는 조건이 문제임
        // 전부 다 else로 빠짐
        // 프린트를 찍어보니 다르면 전부 0으로 리스트 값들이 바뀌어서 결국 서로 비교했을때 맞는값이 하나도 없어버리는 문제가 발생함
        // 그래서 리스트를 하나 더 만들고 거기다가 저장을 하면 좋을꺼같다 라는 생각을 함
        // m만큼의 인덱스, 값은 0으로 리스트를 생성함 (listResult)
        // 서로 값을 비교했을 때, 동일하면 listResult의 동일한 i 인덱스에 1값을 넣어주고 브레이크 시켜줌
        // list로 썻는데 시간초과 나와서 또 프린트 문제인가 했는데 아니였음
        // set으로 해야하는 문제였음..



    }
}
