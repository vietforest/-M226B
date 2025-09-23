package classes;
import Enum.*;
import Interfaces.Purchasable;
public class EBook extends DigitalContent {
    private Genre genre;
    private int pageCount;
    private boolean isIllustrated;
    public EBook(int id, String name, double basePrice, double currentDiscount, Genre genre, int pageCount, boolean isIllustrated) {
        super(id, name, basePrice, currentDiscount);
        this.genre = genre;
        this.pageCount = pageCount;
        this.isIllustrated = isIllustrated;
    }

    public double getReadingTime(){
        return getPageCount() * 2;
    }


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isIllustrated() {
        return isIllustrated;
    }

    public void setIllustrated(boolean illustrated) {
        isIllustrated = illustrated;
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
        return getBasePrice() * 10;
    }

    @Override
    public double applyDiscount(double percentage) {
        return 0;
    }

    @Override
    public double getPriceWithtTax() {
        return super.getPriceWithtTax();
    }

    @Override
    public String toString() {
        return "EBook{" +
                "genre=" + genre +
                ", pageCount=" + pageCount +
                ", isIllustrated=" + isIllustrated +
                '}';
    }
}
