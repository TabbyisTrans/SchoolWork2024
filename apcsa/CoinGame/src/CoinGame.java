import java.util.Scanner;

public class CoinGame {
    int startingCoins = 10;
    int maxRounds = 5;

    public int getPlayer1Move() {
        return (int) (Math.random() * 3) + 1;
    }

    public int getPlayer2move(int round) {
        int result = 0;
        if (round % 3 == 0) {
            result = 3;
        } else if (round % 2 == 0) {
            result = 2;
        } else {
            result = 1;
        }
        return result;
    }

    public void playGame() {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        int player1Guess = 0;
        int player2Guess = 0;
        int diff = 0;

        for (int i = 0; i < maxRounds && player1Coins > 3 && player2Coins > 3; i++) {
            player1Guess = player1Choice();
            player2Guess = getPlayer2move(i + 1);
            diff = Math.abs(player1Guess - player2Guess);
            if (player1Guess == player2Guess) {
                player2Coins += 1;
            } else {
                if (diff == 1) {
                    player2Coins += 1;
                } else {
                    player1Coins += 2;
                }
            }
            player1Coins -= player1Guess;
            player2Coins -= player2Guess;
            /*
             * if (player1Coins < 3 || player2Coins < 3)
             * {
             * i = maxRounds;
             * }
             */
            System.out.println("Player 1 Coins: " + player1Coins);
            System.out.println("Player 2 Coins " + player2Coins);
            System.out.println("End of Round " + (i + 1) + "\n");
        }
        if (player1Coins == player2Coins) {
            System.out.println("tie game");
        } else if (player1Coins > player2Coins) {
            System.out.println("player 1 wins");
        } else {
            System.out.println("player 2 wins");
        }
    }

    public int player1Choice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 guess: ");
        int result = sc.nextInt();
        return result;
    }
}