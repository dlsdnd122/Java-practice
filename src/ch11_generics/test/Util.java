package ch11_generics.test;

import java.util.Arrays;

public class Util {
    // 배열 인덱스 순서 스왑해주는 메서드
    public static <T> void swap(T[] array, int index1, int index2) {
        T[] arr = array;
        T tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        Util.swap(a, 0, 2);
        System.out.println(Arrays.toString(a));

        String[] b = {"테", "스", "트"};
        Util.swap(b, 1, 2);
        System.out.println(Arrays.toString(b));
    }
}
