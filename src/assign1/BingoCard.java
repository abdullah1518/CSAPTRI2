package assign1;

public class BingoCard {
    private int[][] card = new int[5][5];
    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 0, 73, 74, 75,
    };


    public void generateCard(){
        for (int col = 0; col < 5; col++) {

            int[] numbers = new int[15];
            for (int i = 0; i < 15; i++) {
                numbers[i] = i + 1;
            }

            for (int row = 0; row < 5; row++) {
                if (!(row == 2 && col == 2)) {
                    boolean filled = false;
                    while (!filled) {
                        int rand = ((int) (Math.random() * 15) + 1);
                        if (numbers[rand - 1] != 0) {
                            card[row][col] = rand + (15 * col);
                            numbers[rand - 1] = 0;
                            filled = true;
                        }
                    }
                }
            }
            System.out.print("col " + col + " set: ");
            for (int i : numbers) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public void showCard(){
        for (int row = 0; row < card.length; row++) {
            for (int col = 0; col < card[0].length; col++) {
                System.out.printf("%-3d ",card[row][col]);
            }
            System.out.println();
        }
    }
    public static int pickRandom(){
        int number = 0;
        boolean picked = false;
        while (!picked) {
            int rand = ((int) (Math.random() * 75) + 1) ;
            if (numbers[rand-1] != 0) {
                numbers[rand-1] = 0;
                number = rand;
                picked=true;
            }
        }
        return number;
    }
    public void blackoutBingo(){
        showCard();
        int picked = pickRandom();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (card[row][col] == picked){
                    card[row][col] = 0;
                    showCard();
                }
            }
        }
    }
}
