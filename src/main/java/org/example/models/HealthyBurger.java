package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private  double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, breadRollType, price, "Tofu");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Added Ingredients: " + healthyExtra1Name + " " + healthyExtra2Name);
        double newPrice = super.getPrice() + healthyExtra1Price + healthyExtra2Price;
        super.setPrice(newPrice);
        return newPrice;
    }
}
