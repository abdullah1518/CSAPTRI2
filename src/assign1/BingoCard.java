package assign1;

public class BingoCard {
    private int[][] card = new int[5][5];
    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75,};
    private int[][] tempCard = new int[5][5];

    public void startBingo(){
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                tempCard[row][col] = card[row][col];
            }
        }
        System.out.println("Started a bingo game with the card: ");
        showCard(tempCard);
        System.out.println();
    }

    public void generateCard() {
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
        }
    }

    public void showCard() {
        for (int row = 0; row < card.length; row++) {
            for (int col = 0; col < card[0].length; col++) {
                System.out.printf("%-3d ", card[row][col]);
            }
            System.out.println();
        }
    }

    public void showCard(int[][] card) {
        for (int row = 0; row < card.length; row++) {
            for (int col = 0; col < card[0].length; col++) {
                System.out.printf("%-3d ", card[row][col]);
            }
            System.out.println();
        }
    }

    public static int pickRandom() {
        int number = 0;
        boolean picked = false;
        while (!picked) {
            int rand = ((int) (Math.random() * 75) + 1);
            if (numbers[rand - 1] != 0) {
                numbers[rand - 1] = 0;
                number = rand;
                picked = true;
            }
        }
        return number;
    }

    public static void resetPickRandom() {
        for (int i = 0; i < 75; i++) {
            numbers[i] = i + 1;
        }
    }

    public void blackoutBingo() {
        resetPickRandom();
        int[][] checkCard = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                checkCard[row][col] = card[row][col];
            }
        }
        showCard(checkCard);
        System.out.println();
        boolean completed = false;
        while (!completed) {
            int picked = pickRandom();
            System.out.println("Random Number: " + picked);
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if (checkCard[row][col] == picked) {
                        checkCard[row][col] = 0;
                        showCard(checkCard);
                        System.out.println();
                    }
                }
            }
            completed = true;
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if (checkCard[row][col] != 0) {
                        completed = false;
                    }
                }
            }
        }
        System.out.println("Completed!~~ owo");
    }

    public void lineBingo() {
        resetPickRandom();
        int[][] checkCard = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                checkCard[row][col] = card[row][col];
            }
        }
        showCard(checkCard);
        System.out.println();
        boolean completed = false;
        while (!completed) {
            int picked = pickRandom();
            System.out.println("Random Number: " + picked);
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if (checkCard[row][col] == picked) {
                        checkCard[row][col] = 0;
                        showCard(checkCard);
                        System.out.println();
                    }
                }
            }
            completed = false;
            int hline = 0;
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if (col != 4 && checkCard[row][col] == checkCard[row][col + 1]) {
                        hline++;
                        if (hline == 4) {
                            completed = true;
                        }
                    } else hline = 0;
                }

            }
            int vline = 0;
            for (int col = 0; col < 5; col++) {
                for (int row = 0; row < 5; row++) {
                    if (row != 4 && checkCard[row][col] == checkCard[row + 1][col]) {
                        vline++;
                        if (vline == 4) {
                            completed = true;
                        }
                    } else vline = 0;
                }
            }
        }
        System.out.println("Completed!~~ owo");
    }

    public boolean checkLineBingo(int picked) {
        showCard(tempCard);
        System.out.println();
        boolean completed = false;
        System.out.println("Number: " + picked);
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (tempCard[row][col] == picked) {
                    tempCard[row][col] = 0;
                    showCard(tempCard);
                    System.out.println();
                }
            }
        }
        int hline = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col != 4 && tempCard[row][col] == tempCard[row][col + 1]) {
                    hline++;
                    if (hline == 4) {
                        completed = true;
                    }
                } else hline = 0;
            }
        }
        int vline = 0;
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                if (row != 4 && tempCard[row][col] == tempCard[row + 1][col]) {
                    vline++;
                    if (vline == 4) {
                        completed = true;
                    }
                } else vline = 0;
            }
        }

        if (completed) System.out.println("Completed!~~ owo");
        else {
            showCard(tempCard);
            System.out.println();
            System.out.println("not completed...");
        }
        return completed;
    }

    public boolean checkLineBingo() {
        int[][] tempCard = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                tempCard[row][col] = card[row][col];
            }
        }
        showCard(tempCard);
        System.out.println();
        boolean completed = false;
        int hline = 0;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col != 4 && tempCard[row][col] == tempCard[row][col + 1]) {
                    hline++;
                    if (hline == 4) {
                        completed = true;
                    }
                } else hline = 0;
            }
        }
        int vline = 0;
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                if (row != 4 && tempCard[row][col] == tempCard[row + 1][col]) {
                    vline++;
                    if (vline == 4) {
                        completed = true;
                    }
                } else vline = 0;
            }
        }
        if (completed)System.out.println("Completed!~~ owo");
        else System.out.println("not completed...");
        return completed;
    }
}
