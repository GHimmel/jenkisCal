/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caluladorajenkins;

import serviciosCalculadora.calculadoraServ;

/**
 *
 * @author Mafe
 */
public class CaluladoraJenkins {

    public static void main(String[] args) {
        
        calculadoraServ CS = new calculadoraServ();
        
        System.out.println(CS.suma(5, 2));
        System.out.println(CS.resta(5, 2));
        System.out.println(CS.div(5, 2));
        System.out.println(CS.multi(5, 2));
        
    }
}
