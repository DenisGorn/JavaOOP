import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine{
    List<Product> productList = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if(product.getName().equals(name))
                return product;
        }
        return null;
    }

    @Override
    public Product getProduct(double cost) {
        for (Product product : productList) {
            if(product.getCost() == cost)
                return product;
        }
        return null;
    }
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((HotDrink)product).getVolume() == volume && ((HotDrink)product).getTemperature() == temperature)
                return product;
        }
        return null;
    }
}
