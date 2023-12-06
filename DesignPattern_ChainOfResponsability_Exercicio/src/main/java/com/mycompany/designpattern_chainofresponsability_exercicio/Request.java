/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern_chainofresponsability_exercicio;

/**
 *
 * @author kauah
 */
public class Request {
    private boolean isCLevel;

    public Request(boolean isCLevel) {
        this.isCLevel = isCLevel;
    }

    public boolean isCLevel() {
        return isCLevel;
    }
}
