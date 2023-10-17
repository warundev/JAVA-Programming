//----BANK APP PROGRAMME---

import java.util.Arrays;
import java.util.Scanner;

class Cricketer {
    protected String name;
    protected String birthdate;
    protected double height;
    protected String country;
    protected String role;

    Cricketer(String name, String birthdate, double height, String country) {
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.country = country;
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}

class Batsman extends Cricketer {

    protected int runs;
    protected int innings;
    protected int ballfaced;

    Batsman(String name, String birthdate, double height, String country, int runs, int innings, int ballfaced) {
        super(name, birthdate, height, country);

        this.runs = runs;
        this.innings = innings;
        this.ballfaced = ballfaced;

    }

    public double getBattingAverage() {
        double BattingAverage = runs / innings;

        return 0.0;
    }

    public double getBattingStrikerate() {
        double BattingStrike = 100 * runs / ballfaced;

        return 0.0;
    }

    public boolean checkSuitability() {
        if (getBattingStrikerate() > 100) {
            System.out.println("Eligible to play for the Twenty20 matches.");
        } else {
            System.out.println("Not Eligible to play for the Twenty20 matches.");
        }
        return true;
    }

    public int calculateHighest(int array[]) {
        // Sort the array in ascending order
        Arrays.sort(array);

        // The highest value is now in the last element of the sorted array
        int heightScore = array[array.length - 1];
        return heightScore;
    }

}

class Bowler extends Cricketer {
    protected int runs;
    protected int wickets;
    protected int balls;

    Bowler(String name, String birthdate, double height, String country, int runs, int wickets, int balls) {
        super(name, birthdate, height, country);
        this.runs = runs;
        this.wickets = wickets;
        this.balls = balls;
    }

    public double getBowlingAverage() {
        double BowlingAverage = runs / wickets;
        return BowlingAverage;
    }

    public double getBowlingEconomyrate() {
        int Overs = balls / 6;
        double BowlingEconomyrate = runs / Overs;

        return BowlingEconomyrate;
    }

    public double getBowlingStrikerate() {
        double BowlingStrikeRate = balls / wickets;
        return BowlingStrikeRate;
    }
}

public class Match {
    protected String team1, team2;

    Match(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public String getWinningTeam() {
        int rank[] = { 1, 2, 3, 4, 5, 6, 7 };
        String country[] = { "India", "South Africa", "England", "Austrlia", "Afghanistan", "Sri Lanka", "Bangladesh" };

        int team1Rank = -1;
        int team2Rank = -1;

        for (int i = 0; i < country.length; i++) {
            if (country[i].equals(team1)) {
                team1Rank = rank[i];
            }

            if (country[i].equals(team2)) {
                team2Rank = rank[i];
            }

        }

        if (team1Rank == -1 || team2Rank == -1) {
            return "One or both Teams not found in the list.";
        }

        if (team1Rank < team2Rank) {
            return "Winning Team = " + team1;
        } else if (team1Rank > team2Rank) {
            return "Winning Team = " + team2;
        } else {
            return "Both teams have the same rank.";
        }
    }

    public static void main(String[] args) { // Create obj

        Batsman BATM = new Batsman("Dinesh Chandimal", "18/11/1989", 5.8, "Sri Lanaka", 774, 46, 746);
        BATM.setRole("batsman");

        Bowler BOWL = new Bowler("Lasith Malinga", "28/08/1983", 5.6, "Sri Lanka", 1780, 90, 1451);
        BOWL.setRole("bowler");

        // find winning team
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Team1 : ");
        String team1 = sc.nextLine();

        System.out.println("Enter the Team2 : ");
        String team2 = sc.nextLine();

        Match m1 = new Match(team1, team2);

        System.out.println(m1.getWinningTeam());

        // BATSMAN
        System.out.println("\n---Batsman Deatils---");
        System.out.println("Name : " + BATM.name);
        System.out.println("Birthday : " + BATM.birthdate);
        System.out.println("Height : " + BATM.height);
        System.out.println("Country : " + BATM.country);
        System.out.println("Runs : " + BATM.runs);
        System.out.println("Innings : " + BATM.innings);
        System.out.println("Ball Faced : " + BATM.ballfaced);
        System.out.println("\nBatting Average : " + BATM.getBattingAverage());
        System.out.println("Batting Strike Rate : " + BATM.getBattingStrikerate());
        BATM.checkSuitability();
        int score[] = { 12, 45, 96, 78, 23, 69, 85, 3, 45, 10 };
        System.out.println("Highest Score : " + BATM.calculateHighest(score));

        // BOWLER
        System.out.println("\n---Bowler Deatils---");
        System.out.println("Name : " + BOWL.name);
        System.out.println("Birthday : " + BOWL.birthdate);
        System.out.println("Height : " + BOWL.height);
        System.out.println("Country : " + BOWL.country);
        System.out.println("Runs : " + BOWL.runs);
        System.out.println("Wickets : " + BOWL.wickets);
        System.out.println("Balls : " + BOWL.balls);
        System.out.println("\nBowling Average : " + BOWL.getBowlingAverage());
        System.out.println("Bowling Economy Rate : " + BOWL.getBowlingEconomyrate());
        System.out.println("Bowling Strike Rate : " + BOWL.getBowlingStrikerate());

    }
}

/*
 * ---OUT PUT---
 * 
 * Enter the Team1 :
 * Sri Lanka
 * Enter the Team2 :
 * India
 * Winning Team = India
 * 
 * ---Batsman Deatils---
 * Name : Dinesh Chandimal
 * Birthday : 18/11/1989
 * Height : 5.8
 * Country : Sri Lanaka
 * Runs : 774
 * Innings : 46
 * Ball Faced : 746
 * 
 * Batting Average : 0.0
 * Batting Strike Rate : 0.0
 * Not Eligible to play for the Twenty20 matches.
 * Highest Score : 96
 * 
 * ---Bowler Deatils---
 * Name : Lasith Malinga
 * Birthday : 28/08/1983
 * Height : 5.6
 * Country : Sri Lanka
 * Runs : 1780
 * Wickets : 90
 * Balls : 1451
 * 
 * Bowling Average : 19.0
 * Bowling Economy Rate : 7.0
 * Bowling Strike Rate : 16.0
 */