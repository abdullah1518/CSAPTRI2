package assign1;

public class assign1_4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[8][10];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                arr1[row][col] = (int) (Math.random()*3);
            }
        }
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }
        replaceZeros(arr1);
        System.out.println();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void replaceZeros(int[][] arr1){
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                if (col!=9 && arr1[row][col]==0 && arr1[row][col+1]==0){
                    arr1[row][col+1]=2;
                }
            }
        }
    }
}
