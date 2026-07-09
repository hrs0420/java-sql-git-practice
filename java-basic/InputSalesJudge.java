import java.util.Scanner;
public class InputSalesJudge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("獲得件数を入力してください：");
        int salesCount = scanner.nextInt();

        System.out.println("獲得件数：" + salesCount + "件");

        if (salesCount >= 10) {
            System.out.println("評価：最高です");
        }else if (salesCount >= 5){
            System.out.println("評価：良いペースです");
        }else if (salesCount >= 1) {
            System.out.println("評価：まずまずです");
        }else {
            System.out.println("評価：次の提案を頑張りましょう");
        }
        
        scanner.close();
    }
}
