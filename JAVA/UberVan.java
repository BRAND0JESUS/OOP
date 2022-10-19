import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {       /* extends means inheritance */
    Map<String, Map<String, Integer >> typeCarAccepted;      /* Map<brand, Map<model, year>>*/
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String,
                Map<String, Integer >> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}