package thirdHomeWork;

public class Bubble {
    public static void main(String[] args) {
        int[] intArray = {31, 432, 3, 42, 51, 999, -1};
        boolean flag = true;
        int temp;

        for (int i = 0; i < intArray.length - 1; i++) {
            flag = false;
            for (int j = 0; j < intArray.length - 1 - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;

                    flag = true;
                }
            }

        }
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
