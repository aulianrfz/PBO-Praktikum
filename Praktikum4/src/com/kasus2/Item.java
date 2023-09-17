package com.kasus2;

public class Item {
    
    private String name;
    
    // Konstuktor private
    private Item() {
        name = "Ipin";
    }

    // Konstruktor publik
    public Item(String name) {
        this();  // Memanggil konstruktor private Item()
        System.out.println(this.name);
    }
}
