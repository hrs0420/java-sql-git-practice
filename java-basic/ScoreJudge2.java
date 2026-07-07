public class ScoreJudge2 {
    public static void main(String[] args){
        int score = 85;

        System.out.println("点数：" + score);

        if (score >= 80) {
            System.out.println("評価：A");
        } else if (score >= 60) {
            System.out.println("評価：B");
        } else{
            System.out.println("評価：C");
        }
    }
}
