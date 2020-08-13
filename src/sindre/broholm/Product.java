package sindre.broholm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Product{

    void printDetails();



    /*public String findProductById(long inputFromUser, List<Product> products){
        String temp = null;
        for (Product prod: products) {
            if(prod.getProductId() == inputFromUser){
                temp = ("FOUND THIS PRODUCT: \n" + prod.toString());
                return temp;

            }
        }
        temp = "No item found";
        return temp;
    }*/
}
