package assign1;

public class Student {
    private int[] quizzes = new int[4];

    public Student(int q1,int q2,int q3,int q4){
        this.quizzes[0] = q1;
        this.quizzes[1] = q2;
        this.quizzes[2] = q3;
        this.quizzes[3] = q4;
    }

    public int[] getQuizzes(){
        return quizzes;
    }
}
