package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane  extends Airplane{

    // fields(Q2)
    private int MAX_NUM_PASSENGERS;
    private ArrayList <String> passengerList = new ArrayList<>();

    public PassengerAirplane(String type, int MAX_NUM_PASSENGERS) {
        super(type);
        this.MAX_NUM_PASSENGERS = MAX_NUM_PASSENGERS;
    }

    public PassengerAirplane(String type, int MAX_NUM_PASSENGERS, ArrayList<String> passengerList) {
        super(type);
        this.MAX_NUM_PASSENGERS = MAX_NUM_PASSENGERS;
        this.passengerList = passengerList;
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                '}' + super.toString();
    }

    public int getMAX_NUM_PASSENGERS() {
        return MAX_NUM_PASSENGERS;
    }

    public void setMAX_NUM_PASSENGERS(int MAX_NUM_PASSENGERS) {
        this.MAX_NUM_PASSENGERS = MAX_NUM_PASSENGERS;
    }

    public ArrayList<String> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<String> passengerList) {
        this.passengerList = passengerList;
    }

    public void addPassenger(String name) {
        if(passengerList.size() < MAX_NUM_PASSENGERS) {
            passengerList.add(name);
        }
        else{
            System.out.println("No more space!!!");
        }



    }


} // end of PassengerAirplane