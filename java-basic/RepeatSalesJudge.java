import java.util.Scanner;
public class RepeatSalesJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("獲得件数を入力してください(-1で終了)：");
            int salesCount = scanner.nextInt();

            if (salesCount == -1) {
                System.out.println("終了します");
                break;
            } else if (salesCount < 0) {
                System.out.println("入力値が不正です");
            } else if (salesCount >= 10){
                System.out.println("評価：最高です");
            } else if (salesCount >= 5){
                System.out.println("評価：良いペースです");
            } else if (salesCount >= 1){
                System.out.println("評価：まずまずです");
            } else {
                System.out.println("評価：次の提案を頑張りましょう");            
            }
        }

        scanner.close();
    }
}
