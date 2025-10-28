package interfaces;

public interface GPS {
    String setDestination(String destination);
    double setCostPerDistance(double distance);
    void startVehicle();
    String stopVehicle();

}
