import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public String toString() {
        return productId + "-" + productName + " (" + category + ")";
    }
}

public class Searching {
    public static int linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return i;
             }
        }
        return -1;
    }
    public static int binarySearch(Product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id) return mid;
            if (products[mid].productId < id) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] sproducts = {
            new Product(105, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(110, "Bag", "Accessories")
        };
       
        System.out.println("Linear Search for productId 110:");
        int index1 = linearSearch(sproducts, 110);
        if (index1 != -1) System.out.println("Found: " + sproducts[index1]);
        else System.out.println("Not Found");

        System.out.println("\nBinary Search for productId 105:");
        int index2 = binarySearch(sproducts, 105);
        if (index2 != -1) System.out.println("Found: " + sproducts[index2]);
        else System.out.println("Not Found");
    }
}
