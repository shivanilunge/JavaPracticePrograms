public class NumberPyramid {
    public static void main(String[] args) {
        int row = 5;
         int num = 1;
        for (int i = 1; i <= row; i++) {
           
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
