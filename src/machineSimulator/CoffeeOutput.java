package machineSimulator;

public class CoffeeOutput {
    private String nameOfCoffee;
    private Integer water;
    private Integer milk;
    private Integer coffeeBeans;
    private Integer price;

    public CoffeeOutput() {
    }

    public String getNameOfCoffee() {
        return nameOfCoffee;
    }

    public void setNameOfCoffee(String nameOfCoffee) {
        this.nameOfCoffee = nameOfCoffee;
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getMilk() {
        return milk;
    }

    public void setMilk(Integer milk) {
        this.milk = milk;
    }

    public Integer getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(Integer coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CoffeeOutput{" +
                "nameOfCoffee='" + nameOfCoffee + '\'' +
                ", water=" + water +
                ", milk=" + milk +
                ", coffeeBeans=" + coffeeBeans +
                ", price=" + price +
                '}';
    }
}
