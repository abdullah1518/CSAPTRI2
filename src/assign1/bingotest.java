package assign1;

public class bingotest {
    public static void main(String[] args) {
        BingoCard card = new BingoCard();
        card.generateCard();
        card.blackoutBingo();
        card.lineBingo();
    }


}
