package com.example.myboutiqueapp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Boutique {
    private List<Produit>Produits;
    public Boutique(){
        this.Produits=new ArrayList<>();
    }
    public int indiceDe(int code){
        for (int i=0;i<Produits.size();i++){
            if (Produits.get(i).getCode()==code){
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Produit p)throws Exception{
        int F=indiceDe(p.getCode());
        if (F==-1){
            Produits.add(p);
        }else {
            throw new Exception("Produit deja existe");
        }
    }
    public boolean supprimer(int code){
        int F=indiceDe(code);
        if (F==-1){
            return false;
        }else {
            for (int i=0;i<Produits.size();i++){
                if (Produits.get(i).getCode()==code){
                    Produits.remove(i);
                }
            }
            return true;
        }
    }
    public boolean supprimer(Produit p){
        if (Produits.contains(p)){
            Produits.remove(p);
            return true;
        }else {
            return false;
        }
    }
    public int nombreProduitsEnSolde(){
        int nombreProduitsEnSolde=0;
        for (Produit p:Produits) {
            nombreProduitsEnSolde+= p.getCode();
        }
        return nombreProduitsEnSolde;
    }
    public void enregistrer(String chemin) throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter(chemin));
        for (Produit p:Produits) {
            writer.write("Produit :"+p.getCode()+" Prix :"+p.getPrix());
        }
        writer.close();
    }
}
