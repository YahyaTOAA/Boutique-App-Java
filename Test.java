package com.example.myboutiqueapp;

public class Test {
    public static void main(String[] args) throws Exception {

        Produit p1=new ProduitEnSolde(1,200,30);
        Produit p2=new ProduitEnSolde(1,100,10);
        Produit p3=new ProduitEnSolde(8,3000,10);

        Boutique b = new Boutique();

        System.out.println(p1.equals(p2));
        System.out.println(p1.prixProduit());
        System.out.println(p2.toString());

        b.ajouter(new Produit(2,4));
        b.ajouter(new Produit(3,785));
        b.ajouter(new Produit(4,467));
        b.ajouter(new Produit(5,55));
        b.ajouter(new Produit(6,213));
        b.ajouter(new Produit(7,30));


        System.out.println(b.indiceDe(3));
        System.out.println(b.supprimer(4));
        System.out.println(b.supprimer(p3));

        System.out.println(b.nombreProduitsEnSolde());
        b.enregistrer("Boutique");
    }
}