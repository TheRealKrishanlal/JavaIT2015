public class Match {
    String matchCode;
    Player player1;
    Player player2;
    String score;
    public Match(String inMatchCode, Player inPlayer1, Player inPlayer2){

        this.matchCode = inMatchCode;
        this.player1 = inPlayer1;
        this.player2 = inPlayer2;
        this.score = "X";

    }

    public String getMatchCode(){

        return matchCode;
    }

    public void setScore(String inScore){

        score = inScore;
    }

    public String toString(){


        return (player1 + "vs. " + player2 + " " + score);
    }
}
