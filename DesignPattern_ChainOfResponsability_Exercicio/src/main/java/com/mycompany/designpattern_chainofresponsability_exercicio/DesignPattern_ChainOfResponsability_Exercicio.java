/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpattern_chainofresponsability_exercicio;

/**
 *
 * @author kauah
 */
public class DesignPattern_ChainOfResponsability_Exercicio {

    public static void main(String[] args) {
        // Configurar a cadeia
        Handler pedido = new PedidoHandler();
        Handler envioComprovantes = new EnvioComprovantesHandler();
        Handler analise = new AnaliseHandler();
        Handler aprovacao = new AprovacaoHandler();

        pedido.setNext(envioComprovantes);
        envioComprovantes.setNext(analise);
        analise.setNext(aprovacao);

        // Criar e processar solicitações
        Request request1 = new Request(false); // Solicitação normal
        pedido.handle(request1);

        System.out.println("\nSolicitação C-Level:");
        Request request2 = new Request(true); // Solicitação C-Level
        pedido.handle(request2);
    }
}
