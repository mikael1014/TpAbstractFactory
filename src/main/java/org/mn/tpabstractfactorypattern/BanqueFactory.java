package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public class BanqueFactory extends AbstractFactory {

    @Override
    public Banque getBanque(String banque) {
        switch(banque) {
            case "Banque1":
                return new Banque1();
            case "Banque2":
                return new Banque2();
            case "Banque3":
                return new Banque3();
            default:
                return null;
        }
    }

    @Override
    public Pret getPret(String pret) {
        return null;

    }

}
