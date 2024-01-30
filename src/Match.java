public class Match {
    String matchCode;
    Player player1;
    Player player2;
    String score;
    public Match(String inMatchCode, Player inPlayer1, Player inPlayer2){


    }

    public String getMatchCode(){

        return matchCode;
    }

    public void setScore(String inScore){


    }

    public String toString(){


        return (player1 + "vs. " + player2 + " " + score);
    }
}
