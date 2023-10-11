package br.com.designpatterns_composite_exercicio;

import br.com.designpatterns_composite_exercicio.products.Suco;
import br.com.designpatterns_composite_exercicio.products.leite;
import br.com.designpatterns_composite_exercicio.products.Refrigerante;

public class DesignPatterns_Composite_Exercicio {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(new CompositeBox(
                        new Suco("Uva", 100.00),
                        new Refrigerante("Coca-cola", 150.00)
                ),
                 new CompositeBox(
                        new leite("LEITE SOJA", 30.00),
                        new leite("LEITE INTEGRAL", 40.00)
                )
                 
        );
        
        

        System.out.println("TOTAL GASTO: \n" + deliveryService.calculateOrderPrice());

    }
}
