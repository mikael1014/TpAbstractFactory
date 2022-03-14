/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mn.tpabstractfactorypattern;

/**
 *
 * @author Mike
 */
public class Banque2 implements Banque {

    private final String nomBanque;

    public Banque2() {
        this.nomBanque = "Banque2";
    }

    @Override
    public String GetNomBanque() {
        return nomBanque;
    }
}
