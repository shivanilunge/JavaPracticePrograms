public class NumberPyramid {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            int num = i;
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
