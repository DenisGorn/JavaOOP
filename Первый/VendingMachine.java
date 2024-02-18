import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    void addProduct(Product product);
    Product getProduct(String name);
    Product getProduct(double cost);
}
