package com.javarush.task.task10.task1003;

/* 
Задача №3 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte)i + f);//после 127 в типе байт идет -128. Получается -128 +128
        System.out.println(b);
    }
}
