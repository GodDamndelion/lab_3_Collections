package lab3.ArrayListVsLinkedListTest;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс тестирования ArrayList и LinkedList на очистку
 */
class Clear {
    /**
     * Статический метод тестирования ArrayList и LinkedList на очистку
     */
    public static void test(int count) {
        ArrayList<Integer> arrayList = ArrayListVsLinkedList.fillArrayList(count);
        LinkedList<Integer> linkedList = ArrayListVsLinkedList.fillLinkedList(count);
        System.out.println("Clearing:");

        long startTime = System.nanoTime();
        arrayList.clear();
        long ArrayListStopTime = System.nanoTime() - startTime;
        System.out.print(ArrayListStopTime + (ArrayListStopTime < 10000000 ? "\t" : "") + "\t||\t");

        startTime = System.nanoTime();
        linkedList.clear();
        long LinkedListStopTime = System.nanoTime() - startTime;
        System.out.println(LinkedListStopTime);

        if (ArrayListStopTime == LinkedListStopTime)
            System.out.println("Draw!");
        else
            System.out.println(ArrayListStopTime < LinkedListStopTime ? "ArrayList wins!" : "LinkedList wins!");
    }
}
