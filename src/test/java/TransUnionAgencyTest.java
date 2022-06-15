import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransUnionAgencyTest {

    @Test
    void correctInstanceofTransUnionProductWithScoreEqualTo520() {

        Agency agencyProduct = AgencyFactory.getAgency("T", 540);

        //Tests if intended product is created
        assertTrue(agencyProduct instanceof TransUnionAgency);

        //Test for correct return value
        //TransUnion score is 540 - 20 = 520
        assertEquals(520, agencyProduct.getScore());

    }

}

