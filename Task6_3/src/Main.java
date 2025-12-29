import java.util.*;

public class Main {

    public static void main(String[] args){

        HashMap<String,Product> mapProducts = new HashMap<>();

        mapProducts.put("Стич", new Product(15, 17.61));
        mapProducts.put("Лабубу", new Product(17, 16.25));
        mapProducts.put("Плюшевый хомяк повторюшка", new Product(16, 21.63));
        mapProducts.put("Плюшевый слон", new Product(35, 20.33));


        for (Map.Entry<String, Product> product : mapProducts.entrySet()) {
            System.out.printf("%s:\nРазмер: %.2f см.\nЦена: %.2f бел. р.\n",product.getKey(), product.getValue().getSize(), product.getValue().getPrice());
            System.out.println();
        }

        for (String productName : mapProducts.keySet()) {
            System.out.printf("Название игрушки: %s \n", productName);
        }
        System.out.println();

        for (Product product : mapProducts.values()) {
            System.out.printf("Размер: %.2f см.\nЦена: %.2f бел. р.\n", product.getSize(), product.getPrice());
            System.out.println();
        }

        iterateOverEntrySet(mapProducts);
        iterateOverKeySet(mapProducts.keySet());
        iterateOverValues(mapProducts.values());
    }

    public static void iterateOverEntrySet(Map<String, Product> mapProducts) {
        System.out.println("Метод iterateOverEntrySet:");
        for (Map.Entry<String, Product> product : mapProducts.entrySet()) {
            System.out.printf("%s:\nРазмер: %.2f см.\nЦена: %.2f бел. р.\n",product.getKey(), product.getValue().getSize(), product.getValue().getPrice());
            System.out.println();
        }
    }

    public static void iterateOverKeySet(Set<String> nameProducts) {
        System.out.println("Метод iterateOverKeySet:");
        for (String productName : nameProducts) {
            System.out.printf("Название игрушки: %s \n", productName);
        }
        System.out.println();
    }

    public static void iterateOverValues(Collection<Product> products) {
        System.out.println("Метод iterateOverValues:");
        for (Product product : products) {
            System.out.printf("Размер: %.2f см.\nЦена: %.2f бел. р.\n", product.getSize(), product.getPrice());
            System.out.println();
        }
    }
}