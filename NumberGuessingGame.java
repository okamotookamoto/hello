import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // 設定する数
        int targetNumber = 42;
        // ユーザの入力回数
        int guessesTaken = 0;
        // ユーザの入力を受け取るScannerオブジェクト
        Scanner scanner = new Scanner(System.in);

        System.out.println("数当てゲームを開始します！");
        System.out.println("2桁の正の整数を予想してください。");

        while (guessesTaken < 5) {
            System.out.print("予想した数を入力してください: ");
            int userGuess = scanner.nextInt();
            guessesTaken++;

            if (userGuess == targetNumber) {
                System.out.println("当たり！");
                break;
            } else if (userGuess > targetNumber) {
                System.out.println("入力した数は設定された数より大きいです。");
            } else {
                System.out.println("入力した数は設定された数より小さいです。");
            }

            // 20以上の差がある場合のメッセージ
            if (Math.abs(userGuess - targetNumber) >= 20) {
                System.out.println("20以上の差があります！");
            }

            // 入力回数の表示
            System.out.println("残りの入力回数: " + (5 - guessesTaken));
        }

        if (guessesTaken == 5) {
            System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
        }

        // Scannerをクローズする
        scanner.close();
    }
}
