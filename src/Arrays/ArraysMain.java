package Arrays;

import java.util.Arrays;

import static Arrays.ReverseArray.reverse;

public class ArraysMain {
    public static void main(String[] args) {
        int[] newArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("The initial array is: " + Arrays.toString(newArray));
        reverse(newArray);
        System.out.println("The reversed array is: " + Arrays.toString(newArray));
    }
}

