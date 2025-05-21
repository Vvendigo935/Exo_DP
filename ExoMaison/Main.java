package org.example.DesignPatern.ExoDesignPatern.ExoMaison;

public class Main {
    public static void main(String[] args) {

        Maison maison1 = new Maison.Builder().nbrEtage(8).piscine(true).toiture("Tuile en poil de mammouth").couleur("Vert bouteille").build();
        System.out.println(maison1);

        Maison maison2 = new Maison.Builder().couleur("Rose Saumon").piscine(false).nbrEtage(74).toiture("Des tuiles... non mais genre les biscuits vous savez, les tuiles au citron").build();
        System.out.println(maison2);

    }
}
