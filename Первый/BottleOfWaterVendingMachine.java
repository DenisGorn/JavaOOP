import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    List<Product> productList = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
//        ((BottleOfWater)product).getName();
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    @Override
    public Product getProduct(double cost) {
        for (Product product : productList) {
            if (product.getCost() == cost)
                return product;
        }
        return null;
    }
}
