package behavioral.mediator2;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    public static List<Plane> landingPlanes = new ArrayList<>();
    public static List<Plane> departurePlanes = new ArrayList<>();

    public static void requestLanding(Plane plane){
        System.out.println("İniş isteğiniz alındı. İniş sıranız: " + (landingPlanes.size() + 1));
        landingPlanes.add(plane);
    }

    public static void requestDeparture(Plane plane){
        System.out.println("Kalkış isteğiniz alındı. Kalkış sıranız: "
                + (departurePlanes.size() + 1));
        departurePlanes.add(plane);
    }
}
