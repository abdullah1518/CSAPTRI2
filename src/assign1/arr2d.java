package assign1;

public class arr2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {5,6,7},
                {9,9,0}
        };
        System.out.println("Sum: "+getSum2d(arr));
        System.out.println("Average: "+ getAverage2d(arr));
        System.out.println("Max: "+getMax2d(arr));
        System.out.println("Min: "+getMin2d(arr));
        System.out.println("Major Diagonal: "+getMajorDiag2d(arr));
        System.out.println("Minor Diagonal: "+getMinorDiag2d(arr));
    }

    public static int getSum2d(int[][] arr){
        int sum=0;
        for (int row =0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                sum+=arr[row][col];
            }
        }
        return sum;
    }
    public static double getAverage2d(int[][] arr){
        int sum=0;
        int row=0;
        int col=0;
        for (row =0; row < arr.length; row++) {
            for (col = 0; col < arr[0].length; col++) {
                sum+=arr[row][col];
            }
        }
        return sum/(row*col);
    }
    public static int getMax2d(int[][] arr){
        int max = arr[0][0];
        for (int row =0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col]>max) max = arr[row][col];
            }
        }
        return max;
    }
    public static int getMin2d(int[][] arr){
        int min = arr[0][0];
        for (int row =0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if(arr[row][col]<min) min = arr[row][col];
            }
        }
        return min;
    }
    public static int getMajorDiag2d(int[][] arr){
        int majordiag=0;
        for (int i = 0; i < arr.length; i++) {
            majordiag+=arr[i][i];
        }
        return majordiag;
    }
    public static int getMinorDiag2d(int[][] arr){
        int minordiag=0;
        for (int i = 0; i < arr.length; i++) {
            minordiag+=arr[i][(arr.length-1)-i];
        }
        return minordiag;
    }
}
