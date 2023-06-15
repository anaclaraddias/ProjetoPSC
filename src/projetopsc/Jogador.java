/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopsc;

/**
 *
 * @author anacl
 */
public class Jogador extends Personagem {
    private String usuario;
    private int pontuacao = 0;
    private int vida = 100;
    
    public Jogador(String nome, String usuario)
    {
        super(nome);
        this.usuario = usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getVida() {
        return vida;
    }
}
