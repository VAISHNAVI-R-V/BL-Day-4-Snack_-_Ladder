public class SnackAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        // Player Start Position
        int position = 0;
        System.out.println("Player start position : " + position);

        // Dice value i.e between 1 to 6
        int Roll_Die = (int) (Math.floor((Math.random() * 10 )) % 6 ) + 1;
        System.out.println("Rolled die :  " +Roll_Die);
    }
}

