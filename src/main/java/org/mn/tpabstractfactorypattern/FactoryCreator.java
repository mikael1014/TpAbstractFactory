/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public class FactoryCreator {

    public static AbstractFactory getFactory(String choix) {
        switch (choix) {
            case "Banque":
                return new BanqueFactory();
            case "Pret":
                return new PretFactory();
            default:
                return null;
        }
    }
}
