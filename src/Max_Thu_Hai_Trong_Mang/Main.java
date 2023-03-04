package Max_Thu_Hai_Trong_Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.println("nhập độ dài cho mảng: ");
            size = input.nextInt();
            if (size > 10 || size < 0) {
                System.out.println("Độ dài mảng không được quá 10 phần tử hoặc số âm");
                System.out.println("vui lòng nhập lại: ");
            }
        } while (size > 10);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println("mảng ban dầu: \n" + Arrays.toString(arr));
        int max = arr[0], second = arr[1];
        int index = 1, indexSecond = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
                indexSecond = index;
                index = i + 1;
            } else if (arr[i] < max && arr[i] > second) {
                second = arr[i];
                indexSecond = i + 1;
            }
        }
        System.out.println("max đầu tiên là: " + max + " ở vị trí thứ: " + index);
        System.out.println("max thứ hai là: " + second + " ở vị trí thứ: " + indexSecond);

    }
}
