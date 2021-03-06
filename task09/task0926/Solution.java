package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] a1 = {1,2,3,4,5};//создаем массивы
        int[] a2 = {1,2};
        int[] a3 = {1,2,3,4};
        int[] a4 = {1,2,3,4,5,6,7};
        int[] a5 = {};

        list.addAll(Arrays.asList(a1,a2,a3,a4,a5));// сделали список из массивов, добавили их в основной список
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
