package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public abstract class AbstractFactory {

    public abstract Banque getBanque(String banque);

    public abstract Pret getPret(String pret);

}
