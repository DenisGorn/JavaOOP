public class HotDrink extends BottleOfWater{
    private int temperature;
    public HotDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public void setVolume(double volume) {
        super.setVolume(volume);
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + '\'' +
                ", volume=" + super.getVolume() + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
