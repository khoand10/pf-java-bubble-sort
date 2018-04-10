/*
@author : khoa
*/
public class BubbleSort {
    /*
    method bubble sort list of integer
    input: list integer
    output: list sorted
    so sanh 1vs2 2vs3 n vs n+1 neu lon hon thi swap
     */
    static void bubbleSort(int[] list) {
        boolean isNextPass = true;
        int temp = 0;
        for (int k = 1; k < list.length - 1 && isNextPass; k++) {
            isNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    isNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 16, 55, 34};
        bubbleSort(numbers);
        for (int number : numbers) {
            System.out.println(number + "\t");
        }
    }
}
