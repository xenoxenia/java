package com.company.java14;

import java.util.ArrayList;

public class Quick {
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(ArrayList<Student> arr, int low, int high) {
        int pivot = arr.get(high).getIdNumber();
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr.get(j).getIdNumber() < pivot) {
                i++;

                // swap arr[i] and arr[j]
                Student temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Student temp = arr.get(i + 1);
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void quick(ArrayList<Student> arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quick(arr, low, pi - 1);
            quick(arr, pi + 1, high);
        }
    }
}
