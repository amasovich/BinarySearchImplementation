package com.bereza.binarysearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyCollectionsTest {
    public static void main(String[] args) {
        // Создаем тестовый список для тестирования методов бинарного поиска
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i * 10); // Добавляем значения: 0, 10, 20, 30, ...
        }

        // Тестируем метод binarySearch с естественным порядком
        System.out.println("Тестирование binarySearch с естественным порядком:");
        int index = MyCollections.binarySearch(list, 30);
        System.out.println("Индекс элемента 30: " + index); // Ожидается: 3

        index = MyCollections.binarySearch(list, 35);
        System.out.println("Индекс элемента 35 (не найден): " + index); // Ожидается: -5 (место вставки)

        // Тестируем метод binarySearch с переданным компаратором
        System.out.println("Тестирование binarySearch с пользовательским компаратором:");
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();
        List<Integer> reverseList = new ArrayList<>(list);
        reverseList.sort(reverseOrder);

        index = MyCollections.binarySearch(reverseList, 30, reverseOrder);
        System.out.println("Индекс элемента 30 в обратном порядке: " + index); // Ожидается: 6

        index = MyCollections.binarySearch(reverseList, 35, reverseOrder);
        System.out.println("Индекс элемента 35 в обратном порядке (не найден): " + index); // Ожидается: -8 (место вставки)
    }
}
