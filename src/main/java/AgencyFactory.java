public class AgencyFactory {

    // Factory method to generate object of concrete product "ExperianScore", "TransUnionScore", or "VantageScore"
    //Receive parameters of agency and score
    public static Agency getAgency(String agency, Integer score) {

        if (agency == null || agency.isEmpty() && score == null || score == 0) {
            return null;
        }

        if ("E".equalsIgnoreCase(agency)) {
            return new ExperianAgency(score);
        }
        if ("T".equalsIgnoreCase(agency)) {
            return new TransUnionAgency(score);
        }
        if ("V".equalsIgnoreCase(agency)) {
            return new VantageAgency(score);
        }

        return null;
        }
    }


