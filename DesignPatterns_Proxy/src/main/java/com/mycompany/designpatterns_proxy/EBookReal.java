/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterns_proxy;

/**
 *
 * @author kauah
 */
public class EBookReal implements EBook {
    
    private String fileName;
    
    public EBookReal(String fileName) {
        this.fileName = fileName;
        load();
    }
        
        private void load () {
            System.out.println("Loading the ebook" + fileName);
        }
        
        public void show(){
            System.out.println("Showing the ebook" + fileName);
        }
        
        public String getFileName(){
            return fileName;
        }
    }
