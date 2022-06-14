import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExperianAgencyTest {

    @Test
    void correctInstanceofExperianProductWithScoreEqualTo640() {

        Agency agencyProduct = AgencyFactory.getAgency("E", 600);

        //Print Product values
        System.out.println(agencyProduct);

        //Tests if intended product is created
        assertTrue(agencyProduct instanceof ExperianAgency);

        //Test for correct return value
        //Experian score is 600 + 40 = 640
        assertEquals(640, agencyProduct.getScore());



    }

}

