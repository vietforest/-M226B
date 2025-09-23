package classes;
import Enum.*;
import Interfaces.Purchasable;

public abstract class DigitalContent implements Purchasable {
    private int id;
    private String name;
    private double basePrice;
    private double currentDiscount;

    public DigitalContent(int id, String name, double basePrice, double currentDiscount) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.currentDiscount = currentDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getCurrentDiscount() {
        return currentDiscount;
    }

    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount;
    }

    public abstract String getContentType();
    public abstract String getDescription();

    @Override
    public double calculatePrice() {
        return getBasePrice() * getCurrentDiscount();
    }

    @Override
    public double applyDiscount(double percentage) {
        return 0;
    }

    @Override
    public double getPriceWithtTax() {
        return Purchasable.super.getPriceWithtTax();
    }
}
