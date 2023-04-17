package lab3.ArrayListVsLinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс тестирования ArrayList и LinkedList на добавление
 */
class Add {
    /**
     * Статический метод тестирования ArrayList и LinkedList на добавление
     */
    public static void test(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Adding to the beginning:");

        long startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.add(0, i);
        }
        long ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.addFirst(i);
        }
        long LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");

        System.out.println(ArrayListVsLinkedList.dividingLine); // ===============================================

        arrayList.clear();
        linkedList.clear();
        System.out.println("Adding to the middle:");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.add(i / 2, i);
        }
        ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.add(i / 2, i);
        }
        LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");

        System.out.println(ArrayListVsLinkedList.dividingLine); // ===============================================

        arrayList.clear();
        linkedList.clear();
        System.out.println("Adding to the end:");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            arrayList.add(i, i);
        }
        ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        for (int i = 0; i < count; ++i) {
            linkedList.addLast(i);
        }
        LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");
    }
}
