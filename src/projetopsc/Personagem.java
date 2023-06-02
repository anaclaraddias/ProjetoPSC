/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopsc;

/**
 *
 * @author anacl
 */
public class Personagem {
    private String nome;
    private boolean status = false;
    private int vida = 100;
    
    public Personagem(String nome)
    {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public boolean getStatus() {
        return status;
    }

    public int getVida() {
        return vida;
    }
}
