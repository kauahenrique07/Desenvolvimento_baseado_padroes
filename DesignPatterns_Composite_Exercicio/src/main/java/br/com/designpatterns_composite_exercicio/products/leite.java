
package br.com.designpatterns_composite_exercicio.products;

public class leite extends Product {

    public leite(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
    
}
