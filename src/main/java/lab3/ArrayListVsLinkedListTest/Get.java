package lab3.ArrayListVsLinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;

class Get {
    public static void test(int count) {
        ArrayList<Integer> arrayList = ArrayListVsLinkedList.fillArrayList(count);
        LinkedList<Integer> linkedList = ArrayListVsLinkedList.fillLinkedList(count);
        System.out.println("Getting from the beginning:");

        long startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.get(0);
        }
        long ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.getFirst();
        }
        long LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");

        System.out.println(ArrayListVsLinkedList.dividingLine); // ===============================================

        System.out.println("Getting from the middle:");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.get(count / 2);
        }
        ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.get(count / 2);
        }
        LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");

        System.out.println(ArrayListVsLinkedList.dividingLine); // ===============================================

        System.out.println("Getting from the end:");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.get(count - 1);
        }
        ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.getLast();
        }
        LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");
    }
}
