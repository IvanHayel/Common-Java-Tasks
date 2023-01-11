package field.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySort {
  // Dual-pivot quicksort algorithm
  public static void sortArrayDefault(int[] array) {
    Arrays.sort(array);
  }

  // Merge sort based on fork/junction pool
  public static void sortArrayParallel(int[] array) {
    Arrays.parallelSort(array);
  }

  // Bubble sort (for)
  public static void sortArrayBubbleFirstOption(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  // Bubble sort (while)
  public static void sortArrayBubbleSecondOption(int[] array) {
    boolean swapped = true;
    int j = 0;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < array.length - j; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          swapped = true;
        }
      }
    }
  }

  // Bubble sort (with Comparator)
  public static <T> void sortArrayBubbleThirdOption(T[] array, Comparator<? super T> comparator) {
    boolean swapped = true;
    int j = 0;
    while (swapped) {
      swapped = false;
      j++;
      for (int i = 0; i < array.length - j; i++) {
        if (comparator.compare(array[i], array[i + 1]) > 0) {
          T temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          swapped = true;
        }
      }
    }
  }

  // Insertion sort
  public static void sortArrayInsertionFirstOption(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int j = i;
      while (j > 0 && array[j - 1] > array[j]) {
        int temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
        j--;
      }
    }
  }

  // Insertion sort (with Comparator)
  public static <T> void sortArrayInsertionSecondOption(T[] array,
    Comparator<? super T> comparator) {
    for (int i = 1; i < array.length; i++) {
      int j = i;
      while (j > 0 && comparator.compare(array[j - 1], array[j]) > 0) {
        T temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
        j--;
      }
    }
  }

  // Counting sort
  public static void sortArrayCountingFirstOption(int[] array) {
    int max = array[0];
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    int[] counts = new int[max - min + 1];
    for (int i = 0; i < array.length; i++) {
      counts[array[i] - min]++;
    }
    int index = 0;
    for (int i = 0; i < counts.length; i++) {
      while (counts[i] > 0) {
        array[index++] = i + min;
        counts[i]--;
      }
    }
  }

  // Heap sort
  public static void sortArrayHeap(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    if (arr.length == 0) {
      throw new IllegalArgumentException("Array length cannot be 0");
    }
    int n = arr.length;
    buildHeap(arr, n);
    while (n > 1) {
      swap(arr, 0, n - 1);
      n--;
      heapify(arr, n, 0);
    }
  }

  private static void buildHeap(int[] arr, int n) {
    for (int i = arr.length / 2; i >= 0; i--) {
      heapify(arr, n, i);
    }
  }

  private static void heapify(int[] arr, int n, int i) {
    int left = i * 2 + 1;
    int right = i * 2 + 2;
    int greater;
    if (left < n && arr[left] > arr[i]) {
      greater = left;
    } else {
      greater = i;
    }
    if (right < n && arr[right] > arr[greater]) {
      greater = right;
    }
    if (greater != i) {
      swap(arr, i, greater);
      heapify(arr, n, greater);
    }
  }

  // Pancake sort
  public static void sortArrayPancake(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    int maxVal;
    int j;
    int position;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      maxVal = arr[0];
      position = 0;
      for (j = 0; j < n - i; j++) {
        if (arr[j] > maxVal) {
          maxVal = arr[j];
          position = j;
        }
      }
      flip(arr, position, n - 1 - i);
    }
  }

  private static void flip(int[] arr, int left, int right) {
    while (left <= right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
  }

  // Exchange sort
  public static void sortArrayExchange(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    int temp;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  // Selection sort
  public static void sortArraySelection(int[] arr) {
    if (arr.length == 0) {
      throw new IllegalArgumentException("Array length cannot be 0");
    }
    int first;
    int count = 1;
    for (int i = arr.length - 1; i > 0; i--, count++) {
      first = 0;
      for (int j = 1; j <= i; j++) {
        if (arr[j] > arr[first]) {
          first = j;
        }
      }
      swap(arr, first, i);
    }
  }

  // Shell sort
  public static void sortArrayShell(int[] arr) {
    if (arr.length == 0) {
      throw new IllegalArgumentException("Array length cannot be 0");
    }
    int q = 1;
    while (q <= arr.length / 3) {
      q = (q * 3) + 1;
    }
    int in;
    int out;
    int temp;
    while (q > 0) {
      for (out = q; out < arr.length; out++) {
        temp = arr[out];
        in = out;
        while (in > q - 1 && arr[in - q] >= temp) {
          arr[in] = arr[in - q];
          in -= q;
        }
        arr[in] = temp;
      }
      q = (q - 1) / 3;
    }
  }

  // Merge sort
  public static void sortArrayMerge(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    if (arr.length > 1) {
      int[] left = leftHalf(arr);
      int[] right = rightHalf(arr);
      sortArrayMerge(left);
      sortArrayMerge(right);
      merge(arr, left, right);
    }
  }

  private static int[] leftHalf(int[] arr) {
    int size = arr.length / 2;
    int[] left = new int[size];
    System.arraycopy(arr, 0, left, 0, size);
    return left;
  }

  private static int[] rightHalf(int[] arr) {
    int size1 = arr.length / 2;
    int size2 = arr.length - size1;
    int[] right = new int[size2];
    System.arraycopy(arr, size1, right, 0, size2);
    return right;
  }

  private static void merge(int[] result, int[] left, int[] right) {
    int t1 = 0;
    int t2 = 0;
    for (int i = 0; i < result.length; i++) {
      if (t2 >= right.length || (t1 < left.length && left[t1] <= right[t2])) {
        result[i] = left[t1];
        t1++;
      } else {
        result[i] = right[t2];
        t2++;
      }
    }
  }

  // Bucket sort - Scatter-Sort-Gather approach
  public static void sortArrayBucketSsg(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    int[] hashes = hash(arr);
    List<Integer>[] buckets = new List[hashes[1]];
    for (int i = 0; i < hashes[1]; i++) {
      buckets[i] = new ArrayList();
    }
    for (int e : arr) {
      buckets[hash(e, hashes)].add(e);
    }
    for (List bucket : buckets) {
      Collections.sort(bucket);
    }
    int p = 0;
    for (List<Integer> bucket : buckets) {
      for (int j : bucket) {
        arr[p++] = j;
      }
    }
  }

  private static int[] hash(int[] arr) {
    int m = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (m < arr[i]) {
        m = arr[i];
      }
    }
    return new int[]{m, (int) Math.sqrt(arr.length)};
  }

  private static int hash(int num, int[] hashes) {
    return (int) ((double) num / hashes[0] * (hashes[1] - 1));
  }

  // Bucket sort - Scatter-Gather approach
  public static void sortArrayBucketSg(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    int[] bucket = new int[max + 1];
    for (int k : arr) {
      bucket[k]++;
    }
    int p = 0;
    for (int i = 0; i < bucket.length; i++) {
      for (int j = 0; j < bucket[i]; j++) {
        arr[p++] = i;
      }
    }
  }

  // Cocktail sort
  public static void sortArrayCocktail(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    boolean isSwapped;
    do {
      isSwapped = false;
      for (int i = 0; i <= arr.length - 2; i++) {
        if (arr[i] > arr[i + 1]) {

          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          isSwapped = true;
        }
      }
      if (!isSwapped) {
        break;
      }
      isSwapped = false;
      for (int i = arr.length - 2; i >= 0; i--) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;

          isSwapped = true;
        }
      }
    } while (isSwapped);
  }

  // Cycle sort
  public static void sortArrayCycle(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    for (int cycle = 0; cycle < arr.length - 1; cycle++) {
      int value = arr[cycle];
      int position = cycle;
      for (int i = cycle + 1; i < arr.length; i++) {
        if (arr[i] < value) {
          position++;
        }
      }
      if (position == cycle) {
        continue;
      }
      while (value == arr[position]) {
        position++;
      }
      int temp = arr[position];
      arr[position] = value;
      value = temp;
      while (position != cycle) {
        position = cycle;
        for (int i = cycle + 1; i < arr.length; i++) {
          if (arr[i] < value) {
            position++;
          }
        }
        while (value == arr[position]) {
          position++;
        }
        temp = arr[position];
        arr[position] = value;
        value = temp;
      }
    }
  }

  // Quick sort
  public static void sortArrayQuick(int[] arr, int left, int right) {
    if (left < right) {
      int pivot = partition(arr, left, right);
      sortArrayQuick(arr, left, pivot - 1);
      sortArrayQuick(arr, pivot + 1, right);
    }
  }

  private static int partition(int[] arr, int left, int right) {
    int pivot = arr[right];
    int m = left;
    for (int i = m; i < right; i++) {
      if (arr[i] <= pivot) {
        swap(arr, i, m++);
      }
    }
    swap(arr, right, m);
    return m;
  }

  // Radix sort
  public static void sortArrayRadix(int[] arr, int radix) {
    if (arr == null) {
      throw new IllegalArgumentException("Array cannot be null");
    }
    if (arr.length == 0) {
      throw new IllegalArgumentException("Array length cannot be 0");
    }
    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      } else if (arr[i] > max) {
        max = arr[i];
      }
    }
    int exp = 1;
    while ((max - min) / exp >= 1) {
      countSortByDigit(arr, radix, exp, min);
      exp *= radix;
    }
  }

  private static void countSortByDigit(int[] arr, int radix, int exp, int min) {
    int[] buckets = new int[radix];
    for (int i = 0; i < radix; i++) {
      buckets[i] = 0;
    }
    int bucket;
    for (int j : arr) {
      bucket = ((j - min) / exp) % radix;
      buckets[bucket]++;
    }
    for (int i = 1; i < radix; i++) {
      buckets[i] += buckets[i - 1];
    }
    int[] out = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      bucket = ((arr[i] - min) / exp) % radix;
      out[--buckets[bucket]] = arr[i];
    }
    System.arraycopy(out, 0, arr, 0, arr.length);
  }

  // Helper method to swap two elements in an array
  private static void swap(int[] array, int i, int largest) {
    int temp = array[i];
    array[i] = array[largest];
    array[largest] = temp;
  }
}
