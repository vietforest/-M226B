package classes;
import Interfaces.Purchasable;
import Interfaces.Purchasable;
public class AudioBook extends DigitalContent{

    private String narrator;
    private double duration;
    private String language;

    public AudioBook(int id, String name, double basePrice, double currentDiscount, String narrator, double duration, String language) {
        super(id, name, basePrice, currentDiscount);
        this.narrator = narrator;
        this.duration = duration;
        this.language = language;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public void getFormattedDuration(){
        int hours = (int) (duration / 3600);
        int minutes = (int) (duration % 3600 / 60);
        System.out.println(hours + " hours " + minutes + " minutes");
    }

    @Override
    public String getContentType() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double calculatePrice() {
        getDuration();
        int hours = (int) (duration / 3600);
        int minutes = (int) (duration % 3600 / 60);
        double price;
        if(hours > 8){
            price = super.calculatePrice() + getBasePrice()/100 * 20;
            return price;
        }
        else {
            return super.calculatePrice();
        }
    }

    @Override
    public double applyDiscount(double percentage) {
        return 0;
    }

    @Override
    public double getPriceWithtTax() {
        return super.getPriceWithtTax();
    }
}
