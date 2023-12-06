/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern_templatemethod_exercicio;

/**
 *
 * @author kauah
 */
public class InvoiceDocument extends AbstractDocument{
    
    void save() {
        System.out.println("Salvando fatura");
    }

    void transmit() {
        System.out.println("Transmitindo fatura");
    }

    void consult() {
        System.out.println("Consultando fatura");
    }  
}