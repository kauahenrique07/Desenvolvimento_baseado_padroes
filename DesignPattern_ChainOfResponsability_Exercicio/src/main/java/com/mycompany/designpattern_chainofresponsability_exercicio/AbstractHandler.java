/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern_chainofresponsability_exercicio;

/**
 *
 * @author kauah
 */
abstract class AbstractHandler implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
