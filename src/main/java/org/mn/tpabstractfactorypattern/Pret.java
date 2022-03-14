package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public abstract class Pret {

    protected double taux;

    abstract void getTaux();

    public void calculerPaimentPret(double montantPret) {
        double paiment = montantPret * (1 + (taux/100));

        System.out.println("vous allez devoir " + paiment + " pour le montant " + montantPret + " montant de Pret");
    }

}
