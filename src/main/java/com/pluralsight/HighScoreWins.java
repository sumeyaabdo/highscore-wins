package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {

        //Creating Scanner to store the answer
        Scanner input = new Scanner(System.in);
        System.out.println("What is the game Score");

        String gameScore = input.nextLine();
        String[] gameParts = gameScore.split("\\|");


        String[] teamNames = gameParts[0].split(":");
        String homeTeam = teamNames[0];
        String visitorTeam = teamNames[1];



        String[] teamScores = gameParts[1].split(":");

        int homeTeamScore = Integer.parseInt(teamScores[0]);
        int visitorScore = Integer.parseInt(teamScores[1]);
        if (homeTeamScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeTeamScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");
        }



    }
}
