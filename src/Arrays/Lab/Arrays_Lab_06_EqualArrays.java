package Arrays.Lab;

import java.util.Scanner;

public class Arrays_Lab_06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values1 = scanner.nextLine();
        String values2 = scanner.nextLine();
        String[] arr1 = values1.split(" ");
        String[] arr2 = values2.split(" ");
        int[] nums1 = new int[arr1.length];
        int[] nums2 = new int[arr2.length];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            nums1[i] = Integer.parseInt(arr1[i]);
            sum1 += nums1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            nums2[j] = Integer.parseInt(arr2[j]);
            sum2 += nums2[j];
        }
        int max = Math.max(arr1.length, arr2.length);
        int check = 0;
        for (int i = 0; i < max; i++) {
            if (nums1[i] != nums2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            } else {
                check++;
            }
            if (max == check) {
                System.out.printf("Arrays are identical. Sum: %d", sum1);
            }
        }
    }
}

