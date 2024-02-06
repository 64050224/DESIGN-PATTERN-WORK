import java.util.Scanner;

public class Reporter extends Source{
    private String lastScore;

    public String getLastScore() {
        return lastScore;
    }

    public void footBallReport(){
        System.out.print("Enter Score(empty to exit) >");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(!s.equals("")){
            lastScore = s;
            broadcast();
            System.out.print("Enter Score(empty to exit) >");
            s = sc.nextLine();
        }
        sc.close();
    }
}
