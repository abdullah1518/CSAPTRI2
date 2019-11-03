package assign1;

public class assign1_5 {
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
        replaceTwos(arr1);
        System.out.println();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void replaceTwos(int[][] arr1){
        for (int col = 0; col < 10; col++){
            for (int row = 0; row < 8; row++) {
                if (row!=7 && arr1[row][col]==2 && arr1[row+1][col]==2){
                    arr1[row+1][col]=8;
                }
            }
        }
    }
}
