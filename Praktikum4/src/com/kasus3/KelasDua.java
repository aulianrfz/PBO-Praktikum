package com.kasus3;

class KelasSatu
{
    // Initialization Block
    {
        System.out.println(11);
    }
 
    // Static Block
    static
    {
        System.out.println(2);
    }
    
    // Konstruktor dengan argumen
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    
    // Konstuktor tanpa argumen
    public KelasSatu()
    {
        System.out.println(4);
    }
}

class KelasDua
{
    {
        System.out.println(5);
    }
    
    // Metode main
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();      // Memanggil KelasSatu tanpa argumen
        KelasSatu dua = new KelasSatu(10);   // Memanggil KelasSatu dengan argumen
    }
}

