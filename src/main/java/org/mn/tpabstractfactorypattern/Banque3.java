package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public class Banque3 implements Banque {

    private final String nomBanque;

    public Banque3() {
        this.nomBanque = "Banque3";
    }

    @Override
    public String GetNomBanque() {
        return nomBanque;
    }
}
