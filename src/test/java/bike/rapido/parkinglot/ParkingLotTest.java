package bike.rapido.parkinglot;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    public void whetherTheDriverCanParkAt201() {
        String spaceId = "201";
        String vehicleNo = "KA01BA4360";

        boolean canDriverPark = new Driver().park(spaceId, vehicleNo);

        assertEquals(true, canDriverPark);
    }
    @Test
    public void whether302IsEmptyOrNot() {
        String spaceId = "302";

        boolean isSpaceFree = new ParkingSpace().isEmpty(spaceId);

        assertEquals(true, isSpaceFree);
    }

    @Test
    public void whetherAnotherDriverCanParkAt201If201IsOccupied() {
        String spaceId = "201";
        String vehicle1 = "KA01BA5792";
        String vehicle2 = "KA01AB5678";

        new Driver().park(spaceId, vehicle1);
        boolean canDriverPark = new Driver().park(spaceId, vehicle2);

        assertEquals(false, canDriverPark);
    }
}
