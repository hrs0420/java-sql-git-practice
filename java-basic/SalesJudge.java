public class SalesJudge {
    public static void main(String[] args) {
        int salesCount = 7;

        System.out.println("獲得件数：" + salesCount + "件");

        if (salesCount >= 10) {
            System.out.println("評価：最高です");
        } else if (salesCount >= 5){
            System.out.println("評価：良いペースです");
        } else if (salesCount >= 1) {
            System.out.println("評価：まずまずです");
        } else{
            System.out.println("評価：次の提案を頑張りましょう");
        }
    }
}
