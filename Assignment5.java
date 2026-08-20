abstract class LibraryItem {
    private String title;
    protected int itemId;
    protected boolean issued;
    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.issued = false;
    }
    public String getTitle() {
        return title;
    }
    abstract double calculateFine(int daysLate);
    void displayInfo() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
    }
    void showStatus() {
        if (issued) {
            System.out.println("Status: Issued");
        } else {
            System.out.println("Status: Available");
        }
    }
}
interface Issuable {
    void issueItem();
    void returnItem(int daysLate);
}
class Book extends LibraryItem implements Issuable {
    private double finePerDay = 5;
    Book(String title, int itemId) {
        super(title, itemId);
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * finePerDay;
    }
    @Override
    public void issueItem() {
        issued = true;
        System.out.println(getTitle() + " (Book) issued.");
    }
    @Override
    public void returnItem(int daysLate) {
        issued = false;

        double fine = calculateFine(daysLate);

        System.out.println(
            getTitle() + " (Book) returned. Fine = Rs." + fine
        );
    }
    @Override
    void displayInfo() {
        System.out.println("Book: " + getTitle());
        System.out.println("ID: " + itemId);
    }
}
class Magazine extends LibraryItem implements Issuable {
    private double finePerDay = 2;
    Magazine(String title, int itemId) {
        super(title, itemId);
    }
    @Override
    double calculateFine(int daysLate) {
        return daysLate * finePerDay;
    }
    @Override
    public void issueItem() {
        issued = true;
        System.out.println(getTitle() + " (Magazine) issued.");
    }
    @Override
    public void returnItem(int daysLate) {
        issued = false;

        double fine = calculateFine(daysLate);

        System.out.println(
            getTitle() + " (Magazine) returned. Fine = Rs." + fine
        );
    }
    @Override
    void displayInfo() {
        System.out.println("Magazine: " + getTitle());
        System.out.println("ID: " + itemId);
    }
}

public class Assignment5 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 101);
        Book book2 = new Book("Data Structures", 102);
        Magazine magazine1 = new Magazine("Science Today", 201);
        Magazine magazine2 = new Magazine("Tech World", 202);
        System.out.println("----- LIBRARY ITEMS -----");
        book1.displayInfo();
        book1.showStatus();
        System.out.println();
        book2.displayInfo();
        book2.showStatus();
        System.out.println();
        magazine1.displayInfo();
        magazine1.showStatus();
        System.out.println();
        magazine2.displayInfo();
        magazine2.showStatus();
        System.out.println("\n----- ISSUING ITEMS -----");
        book1.issueItem();
        book2.issueItem();
        magazine1.issueItem();
        magazine2.issueItem();
        System.out.println("\n----- POLYMORPHISM -----");
        LibraryItem[] items = {
            book1,
            book2,
            magazine1,
            magazine2
        };
        for (LibraryItem item : items) {

            item.displayInfo();
            System.out.println(
                "Fine for 4 days late: Rs."
                + item.calculateFine(4)
            );
            System.out.println();
        }
        System.out.println("----- RETURNING ITEMS -----");
        book1.returnItem(4);
        book2.returnItem(2);
        magazine1.returnItem(4);
        magazine2.returnItem(2);
    }
}