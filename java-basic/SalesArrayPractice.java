public class SalesArrayPractice {
    public static void main(String[] args) {
        int[] salesCounts = {10, 5, 3, 8, 12};
        
        int totalSales = 0;
        int maxSales = salesCounts[0];

        for (int i = 0; i < salesCounts.length; i++){
            totalSales += salesCounts[i];

            if (salesCounts[i] > maxSales) {
                maxSales = salesCounts[i];
            }
        }

        double averageSales = (double) totalSales / salesCounts.length;

        System.out.println("営業実績一覧");

        for (int i = 0; i < salesCounts.length; i++){
            System.out.println((i + 1) + "件目" + salesCounts[i] + "件");
        }
        
        System.out.println("合計獲得件数：" + totalSales + "件");
        System.out.println("平均獲得件数：" + averageSales + "件");
        System.out.println("最大獲得件数：" + maxSales + "件");
    }
}
