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

    public String getNome() {
        return nome;
    }

    public boolean getStatus() {
        return status;
    }

}
