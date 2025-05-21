package org.example.DesignPatern.ExoDesignPatern.ExoMaison;

import org.example.DesignPatern.creational.builder.Person;

public class Maison {

    private int nbrEtage;
    private boolean piscine;
    private String toiture;
    private String couleur;

    private Maison(Builder builder) {
        nbrEtage = builder.nbrEtage;
        piscine = builder.piscine;
        toiture = builder.toiture;
        couleur = builder.couleur;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "nbrEtage=" + nbrEtage +
                ", piscine=" + piscine +
                ", toiture='" + toiture + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }


    public static class Builder {

        private int nbrEtage;
        private boolean piscine;
        private String toiture;
        private String couleur;

        public Maison.Builder nbrEtage(int nbrEtage) {
            this.nbrEtage = nbrEtage;
            return this;
        }

        public Maison.Builder piscine(boolean piscine) {
            this.piscine = piscine;
            if (piscine == false){
                System.out.println("pas de piscine");
            }else System.out.println("avec piscine");
            return this;
        }

        public Maison.Builder toiture(String toiture) {
            this.toiture = toiture;
            return this;
        }

        public Maison.Builder couleur(String couleur) {
            this.couleur = couleur;
            return this;
        }

        public Maison build() {
            return new Maison(this);
        }


    }

}
