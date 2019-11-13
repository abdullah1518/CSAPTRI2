package assign1;

import java.util.Scanner;

public class bingotest {
    public static void main(String[] args) {
        BingoCard card = new BingoCard();
        card.generateCard();
//        card.blackoutBingo();
//        card.lineBingo();
        card.figureXBingo();
//        card.startBingo();
//        Scanner input = new Scanner(System.in);
//        int userIn = 1;
//        boolean isCompleted = card.checkBingo();
//        while (userIn != -999 && !isCompleted) {
//            System.out.print("(-999 to exit) Enter a number: ");
//            userIn = input.nextInt();
//            while (userIn!=-999 && (userIn>75 || userIn<1)){
//                System.out.println("invalid input, please enter a number between 1 and 75 inclusive");
//                userIn = input.nextInt();
//            }
//            card.playBingo(userIn);
//        }


    }


}
