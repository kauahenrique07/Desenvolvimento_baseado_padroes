package br.com.designpatterns_composite_exercicio.products;

public class Suco extends Product{

    public Suco(String title, double price) {
        super(title, price);
    }    
    
    @Override
    public double calculatePrice() {
    return getPrice();
    }
    
}
