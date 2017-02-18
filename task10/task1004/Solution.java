package com.javarush.task.task10.task1004;

/* 
Задача №4 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);//48(числовое представление "0")+9=57
        System.out.println((char)nine);//чаровое представление 57 это 9
    }
}
