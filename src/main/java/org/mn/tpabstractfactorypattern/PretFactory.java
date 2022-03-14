package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public class PretFactory extends AbstractFactory {

    @Override
    public Banque getBanque(String banque) {
                return null;

       
        }

    @Override
    public Pret getPret(String pret) {
         switch(pret) {
            case "Maison":
                return new PretMaison();
            case "Business":
                return new PretBusiness();
            case "Education":
                return new PretEducation();
            default:
                return null;    }
    }

}


