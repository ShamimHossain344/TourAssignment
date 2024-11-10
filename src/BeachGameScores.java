public class BeachGameScores {

    public static void main(String[] args) {
        // 2D array to represent scores for each game
        // Each row is a game, and each column represents a team's score in that game
        int[][] scores = {
                {21, 18}, // Game 1: Team A scored 21, Team B scored 18
                {17, 21}, // Game 2: Team A scored 17, Team B scored 21
                {22, 20}, // Game 3: Team A scored 22, Team B scored 20
                {15, 25}  // Game 4: Team A scored 15, Team B scored 25
        };

        // Calculate and print total scores for each team
        int totalScoreTeamA = 0;
        int totalScoreTeamB = 0;

        for (int i = 0; i < scores.length; i++) {
            totalScoreTeamA += scores[i][0]; // Sum up scores for Team A
            totalScoreTeamB += scores[i][1]; // Sum up scores for Team B
        }

        // Print the total score for each team
        System.out.println("Total score for Team A: " + totalScoreTeamA);
        System.out.println("Total score for Team B: " + totalScoreTeamB);
    }
}
