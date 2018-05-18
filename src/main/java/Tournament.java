import java.util.Date;

/**
 * @author mferrufino
 */
public class Tournament {
    private String tournamentName;
    private Date startDate;
    //rules for matches
    private int winPoints;
    private int losePoints;
    private int drawPoints;

    public Tournament(String name) {
        tournamentName = name;
    }
}
