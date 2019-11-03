package assign1;

public class assign1_3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                arr1[row][col] = (int) (Math.random()*10);
                arr2[row][col] = (int) (Math.random()*10);
            }
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(arr1[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(arr2[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] addarrays = addArrays(arr1,arr2);
        int[][] addarraysmix = addArraysMix(arr1,arr2);
        int[][] transpose = transpose(arr1);

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(addarrays[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(addarraysmix[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(transpose[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] addArrays(int[][]arr1,int[][]arr2){
        int[][] sumarr = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                sumarr[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
        return sumarr;
    }
    public static int[][] addArraysMix(int[][]arr1,int[][]arr2){
        int[][] sumarr = new int [5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                sumarr[row][col] = arr1[row][col] + arr2[col][row];
            }
        }
        return sumarr;
    }
    public static int[][] transpose(int[][]arr){
        int[][] storearr = new int [5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                storearr[col][row] = arr[row][col];
            }
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                arr[row][col] = storearr[row][col];
            }
        }
        return arr;
    }
}
