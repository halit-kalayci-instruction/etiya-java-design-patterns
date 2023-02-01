package behavioral.mediator2;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    public String flightCode;

    public void requestLanding(){
        Airport.requestLanding(this);
    }
    public void requestDeparture(){
        Airport.requestDeparture(this);
    }
}
