import java.util.UUID;

public class TransUnionAgency extends Agency {

    private final String AGENCY = "TransUnion";
    private String id;
    private int score;

    public TransUnionAgency(Integer score) {
        this.id = UUID.randomUUID().toString();
        //Arbitrary addition to create individual score based on agency selected
        this.score = score - 20;
    }

    //Create unique ID for this score
    public static String createID() {
        String id = UUID.randomUUID().toString();
        return id;
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



