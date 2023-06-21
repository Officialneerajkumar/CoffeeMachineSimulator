package machineSimulator;

public class CoffeeMachine {

    private Integer milk=0;
    private Integer water=0;
    private Integer coffeeBeans=0;
    private Integer moneyBox=0;

    public CoffeeMachine() {
    }

    public CoffeeMachine(Integer milk, Integer water, Integer coffeeBeans) {
        this.milk = milk;
        this.water = water;
        this.coffeeBeans = coffeeBeans;
    }

    public Integer getMilk() {
        return milk;
    }

    public void setMilk(Integer milk) {
        this.milk = milk;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(Integer coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public Integer getMoneyBox() {
        return moneyBox;
    }

    public void setMoneyBox(Integer moneyBox) {
        this.moneyBox = moneyBox;
    }
}
