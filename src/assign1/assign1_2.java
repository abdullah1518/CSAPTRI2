package assign1;

public class assign1_2 {
    public static void main(String[] args) {
        int[][] array = {
                {9,1,21,13,12},
                {22,23,5,18,25},
                {8,4,23,2,24},
                {16,4,21,17,20},
                {7,8,3,15,7}
        };

        printMiddleRow(array);
        printMiddleCol(array);
        printUpperHalf(array);
        System.out.println("\n\n");
        printLowerHalf(array);

    }
    public static void printMiddleRow(int[][] array){
        for (int col = 0; col < 5; col++) {
            System.out.println(array[2][col]);
        }
    }
    public static void printMiddleCol(int[][] array){
        for (int row = 0; row < 5; row++) {
            System.out.println(array[row][2]);
        }
    }
    public static void printUpperHalf(int[][] array){
        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print("  ");
            }
            for (int col = row; col < 5; col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void printLowerHalf(int[][] array){
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
}
