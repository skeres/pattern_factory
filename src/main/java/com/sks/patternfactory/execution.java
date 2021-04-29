package com.sks.patternfactory;

public class execution {
    public static void main(String[] args) {
        System.out.println("begin");

        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;

        System.out.println("Utilisation de la premiere fabrique");
        System.out.println("je crée un objet de nom produitA avec une méthode bien");
        produitA = produitFactory1.getProduitA();
        produitA.methodeA();

        System.out.println("");

        System.out.println("Utilisation de la seconde fabrique");
        System.out.println("je crée un ENCORE objet de MEME nom produitA mais avec une méthode SUPER bien");
        produitA = produitFactory2.getProduitA();
        produitA.methodeA();


        System.out.println("end");
    }
}
