//スキャナーのインポート
import java.util.Scanner; 
public class InputScoreJudge {
    public static void main(String[] args) {
        //Scannerの準備
        Scanner scanner = new Scanner(System.in);

        System.out.print("点数を入力してください：");
        
        //入力された整数をscoreに入れる
        int score = scanner.nextInt();
        System.out.println("入力された点数：" + score);

        if (score >= 80){
            System.out.println("評価：A");
        } else if (score >= 60){
            System.out.println("評価：B");
        } else {
            System.out.println("評価：C");
        }

        scanner.close();
    }
}
