import java.util.Arrays;
import java.util.List;

public class DartGame {

    public static final int WINNING_SCORE = 301;
    public static int currentScore = 301;
    public static int j =0;

    public static int getRemainingScore (List<String> scoreList){
        for(int i =0; i<scoreList.size(); i++) {
            if(!scoreList.get(i).startsWith("D")) {
                currentScore = WINNING_SCORE;
            }
            else {
                j = i;
                break;
            }
        }

        while (j < scoreList.size()) {
            if(scoreList.get(j).startsWith("D")) {
                currentScore = currentScore - 2*Integer.parseInt(scoreList.get(j).substring(1));
            }
            else if(scoreList.get(j).startsWith("T")) {
                currentScore = currentScore - 3*Integer.parseInt(scoreList.get(j).substring(1));
            }
            else {
                currentScore = currentScore - Integer.parseInt(scoreList.get(j));
            }
            j++;
        }

        if(currentScore == 1){
            return -1;
        }
        if(currentScore == 0 && !scoreList.get(j).startsWith("D") ){
            System.out.println("Bust");
            return 0;
        }
        return currentScore;
    }

    public static void main(String[] args) {
        System.out.println(getRemainingScore(Arrays.asList("17", "T2", "17", "18", "17", "D19", "5")));
    }
}