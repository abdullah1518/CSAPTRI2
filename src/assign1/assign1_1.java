package assign1;

public class assign1_1 {
    public static void main(String[] args) {
        double[][] sales = {
                {4384,2060,2213,4082},
                {3330,2440,3847,3294},
                {3305,3796,3823,4054},
                {2867,2345,3428,4094},
                {2721,3901,2260,2472},
                {2703,4267,3574,2958},
        };
        System.out.println(monthlySales(sales,1));
        System.out.println(highestSalesMonth(sales));
        System.out.println(isIncreasing(sales,3));
        System.out.println(highestMonth(sales,1));
    }
    public static double monthlySales(double[][] arr, int month){
        double sum=0;
        for (int col = 0; col < 4; col++) {
            sum+=arr[month-1][col];
        }
        return sum;
    }
    public static int highestSalesMonth(double[][] arr){
        double max=monthlySales(arr,1);
        int largestMonth=0;
        double[] sums = new double[arr.length];
        for (int i = 0; i < sums.length; i++) {
            sums[i]=monthlySales(arr,i+1);
            if (sums[i]>max){
                max=sums[i];
                largestMonth = i+1;
            }
        }
        return largestMonth;
    }
    public static boolean isIncreasing(double[][] arr,int month){
        for (int col = 0; col < 3; col++) {
            if (arr[month-1][col]>arr[month-1][col+1]){
                return false;
            }
        }
        return true;
    }
    public static int highestMonth(double[][] arr,int personin){
        int person = personin-1;
        double max=arr[0][person];
        int highestMonth=1;
        for (int month = 0; month < 6; month++) {
            if (arr[month][person]>max){
                max=arr[month][person];
                highestMonth=month+1;
            }
        }
        return highestMonth;
    }
}
