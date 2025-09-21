package strings.level2;

import java.util.Scanner;

public class RockPaperScissor {
    public static String computerChoice(){
        int n = (int)(Math.random()*3);
        return n==0 ? "Rock" : n==1 ? "Paper" : "Scissors";
    }

    public static int winner(String user, String comp){
        if(user.equals(comp)) return 0;
        if((user.equals("Rock") && comp.equals("Scissors")) ||
                (user.equals("Paper") && comp.equals("Rock")) ||
                (user.equals("Scissors") && comp.equals("Paper"))) return 1;
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int games = sc.nextInt();
        int userWins=0, compWins=0;

        for(int i=1;i<=games;i++){
            System.out.print("Game " + i + " - Enter Rock/Paper/Scissors: ");
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);
            System.out.println("Computer: " + comp);
            if(res==1){ userWins++; System.out.println("User wins!"); }
            else if(res==-1){ compWins++; System.out.println("Computer wins!"); }
            else System.out.println("Tie!");
        }

        double userPerc = (userWins*100.0)/games;
        double compPerc = (compWins*100.0)/games;
        System.out.println("\nStats:\nUser Wins: " + userWins + " (" + userPerc + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPerc + "%)");
    }
}
