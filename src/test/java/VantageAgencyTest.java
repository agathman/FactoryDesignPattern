import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class VantageAgencyTest {

    @Test
    void correctInstanceofVantageProductWithScoreEqualTo530() {

        Agency agencyProduct = AgencyFactory.getAgency("V", 500);

        //Tests if intended product is created
        assertTrue(agencyProduct instanceof VantageAgency);

        //Test for correct return value
        //Vantage score is 500 + 30 = 530
        assertEquals(530, agencyProduct.getScore());

    }

}

