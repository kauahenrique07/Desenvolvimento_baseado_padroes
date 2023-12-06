/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns_proxy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kauah
 */
public class Library {
    
    private Map<String, EBook> ebooks = new HashMap<>();
            
            public void add(EBook ebook) {
                ebooks.put(ebook.getFileName(), ebook);
            }
            
            public void openEBook(String fileName) {
                ebooks.get(fileName).show();
            }
    
}
