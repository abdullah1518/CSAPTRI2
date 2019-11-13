package assign1;

public class Assign1_6 {
    public static void main(String[] args) {
        int[][] sales={
                {4930,2636,1900},
                {2482,4302},
                {2049,4747,4384,4505},
                {2596,4689},
                {1923,3941}
        };
        System.out.println(totalSalesPerSalesMan(sales,3));
        System.out.println(quarterlySales(sales,3));
        System.out.println(quarterlySalesAve(sales,3));
    }
    public static double  quarterlySales(int[][] sales,int quarter){
        double sum=0;
        for (int row = 0; row < sales.length; row++) {
            if (sales[row].length>=quarter){
                sum+= sales[row][quarter-1];
            }
        }
        return sum;
    }
    public static double  quarterlySalesAve(int[][] sales,int quarter){
        double nums = 0;
        double sum=0;
        for (int row = 0; row < sales.length; row++) {
            if (sales[row].length>=quarter){
                sum+= sales[row][quarter-1];
                nums++;
            }
        }
        return sum/nums;
    }
    public static double totalSalesPerSalesMan(int[][] sales, int salemanNo){
        double sum =0;
        for (int col = 0; col < sales[salemanNo].length; col++) {
            sum+=sales[salemanNo][col];
        }
        return sum;
    }
}
