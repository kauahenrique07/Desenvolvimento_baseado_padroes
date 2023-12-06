/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpattern_templatemethod_exercicio;

/**
 *
 * @author kauah
 */
public class DesignPattern_TemplateMethod_Exercicio {

    public static void main(String[] args) {
        AbstractDocument invoice = new InvoiceDocument();
        AbstractDocument order = new OrderDocument();

        invoice.processDocument();
        System.out.println("");
        order.processDocument();
    }
}
