package ch10_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 객체를 저장
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 리스트에 저장된 객체 수 출력
        System.out.println("총 객체 수 : " + list.size());
        System.out.println();

        // 리스트 특정 인덱스 객체를 출력
        System.out.println("Skill : " + list.get(2));
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + "번째" + " : " + str);
        }
        System.out.println();

        // 2번 인덱스(Servlet/JSP) 삭제
        list.remove(2);
        // 그 다음 2번 인덱스(DMBS) 삭제
        list.remove(2);
        // Java라는 값을 가진 인덱스 삭제
        list.remove("Java");

        // 남은 인덱스는 2개 (3개를 삭제했음)
        // 결과 값을 보면 알겠지만 인덱스들이 당겨진다.
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("삭제 후 " + i + "번째 : " + str);
        }

    }
}
