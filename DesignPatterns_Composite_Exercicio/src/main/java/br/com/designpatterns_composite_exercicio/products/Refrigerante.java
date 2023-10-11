
package br.com.designpatterns_composite_exercicio.products;

public class Refrigerante extends Product {

    public Refrigerante(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
    
}
