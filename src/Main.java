import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task # 1");

        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;

        float[] floatArr = {1.57f, 7.654f, 9.986f};

        int[] cardIndex = new int[10];
        cardIndex[2] = 2;
        cardIndex[5] = 5;
        cardIndex[8] = 8;

        System.out.println("Объявлено 3 массива");

        System.out.println("Task # 2");

        System.out.print(firstArr[0] + ", ");
        System.out.print(firstArr[1] + ", ");
        System.out.print(firstArr[2]);
        System.out.println();

        System.out.print(floatArr[0] + ", ");
        System.out.print(floatArr[1] + ", ");
        System.out.print(floatArr[2]);
        System.out.println();

        for (int i = 0; i < cardIndex.length; i++) {
            System.out.print(cardIndex[i]);
            if (i < cardIndex.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task # 3");

        for (int i = firstArr.length - 1; i >= 0; i--) {
            System.out.print(firstArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = floatArr.length - 1; i >= 0; i--) {
            System.out.print(floatArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = cardIndex.length - 1; i >= 0; i--) {
            System.out.print(cardIndex[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task # 4");

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] % 2 != 0) {
                firstArr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstArr));
    }
}
