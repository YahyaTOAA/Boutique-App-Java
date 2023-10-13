package com.example.myboutiqueapp;

import androidx.annotation.NonNull;

public class Produit {
    private int code;
    private double prix;
    public Produit(int code,double prix){
        this.code=code;
        this.prix=prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public double prixProduit(){
        return getPrix();
    }

    @NonNull
    @Override
    public String toString() {
        return "Produit ; Prix\n"+getCode()+" ; "+getPrix();
    }
    public boolean equals(Object obj){
        if (this.getCode()==((Produit)obj).getCode()){
            return true;
        }else {
            return false;
        }
    }
}
