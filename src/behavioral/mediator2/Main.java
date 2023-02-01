package behavioral.mediator2;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.flightCode = "TR032";

        Plane plane2 = new Plane();
        plane2.flightCode = "TR034";

        Plane plane3 = new Plane();
        plane3.flightCode = "TR036";

        plane1.requestLanding();
        plane2.requestDeparture();
        plane3.requestLanding();
    }
}
