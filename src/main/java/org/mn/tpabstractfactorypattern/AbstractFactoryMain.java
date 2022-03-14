/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mn.tpabstractfactorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author Mike
 */
public class AbstractFactoryMain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Saisir le nom de la banque");
        String nomBanque = br.readLine();

        System.out.println("Saisir le type de pret");
        String nomPret = br.readLine();

        AbstractFactory banqueFactory = FactoryCreator.getFactory("Banque");
        Banque banque = banqueFactory.getBanque(nomBanque);

        System.out.println("Saisir le montant du pret ");
        double pretMontant = Double.parseDouble(br.readLine());

        System.out.println("Vous allez faire un prêt a la banque " + banque.GetNomBanque());
        AbstractFactory pretFactory = FactoryCreator.getFactory("Pret");
        Pret pret = pretFactory.getPret(nomPret);
        pret.getTaux();
        pret.calculerPaimentPret(pretMontant);
    }
}
