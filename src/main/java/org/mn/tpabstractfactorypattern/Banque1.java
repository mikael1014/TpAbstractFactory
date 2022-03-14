package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public class Banque1 implements Banque {

    private final String nomBanque;

    public Banque1() {
        this.nomBanque = "Banque1";
    }

    @Override
    public String GetNomBanque() {
        return nomBanque;
    }
}
