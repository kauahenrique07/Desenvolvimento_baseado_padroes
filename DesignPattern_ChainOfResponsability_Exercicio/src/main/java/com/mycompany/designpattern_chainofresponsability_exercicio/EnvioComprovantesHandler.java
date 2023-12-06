/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern_chainofresponsability_exercicio;

/**
 *
 * @author kauah
 */
public class EnvioComprovantesHandler extends AbstractHandler {
    public void handle(Request request) {
        if (!request.isCLevel()) {
            // Lógica de Envio de Comprovantes
            System.out.println("Processando Envio de Comprovantes");
        }
        super.handle(request);
    }
}
