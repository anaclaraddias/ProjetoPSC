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
    private int pontuacao;
    
    public Jogador(String nome, boolean status, int vida, String usuario, int pontuacao)
    {
        super(nome);
        this.usuario = usuario;
        this.pontuacao = pontuacao;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
