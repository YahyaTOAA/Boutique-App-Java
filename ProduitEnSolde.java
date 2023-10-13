package com.example.myboutiqueapp;

import androidx.annotation.NonNull;

public class ProduitEnSolde extends Produit{
    private double remise;
    public ProduitEnSolde(int code,double prix,double remise){
        super(code,prix);
        try {
            if (remise>=0 && remise <=90){
                this.remise=remise;
            }
        }catch (Exception e){
            System.out.println("remise doit etre entre 0 et 90!");
        }

    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    @Override
    public double prixProduit() {
        return super.prixProduit()-(super.prixProduit()*(remise/100));
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString()+"\nProduit ; Nouveau Prix\n"+getCode()+" ; "+prixProduit();
    }
}
