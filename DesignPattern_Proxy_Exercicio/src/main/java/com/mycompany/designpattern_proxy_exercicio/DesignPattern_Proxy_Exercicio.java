/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpattern_proxy_exercicio;

/**
 *
 * @author kauah
 */
public class DesignPattern_Proxy_Exercicio {

    public static void main(String[] args) {
       Image image = new ProxyImage("test_image.jpg");

        // A imagem é carregada apenas na primeira vez que é solicitada
        image.display();
        System.out.println("");
        // A imagem não é recarregada na segunda vez, pois já está em cache
        image.display();
    }
}
