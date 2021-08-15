package lesson6;

public class RiverShip  extends WaterTransport{
    private double cost;

    public RiverShip(String number, int capacity, double cost) {
        super(number, capacity);
        this.cost = cost;
    }

    @Override
    public void dingDong() {
        System.out.println("River ship ringing");
    }

    @Override
    public int stopTimeSec() {
        return 0;
    }
}
