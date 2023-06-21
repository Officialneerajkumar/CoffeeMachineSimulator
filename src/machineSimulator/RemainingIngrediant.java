package machineSimulator;

public class RemainingIngrediant {
    private Integer water;
    private Integer milk;
    private Integer coffeeBeans;
    private Integer moneyBox;

    public void setWater(Integer water) {
        this.water = water;
    }

    public void setMilk(Integer milk) {
        this.milk = milk;
    }

    public void setCoffeeBeans(Integer coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public void setMoneyBox(Integer moneyBox) {
        this.moneyBox = moneyBox;
    }

    @Override
    public String toString() {
        return "RemainingIngrediant{" +
                "remainingWater=" + water +
                ", remainingMilk=" + milk +
                ", remainingCoffeeBeans=" + coffeeBeans +
                ", moneyCollected=" + moneyBox +
                '}';
    }
}
