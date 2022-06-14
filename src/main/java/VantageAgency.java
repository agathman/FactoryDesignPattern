import java.util.UUID;

public class VantageAgency extends Agency {

    private final String AGENCY = "Vantage";
    private String id;
    private int score;

    public VantageAgency(Integer score) {
        this.id = UUID.randomUUID().toString();
        //Arbitrary addition to create individual score based on agency selected
        this.score = score + 30;
    }


    @Override
    public String getAGENCY() {
        return this.AGENCY;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public int getScore() {
        return this.score;
    }
}



