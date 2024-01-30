import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TournamentManager {
    private Player[] playerArr = new Player[32];
    private Match[] match = new Match[16];

    private int count;
    public TournamentManager(){

        try {
            Scanner scanFile = new Scanner(new File("players.txt"));

            while (scanFile.hasNext()) {
                String line = scanFile.nextLine();
                Scanner scanLine = new Scanner(line).useDelimiter(",");

                int seed = scanLine.nextInt();
                String fullName = scanLine.next();
                String country = scanLine.next();

                playerArr[count] = new Player(seed, fullName, country);
                count++;
            }
            scanFile.close();  // Close the scanner after reading the file
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }



    }

    public String listAllPlayers() {
        StringBuilder result = new StringBuilder();

        for (Player player : playerArr) {
            if (player != null) {
                result.append(player.toString()).append("\n");
            }
        }

        return result.toString();
    }
}
