package ch10_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Servlet/JSP");
        set.add(new String("Java"));
        set.add("DBMS");

        System.out.println("총 객체 수 : " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("DBMS");
        set.remove("Java");
        System.out.println("총 객체 수 : " + set.size());

        iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }

    }
}
