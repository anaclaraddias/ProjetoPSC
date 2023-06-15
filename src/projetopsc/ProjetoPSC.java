/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopsc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anacl
 */
public class ProjetoPSC {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        
        ArrayList<String> enunciados = new ArrayList();
        ArrayList<Pergunta> perguntas = new ArrayList();
        ArrayList<Personagem> personagens = new ArrayList();
        
        System.out.println("Bem vindo ao QuizMaster! \n");
        
        Personagem personagem1 = new Personagem("Tonya");
        personagens.add(personagem1);
        Personagem personagem2 = new Personagem("Rochelle");
        personagens.add(personagem2);
        Personagem personagem3 = new Personagem("Julius");
        personagens.add(personagem3);
        Personagem personagem4 = new Personagem("Chris");
        personagens.add(personagem4);
        Personagem personagem5 = new Personagem("Drew");
        personagens.add(personagem5);
        
        
        System.out.println("Personagens:");
        
        for(Personagem personagem : personagens){
            System.out.println("- " + personagem.getNome());
        }
        
//        Jogador jogador1;
//        
//        while(true){
//            System.out.println("\n Jogador 1, escolha seu personagem ->");
//            String jogador1_personagem = scanner.nextLine();
//            
//            if(jogador1_personagem.equals("Tonya") || jogador1_personagem.equals("Rochelle") || jogador1_personagem.equals("Julius") || jogador1_personagem.equals("Chris") || jogador1_personagem.equals("Drew")){
//                System.out.println("\n Jogador 1, digite seu nome ->");
//                String usuario1 = scanner.nextLine();
//                jogador1 = new Jogador(jogador1_personagem, usuario1);
//                break;
//            } 
//            
//            System.out.println("escolha um personagem valido");
//        }
//        
//        Jogador jogador2;
//        
//        while(true){
//            System.out.println("\n Jogador 2, escolha seu personagem ->");
//            String jogador1_personagem = scanner.nextLine();
//            
//            if(jogador1_personagem.equals("Tonya") || jogador1_personagem.equals("Rochelle") || jogador1_personagem.equals("Julius") || jogador1_personagem.equals("Chris") || jogador1_personagem.equals("Drew")){
//                System.out.println("\n Jogador 1, digite seu nome ->");
//                String usuario1 = scanner.nextLine();
//                jogador2 = new Jogador(jogador1_personagem, usuario1);
//                break;
//            } 
//            
//            System.out.println("escolha um personagem valido");
//        }
//        
//        System.out.println("\n" + jogador1.getUsuario() + " voce comeca!");


        enunciados.add("Double");
        enunciados.add("Integer");
        enunciados.add("Random*");
        enunciados.add("Number");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual classe e usada para gerar numeros aleatórios?"
            )
        );
        enunciados.clear();


        enunciados.add("new*");
        enunciados.add("instance");
        enunciados.add("System*");
        enunciados.add("void");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "A instanciacao de objetos e feita usando qual palavra-chave?"
            )
        );
        enunciados.clear();


        enunciados.add("nextInt();");
        enunciados.add("nextInt(80);");
        enunciados.add("nextInt(0-79);");
        enunciados.add("nextInt(81);*");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Voce precisa gerar valores inteiros aleatórios entre 0 e 80 (incluindo 0 e 80). Que instrucao voce deve usar?"
            )
        );
        enunciados.clear();


        enunciados.add("charAt();");
        enunciados.add("size();");
        enunciados.add("compareTo()");
        enunciados.add("length()*");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual metodo retorna o comprimento de uma String?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("um valor inteiro");
        enunciados.add("nada e retornado");
        enunciados.add("verdadeiro ou falso*");
        enunciados.add("sim ou nao");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Quais valores sao retornados pelo metodo nextBoolean()?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("=");
        enunciados.add("<=");
        enunciados.add(">=");
        enunciados.add("==*");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual operador e usado para testar se dois lados de uma expressao boolean sao iguais?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("java.awt");
        enunciados.add("java.lang*");
        enunciados.add("java.io");
        enunciados.add("java.math");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual é o nome do pacote que contém a classe Math?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("getShirtSize()*");
        enunciados.add("cor");
        enunciados.add("tamanho");
        enunciados.add("preço");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Há vários campos e métodos em uma classe Shirt. Qual das seguintes opções poderia ser um método da classe Shirt?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("setOnMouseDragged()");
        enunciados.add("setOnMouseMoved()");
        enunciados.add("setOnMouseClicked()*");
        enunciados.add("setOnMouseReleased()");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual método é usado para eventos de clique do mouse?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("int longToInt = 20L(int);");
        enunciados.add("int longToInt = int 20L;");
        enunciados.add("int longToInt = (int)20L;*");
        enunciados.add("int longToInt = 20L;");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual é a maneira correta de converter um tipo long (longo) em um tipo int (inteiro)?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("instrução if/else");
        enunciados.add("instrução switch");
        enunciados.add("instrução if");
        enunciados.add("Looping*");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Você deseja calcular a soma de todas as marcas de determinado assunto. Qual método você escolherá?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("Objetos");
        enunciados.add("Variáveis de local*");
        enunciados.add("Strings");
        enunciados.add("Variáveis de instância");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "O que é armazenado na memória de pilha?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("int*");
        enunciados.add("booleano");
        enunciados.add("long");
        enunciados.add("Object");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual dos tipos de dados a seguir podem ser usados em uma instrução switch?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("Requisitos, Design, Desenvolvimento, Teste*");
        enunciados.add("Requisitos, Design, Teste, Desenvolvimento");
        enunciados.add("Design, Desenvolvimento, Requisitos, Teste");
        enunciados.add("Design, Requisitos, Desenvolvimento, Teste");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual é a ordem correta das etapas no Modelo Espiral de Desenvolvimento?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("4");
        enunciados.add("2");
        enunciados.add("8*");
        enunciados.add("7");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Quantos bits existem em um byte?"
            )
        );
        enunciados.clear();
        

//        try (FileWriter writer = new FileWriter("Perguntas.txt")) {
//            String texto = "teste";
//            writer.write(texto);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileReader reader = new FileReader("Perguntas.txt")) {
//              int teste;
//              while ((teste = reader.read()) != -1) {
//                  System.out.print((char) teste);
//              }
//          } catch (IOException e) {
//              e.printStackTrace();
//          }
//        
        
        System.out.println(perguntas.size());
        
//        System.out.println(aleatorio.nextInt(16));
    }
    
    public static Pergunta inserirPerguntas(
        ArrayList<String> enunciados, 
        String enunciado_pergunta
    )
    {
        ArrayList<Alternativa> alternativas = new ArrayList();
        
        for(String enunciado : enunciados){
            boolean status = false;
            
            if(enunciado.contains("*")){
                status = true;
                
                enunciado = enunciado.substring(0, enunciado.length() - 1);
            }
            
            Alternativa alternativa = new Alternativa(enunciado, status);
            alternativas.add(alternativa);
        }

        Pergunta pergunta = new Pergunta(
            enunciado_pergunta, 
            alternativas
        );
        alternativas.clear();
        
        return pergunta;
    }
}
