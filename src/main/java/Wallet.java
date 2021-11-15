import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> scannables;


    public Wallet(String name) {
        this.name = name;
        this.scannables= new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.scannables.size();
    }

    public void addItem(IScan item) {
        this.scannables.add(item);
    }

}
