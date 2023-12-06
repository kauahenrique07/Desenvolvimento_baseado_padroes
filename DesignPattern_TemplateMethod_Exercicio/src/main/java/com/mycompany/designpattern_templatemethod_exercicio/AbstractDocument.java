/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpattern_templatemethod_exercicio;

/**
 *
 * @author kauah
 */
abstract class AbstractDocument {

    // Template method que define a sequência de passos
    public final void processDocument() {
        save();
        transmit();
        consult();
        cancel();
        invalidateNumbering();
    }

    // Métodos abstratos ou concretos para cada passo
    abstract void save();
    abstract void transmit();
    abstract void consult();

    // Métodos concretos podem ser definidos na classe base, se forem comuns a todos os documentos
    void cancel() {
        System.out.println("Cancelando documento");
    }

    void invalidateNumbering() {
        System.out.println("Inutilizando numeração");
    }
}