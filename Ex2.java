/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;


/**
 *
 * @author labinfo
 */
public class Ex2 {
    public static void main(String[] args) {
        
        int ano  = 1996;
        double salario = 1015;
        double aumentoPercentual = 0.03;

        while (ano < 2022) {
            salario *= 1 + aumentoPercentual;
            aumentoPercentual *= 2;
            ano += 1;
        }
        
        System.out.println("Salário: " + salario);
    }
}
