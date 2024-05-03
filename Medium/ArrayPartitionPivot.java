import java.util.ArrayList;
import java.util.List;

// You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
//
//Every element less than pivot appears before every element greater than pivot.
//Every element equal to pivot appears in between the elements less than and greater than pivot.
//The relative order of the elements less than pivot and the elements greater than pivot is maintained.
//More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of
// the jth element. For elements less than pivot, if i < j and nums[i] < pivot and nums[j] < pivot, then pi < pj.
// Similarly for elements greater than pivot, if i < j and nums[i] > pivot and nums[j] > pivot, then pi < pj.
//
//Return nums after the rearrangement.

public class ArrayPartitionPivot {

    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int less = 0; // índice para los elementos menores al pivote
        int i = 0;   // índice de escaneo actual
        int greater = n - 1; // índice para los elementos mayores al pivote

        while (i <= greater) {
            if (nums[i] < pivot) {
                // Coloca el elemento actual en la posición 'less' e incrementa ambos índices 'less' e 'i'
                swap(nums, i, less);
                less++;
                i++;
            } else if (nums[i] > pivot) {
                // Coloca el elemento actual en la posición 'greater' y decrementa 'greater'
                swap(nums, i, greater);
                greater--;
            } else {
                // Si el elemento es igual al pivote, simplemente incrementa 'i'
                i++;
            }
        } return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        ArrayPartitionPivot pivotArray = new ArrayPartitionPivot();

        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] result = pivotArray.pivotArray(nums, pivot);

        // Imprimir resultado
        for (int num : result) {
            System.out.print(num + " ");
        }

    }

}