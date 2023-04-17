package lab3.ArrayListVsLinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;

class Delete {
    public static void test(int count) {
        ArrayList<Integer> arrayList = ArrayListVsLinkedList.fillArrayList(count);
        LinkedList<Integer> linkedList = ArrayListVsLinkedList.fillLinkedList(count);
        System.out.println("Deleting the beginning:");

        long startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.remove(0);
        }
        long ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.removeFirst();
        }
        long LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");

        System.out.println(ArrayListVsLinkedList.dividingLine); // ===============================================

        arrayList = ArrayListVsLinkedList.fillArrayList(count);
        linkedList = ArrayListVsLinkedList.fillLinkedList(count);
        System.out.println("Deleting the middle:");

        startTime = System.nanoTime();
        for (int i = count - 1; i >= 0; --i) {
            arrayList.remove(i / 2);
        }
        ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = count - 1; i >= 0; --i) {
            linkedList.remove(i / 2);
        }
        LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");

        System.out.println(ArrayListVsLinkedList.dividingLine); // ===============================================

        arrayList = ArrayListVsLinkedList.fillArrayList(count);
        linkedList = ArrayListVsLinkedList.fillLinkedList(count);
        System.out.println("Deleting the end:");

        startTime = System.nanoTime();
        for (int i = count - 1; i >= 0; --i) {
            arrayList.remove(i);
        }
        ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.removeLast();
        }
        LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");
    }
}
