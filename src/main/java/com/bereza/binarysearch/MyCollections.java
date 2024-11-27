package com.bereza.binarysearch;

import java.util.Comparator;
import java.util.List;

/**
 * Класс MyCollections, предоставляющий методы для бинарного поиска в списках.
 */
public class MyCollections {

    // Выполняет бинарный поиск в отсортированном списке с использованием естественного порядка
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

    // Выполняет бинарный поиск в отсортированном списке с использованием переданного компаратора
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
