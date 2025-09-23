package classes;
import Enum.*;
import Interfaces.Purchasable;
import java.time.LocalDate;
import java.time.Period;

public class DigitalMagazine extends DigitalContent{

    private int issueNumber;
    private LocalDate pubblicationDate;
    private String category;

    public DigitalMagazine(int id, String name, double basePrice, double currentDiscount, int issueNumber, LocalDate pubblicationDate, String category) {
        super(id, name, basePrice, currentDiscount);
        this.issueNumber = issueNumber;
        this.pubblicationDate = pubblicationDate;
        this.category = category;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public LocalDate getPubblicationDate() {
        return pubblicationDate;
    }

    public void setPubblicationDate(LocalDate pubblicationDate) {
        this.pubblicationDate = pubblicationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Period isRecentIssue(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(pubblicationDate, today);
        return period;
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
        return super.calculatePrice() + getBasePrice()/100*20;
    }

    @Override
    public String toString() {
        return "DigitalMagazine{" +
                "issueNumber=" + issueNumber +
                ", pubblicationDate=" + pubblicationDate +
                ", category='" + category + '\'' +
                '}';
    }
}
