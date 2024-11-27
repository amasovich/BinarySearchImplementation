package com.bereza.binarysearch;

import java.util.Comparator;

/**
 * Класс MyArrays реализует методы бинарного поиска для различных типов данных,
 * включая примитивные типы и обобщенные массивы с использованием Comparator.
 */
public class MyArrays {

    /**
     * Обобщенный метод бинарного поиска для различных типов массивов объектов.
     *
     * @param <T> тип элементов массива
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @param comparator компаратор для сравнения элементов
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
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

    /**
     * Перегруженный метод бинарного поиска для массива byte.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            byte midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /**
     * Перегруженный метод бинарного поиска для массива char.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            char midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /**
     * Перегруженный метод бинарного поиска для массива double.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            double midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /**
     * Перегруженный метод бинарного поиска для массива float.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            float midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /**
     * Перегруженный метод бинарного поиска для массива int.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // элемент найден
            }
        }
        return -(low + 1); // элемент не найден
    }

    /**
     * Перегруженный метод бинарного поиска для массива long.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            long midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // элемент найден
            }
        }
        return -(low + 1); // элемент не найден
    }

    /**
     * Перегруженный метод бинарного поиска для массива short.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    private static int genericBinarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            short midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

    /**
     * Метод бинарного поиска для массива byte.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(byte[] a, byte key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива byte.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для массива char.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(char[] a, char key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива char.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для массива double.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(double[] a, double key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива double.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для массива float.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(float[] a, float key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива float.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для массива int.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(int[] a, int key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива int.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для массива long.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(long[] a, long key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива long.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для массива short.
     *
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(short[] a, short key) {
        return genericBinarySearch(a, 0, a.length, key);
    }

    /**
     * Метод бинарного поиска для части массива short.
     *
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return genericBinarySearch(a, fromIndex, toIndex, key);
    }

    /**
     * Метод бинарного поиска для обобщенных массивов с использованием Comparator.
     *
     * @param <T> тип элементов массива
     * @param a массив, в котором выполняется поиск
     * @param key элемент, который необходимо найти
     * @param c компаратор для сравнения элементов
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return genericBinarySearch(a, 0, a.length, key, c);
    }

    /**
     * Метод бинарного поиска для части обобщенного массива с использованием Comparator.
     *
     * @param <T> тип элементов массива
     * @param a массив, в котором выполняется поиск
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key элемент, который необходимо найти
     * @param c компаратор для сравнения элементов
     * @return индекс найденного элемента или отрицательное значение, указывающее место вставки
     */
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        return genericBinarySearch(a, fromIndex, toIndex, key, c);
    }

}
