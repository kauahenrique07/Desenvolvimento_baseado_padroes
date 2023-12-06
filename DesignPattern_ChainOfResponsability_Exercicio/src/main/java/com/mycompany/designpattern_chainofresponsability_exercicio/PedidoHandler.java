/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern_chainofresponsability_exercicio;

/**
 *
 * @author kauah
 */
public class PedidoHandler extends AbstractHandler {
    public void handle(Request request) {
        // Lógica de tratamento de Pedido
        System.out.println("Processando Pedido");
        super.handle(request);
    }
}
