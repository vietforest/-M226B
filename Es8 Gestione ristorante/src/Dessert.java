import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

public class Dessert implements MenuItem{
    private String name;
    private double basePrice;
    private boolean hasExtraTopping;

    public Dessert(String name, double basePrice, boolean hasExtraTopping) {
        this.name = name;
        this.basePrice = basePrice;
        this.hasExtraTopping = hasExtraTopping;
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

    public boolean isHasExtraTopping() {
        return hasExtraTopping;
    }

    public void setHasExtraTopping(boolean hasExtraTopping) {
        this.hasExtraTopping = hasExtraTopping;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dessert dessert = (Dessert) o;
        return Double.compare(basePrice, dessert.basePrice) == 0 && hasExtraTopping == dessert.hasExtraTopping && Objects.equals(name, dessert.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, basePrice, hasExtraTopping);
    }

    @Override
    public double calculatePrice() {
        return 12;
    }

    @Override
    public String getDescription() {
        return getName();
    }

    @Override
    public int getPreparationTime() {
        return 15;
    }

    @Override
    public String toString() {
        return getName().toUpperCase(Locale.ROOT) + "\n" +
                "Dessert " + getName() +"\n" +
                "Prezzo: " + calculatePrice() +"\n" +
                "Tempo preparazione: " + getPreparationTime() + " m";
    }
}
