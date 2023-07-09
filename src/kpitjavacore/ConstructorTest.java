package kpitjavacore;

public class ConstructorTest {
    public static void main(String[] args){

       Flight flobj1 = new Flight();
        Flight flobj2 = new Flight();
       flobj1.setFlight(3046,"indigo","vijayawada","Delhi");
        flobj2.setFlight(9831,"indigo","vijayawada","Delhi");

       flobj1.showFlight();
       flobj2.showFlight();
    }
}

class Flight{
    private int flightNumber;
    private String flightName;
    private String source;
    private String destination;

    void fly(){
        System.out.println("hey flight is taking off...");
    }

    void landing(){
        System.out.println("Turbulence!! land safe..");
    }


    Flight(){
        System.out.println("FLight() invoked...");
    }

    void setFlight(int i,String j,String k,String l){
        flightNumber = i;
        flightName  = j;
        source = k;
        destination = l;
    }

    void showFlight(){
        System.out.println("FLightNumber :"+flightNumber);
        System.out.println("FLightName :"+flightName);
        System.out.println("source :"+source);
        System.out.println("destination :"+destination);

    }


}


