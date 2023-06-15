/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopsc;

/**
 *
 * @author anacl
 */
public class Alternativa {
    private String enunciado;
    private boolean status;
    
    public Alternativa(String enunciado, boolean status)
    {
        this.enunciado = enunciado;
        this.status = status;
    }

    public void setEnunciado(String enunciado) 
    {
        this.enunciado = enunciado;
    }

    public void setStatus(boolean status) 
    {
        this.status = status;
    }
    
    public String getEnunciado() 
    {
        return enunciado;
    }

    public boolean getStatus() 
    {
        return status;
    }
}
