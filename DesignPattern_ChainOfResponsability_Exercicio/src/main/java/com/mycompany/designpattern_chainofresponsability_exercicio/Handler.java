/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.designpattern_chainofresponsability_exercicio;

/**
 *
 * @author kauah
 */
public interface Handler {
    void setNext(Handler handler);
    void handle(Request request);
}
