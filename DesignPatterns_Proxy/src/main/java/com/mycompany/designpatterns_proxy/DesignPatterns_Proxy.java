/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpatterns_proxy;

/**
 *
 * @author kauah
 */
public class DesignPatterns_Proxy {

    public static void main(String[] args) {
        Library library = new Library();
        
        String[] fileNames = {"Harry Potter", "Pai Rico Pai Pobre", 
                                "Jogos Vorazes", "Diário de um Banana", 
                                "Senhor dos Anéis", "Design Patterns"};
        
        for (String fileName : fileNames) {
            library.add(new EBookProxy(fileName));
        }
        
        library.openEBook("Design Patterns");
    }
}
