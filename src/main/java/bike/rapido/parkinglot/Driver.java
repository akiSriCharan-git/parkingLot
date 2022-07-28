package bike.rapido.parkinglot;

import java.util.HashMap;
class ParkingSpace {
    static HashMap<String, String> data = new HashMap<>();
    public static boolean isEmpty(String spaceId) {
        if(data.get(spaceId) == null) {
            return true;
        } else {
            return false;
        }
    }
    public static void add(String spaceId, String vehicleNo) {
        data.put(spaceId, vehicleNo);
    }
}

public class Driver {
    public boolean park(String spaceId, String vehicleNo) {
        if(ParkingSpace.isEmpty(spaceId)) {
            ParkingSpace.add(spaceId, vehicleNo);
            return true;
        } else {
            return false;
        }
    }
}
