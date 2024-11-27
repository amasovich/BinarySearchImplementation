package com.bereza.binarysearch;

import java.util.Comparator;
import java.util.List;

/**
 * Класс MyCollections, предоставляющий методы для бинарного поиска в списках.
 */
public class MyCollections {

    /**
     * Выполняет бинарный поиск в отсортированном списке с использованием естественного порядка.
     *
     * @param list Список элементов, в котором выполняется поиск. Список должен быть отсортирован.
     * @param key Значение, которое необходимо найти в списке.
     * @param <T> Тип элементов, который должен реализовывать Comparable.
     * @return Индекс найденного элемента, или -(low + 1), если элемент не найден.
     *
     * Пример использования:
     * List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
     * int index = MyCollections.binarySearch(list, 30);  // Возвращает: 2
     */
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;  // Средний индекс
            T midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0) {
                low = mid + 1;  // Поиск в правой половине
            } else if (cmp > 0) {
                high = mid - 1;  // Поиск в левой половине
            } else {
                return mid;  // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }

    /**
     * Выполняет бинарный поиск в отсортированном списке с использованием переданного компаратора.
     *
     * @param list Список элементов, в котором выполняется поиск. Список должен быть отсортирован.
     * @param key Значение, которое необходимо найти в списке.
     * @param c Компаратор, задающий порядок элементов.
     * @param <T> Тип элементов.
     * @return Индекс найденного элемента, или -(low + 1), если элемент не найден.
     *
     * Пример использования:
     * List<Integer> list = Arrays.asList(50, 40, 30, 20, 10);
     * Comparator<Integer> reverseOrder = Comparator.reverseOrder();
     * int index = MyCollections.binarySearch(list, 30, reverseOrder);  // Возвращает: 2
     */
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;  // Средний индекс
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;  // Поиск в правой половине
            } else if (cmp > 0) {
                high = mid - 1;  // Поиск в левой половине
            } else {
                return mid;  // Элемент найден
            }
        }
        return -(low + 1);  // Элемент не найден
    }
}
