package com.example.binarysearch;

import java.util.Comparator;

/**
 * Класс Arrays реализует методы бинарного поиска для различных типов данных,
 * включая примитивные типы и обобщенные массивы с использованием Comparator.
 */
public class Arrays {

    private static <T> int genericBinarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {
        // Границы поиска
        int low = fromIndex;
        int high = toIndex - 1;

        // Начало алгоритма бинарного поиска
        while (low <= high) {
            // Вычисление среднего индекса, избегая переполнения
            int mid = low + ((high - low) >>> 1);
            T midVal = a[mid];

            // Сравнение среднего элемента с ключом
            int cmp = comparator.compare(midVal, key);

            if (cmp < 0) {
                // Если средний элемент меньше ключа, ищем в правой половине
                low = mid + 1;
            } else if (cmp > 0) {
                // Если средний элемент больше ключа, ищем в левой половине
                high = mid - 1;
            } else {
                // Элемент найден, возвращаем его индекс
                return mid;
            }
        }
        // Элемент не найден, возвращаем отрицательное значение, которое указывает позицию для вставки
        return -(low + 1);
    }

    private static int genericBinarySearch(byte[] a, int fromIndex, int toIndex, byte key, Comparator<Byte> comparator) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            byte midVal = a[mid];
            int cmp = comparator.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // элемент найден
            }
        }
        return -(low + 1); // элемент не найден
    }

    public static int binarySearch(byte[] a, byte key) {
        return genericBinarySearch(a, 0, a.length, key, Byte::compare);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return genericBinarySearch(a, fromIndex, toIndex, key, Byte::compare);
    }

    public static int binarySearch(char[] a, char key) {
        return genericBinarySearch(a, 0, a.length, key, Character::compare);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return genericBinarySearch(a, fromIndex, toIndex, key, Character::compare);
    }

}
