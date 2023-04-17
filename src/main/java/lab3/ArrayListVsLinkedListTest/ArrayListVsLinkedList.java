package lab3.ArrayListVsLinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayListVsLinkedList {
    static String dividingLine = "============================";
    public static void test(int count) {
        System.out.println("Testing on " + count + " elements:");
        System.out.println(dividingLine);
        System.out.println("ArrayList\t||\tLinkedList");
        System.out.println(dividingLine);
        Add.test(count);
        System.out.println(dividingLine);
        System.out.println("ArrayList\t||\tLinkedList");
        System.out.println(dividingLine);
        Delete.test(count);
        System.out.println(dividingLine);
        System.out.println("ArrayList\t||\tLinkedList");
        System.out.println(dividingLine);
        Get.test(count);
        System.out.println(dividingLine);
        System.out.println("ArrayList\t||\tLinkedList");
        System.out.println(dividingLine);
        Sort.test(count);
        System.out.println(dividingLine);
        Clear.test(count);
        System.out.println(dividingLine);
    }

    public static ArrayList<Integer> fillArrayList(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < count; ++i) {
            arrayList.add(random.nextInt());
        }

        return arrayList;
    }

    public static LinkedList<Integer> fillLinkedList(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for(int i = 0; i < count; ++i) {
            linkedList.add(random.nextInt());
        }

        return linkedList;
    }
}
