/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopsc;

import java.util.Scanner;

/**
 *
 * @author anacl
 */
public class ProjetoPSC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao QuizMaster");
        
        Personagem personagem1 = new Personagem("Tonya");
        Personagem personagem2 = new Personagem("Rochelle");
        Personagem personagem3 = new Personagem("Julius");
        Personagem personagem4 = new Personagem("Chris");
        Personagem personagem5 = new Personagem("Drew");
        
        System.out.println("Jogador 1, escolha seu personagem ->");
        String personagem_teste = scanner.nextLine();
        
        System.out.println(personagem_teste);
    }
}
