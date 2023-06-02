/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopsc;

import java.util.ArrayList;

/**
 *
 * @author anacl
 */
public class Pergunta {
    private String enunciado;
    private ArrayList<Alternativa> alternativas;
    
    public Pergunta(String enunciado, ArrayList<Alternativa> alternativas)
    {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setAlternativas(ArrayList<Alternativa> alternativas) {
        this.alternativas = alternativas;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public ArrayList<Alternativa> getAlternativas() {
        return alternativas;
    }
}
