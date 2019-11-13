package assign1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1, 1, 1, 1);
        Student s2 = new Student(2, 2, 2, 2);
        Student s3 = new Student(3, 3, 3, 3);
        Student s4 = new Student(4, 4, 4, 4);
        Student s5 = new Student(5, 5, 5, 5);
        Student s6 = new Student(6, 6, 6, 6);

        Student[][] students = {
            {s1,s2,s3},
            {s4,s5,s6}
        };
        System.out.println(studentQuizAverage(students,2));
        System.out.println(quizAverage(students));

    }

    public static double studentQuizAverage(Student[][] array, int quizNo) {
        double sum=0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum+=array[row][col].getQuizzes()[quizNo];
            }
        }
        return sum/array.length;
    }
    public static double[] quizAverage(Student[][] array){
        double[] averages = new double[5];
        for (int quiz = 0; quiz < 5; quiz++) {
            double sum=0;
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    sum+=array[row][col].getQuizzes()[quiz];
                }
            }
            averages[quiz] = sum/array.length;
        }
        return averages;
    }
}
