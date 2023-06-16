/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopsc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
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
        
        ArrayList<String> nomesPersonagens = new ArrayList();
        ArrayList<String> enunciados = new ArrayList();
        ArrayList<Pergunta> perguntas = new ArrayList();
        ArrayList<Personagem> personagens = new ArrayList();
        
        perguntas(enunciados, perguntas);
        
        System.out.println("Bem vindo ao QuizMaster! \n");
        
        while(true){
            System.out.println("Escolha uma das seguintes opcoes:\n");
            System.out.println("1 - iniciar o jogo");
            System.out.println("2 - informacoes dos desenvolvedores");
            System.out.println("3 - explicacao do jogo");
            System.out.println("4 - sair");
            int res = scanner.nextInt();
            
            if(res == 1){
                nomesPersonagens.add("Tonya");
                nomesPersonagens.add("Rochelle");
                nomesPersonagens.add("Julius");
                nomesPersonagens.add("Chris");
                nomesPersonagens.add("Drew");

                inserirPersonagens(nomesPersonagens, personagens);
                
                System.out.println("Personagens:");

                for(Personagem personagem : personagens){
                    System.out.println("- " + personagem.getNome());
                }
                
                ArrayList<Jogador> result = inserirJogadores(scanner);
                
                Jogador jogador1 = result.get(0);
                Jogador jogador2 = result.get(1);
                
                jogo(perguntas, aleatorio, jogador1, jogador2, scanner);
            } else if(res == 2){
                System.out.println("Desenvolvedores:\n");
                System.out.println("Ana Clara Domingos Dias Silva | 12316965");
                System.out.println("Ana Caroline Valerio Moreira | 12318791");
                System.out.println("Gabriela Marques dos Santos Nascimento | 12220159");
                System.out.println("Joao Eduardo de Souza Lima Baquim | 12319730");
            } else if(res == 3){
                System.out.println("Jogo de perguntas e respostas sobre programacao / modelagem de software, o jogo apresenta 15 perguntas e funciona em turnos dividos por 2 jogadores");
            } else if(res == 4){
                break;
            } else{
                System.out.println("digite uma opcao valida");
            }
        } 
    }
    
    public static void inserirTxt(ArrayList<Pergunta> perguntas)
    {   
        try{
            FileWriter limpar = new FileWriter("Perguntas.txt");
            limpar.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(Pergunta pergunta: perguntas){
            try{
                FileWriter writer = new FileWriter("Perguntas.txt", true);
                writer.write(pergunta.getEnunciado());
                
                for(Alternativa alternativa : pergunta.getAlternativas()){
                    if(alternativa.getStatus()){
                        String enunciado = alternativa.getEnunciado() + "*";
                        writer.write("//" + enunciado);
                    } else {
                        writer.write("//" + alternativa.getEnunciado());
                    }
                }
                
                writer.write("\n");
                
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
    
    public static void inserirPersonagens(
        ArrayList<String> nomes, 
        ArrayList<Personagem> personagens
    )
    {
        for(String nome : nomes){
            Personagem personagem = new Personagem(nome);
            personagens.add(personagem);
        }
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

        return pergunta;
    }
    
    public static void perguntas(
        ArrayList<String> enunciados, 
        ArrayList<Pergunta> perguntas
    )
    {
        enunciados.add("Double");
        enunciados.add("Integer");
        enunciados.add("Random*");
        enunciados.add("Number");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Qual classe e usada para gerar numeros aleatorios?"
            )
        );
        enunciados.clear();


        enunciados.add("new*");
        enunciados.add("instance");
        enunciados.add("System");
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
                "Voce precisa gerar valores inteiros aleatorios entre 0 e 80 (incluindo 0 e 80). Que instrucao voce deve usar?"
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
                "Qual e o nome do pacote que contem a classe Math?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("getShirtSize()*");
        enunciados.add("cor");
        enunciados.add("tamanho");
        enunciados.add("preco");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Ha varios campos e metodos em uma classe Shirt. Qual das seguintes opcoes poderia ser um metodo da classe Shirt?"
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
                "Qual metodo e usado para eventos de clique do mouse?"
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
                "Qual e a maneira correta de converter um tipo long (longo) em um tipo int (inteiro)?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("instrucao if/else");
        enunciados.add("instrucao switch");
        enunciados.add("instrucao if");
        enunciados.add("Looping*");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "Voce deseja calcular a soma de todas as marcas de determinado assunto. Qual metodo voce escolhera?"
            )
        );
        enunciados.clear();
        
        
        enunciados.add("Objetos");
        enunciados.add("Variaveis de local*");
        enunciados.add("Strings");
        enunciados.add("Variaveis de instancia");

        perguntas.add(
            inserirPerguntas(
                enunciados, 
                "O que e armazenado na memoria de pilha?"
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
                "Qual dos tipos de dados a seguir podem ser usados em uma instrucao switch?"
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
                "Qual e a ordem correta das etapas no Modelo Espiral de Desenvolvimento?"
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
        
        inserirTxt(perguntas);
    }
    
    public static ArrayList<Jogador> inserirJogadores(Scanner scanner)
    {
        Jogador jogador1;
       
        while(true){
            System.out.println("\n jogador 1, escolha seu personagem ->");
            String jogador_personagem = scanner.next();

            if(jogador_personagem.equals("Tonya") || jogador_personagem.equals("Rochelle") || jogador_personagem.equals("Julius") || jogador_personagem.equals("Chris") || jogador_personagem.equals("Drew")){
                System.out.println("\n jogador 1, digite seu nome ->");
                String usuario = scanner.next();
                jogador1 = new Jogador(jogador_personagem, usuario);
                break;
            } 

            System.out.println("\n escolha um personagem valido");
        }
        
        Jogador jogador2;

        while(true){
            System.out.println("\n jogador 2, escolha seu personagem ->");
            String jogador_personagem = scanner.next();

            if(!jogador_personagem.equals(jogador1.getNome())){
                if(jogador_personagem.equals("Tonya") || jogador_personagem.equals("Rochelle") || jogador_personagem.equals("Julius") || jogador_personagem.equals("Chris") || jogador_personagem.equals("Drew")){
                    System.out.println("\n jogador 2, digite seu nome ->");
                    String usuario1 = scanner.next();
                    jogador2 = new Jogador(jogador_personagem, usuario1);
                    break;
                } 
            }

            System.out.println("\n escolha um personagem valido");
        }
        
        ArrayList<Jogador> result = new ArrayList<Jogador>();
        result.add(jogador1);
        result.add(jogador2);

        return result;
    }
    
    public static void jogo(
        ArrayList<Pergunta> perguntas, 
        Random aleatorio, 
        Jogador jogador1, 
        Jogador jogador2, 
        Scanner scanner
    )
    {
        while(true){
           if(perguntas.isEmpty() || jogador1.getVida() <= 0 || jogador2.getVida() <= 0){
               System.out.println("\nGAME OVER");
               
               if(jogador1.getVida() <= 0){
                   System.out.println(jogador2.getNome() + " venceu o jogo! - Parabens " + jogador2.getUsuario() + "!");
               } else if(jogador2.getVida() <= 0){
                   System.out.println(jogador1.getNome() + " venceu o jogo! - Parabens " + jogador1.getUsuario() + "!");
               } else {
                   if(jogador1.getVida() > jogador2.getVida()){
                       System.out.println(jogador1.getNome() + " venceu o jogo! - Parabens " + jogador1.getUsuario() + "!");
                   } else {
                       System.out.println(jogador2.getNome() + " venceu o jogo! - Parabens " + jogador2.getUsuario() + "!");
                   }
               }
               
               break;
           }
           
           int index = aleatorio.nextInt(perguntas.size());
           
           Pergunta pergunta = perguntas.get(index);
           perguntas.remove(index);
           
           System.out.println("\n" + pergunta.getEnunciado() + "\n");
           
           for(Alternativa alternativa : pergunta.getAlternativas()){
               System.out.println("- " + alternativa.getEnunciado());
           }
           
           if(perguntas.size() == 14){
               System.out.println("\n" + jogador1.getNome() + " voce comeca! (selecione de 1 a 4)");
           } else {
               System.out.println("\n" + jogador1.getNome() + " qual sua reposta? (selecione de 1 a 4)");
           }
           int resposta1 = scanner.nextInt();
           
           while(true){
                if(resposta1 >= 1 && resposta1 <= 4){
                    break;
                }
                
               System.out.println("digite uma opcao valida ->");
               resposta1 = scanner.nextInt();
           }
           
           
           System.out.println("\n" + jogador2.getNome() + " sua vez, qual a sua reposta? (selecione de 1 a 4)");
           int resposta2 = scanner.nextInt();
           
           while(true){
                if(resposta2 >= 1 && resposta2 <= 4){
                    break;
                }
                
               System.out.println("digite uma opcao valida ->");
               resposta2 = scanner.nextInt();
           }
           boolean responderNovamente = false;
           
           System.out.println("\nvoces tem certeza da reposta? (s/n) - so e possivel alterar a reposta uma vez");
           String res = scanner.next();
           
           while(true){
               if(res.equals("s")){
                   break;
               } else if(res.equals("n")){
                   responderNovamente = true;
                   break;
               }
               
               System.out.println("digite uma opcao valida ->");
               res = scanner.next();
           }
           
           if(responderNovamente){
                System.out.println("\n" + pergunta.getEnunciado() + "\n");
           
                for(Alternativa alternativa : pergunta.getAlternativas()){
                    System.out.println("- " + alternativa.getEnunciado());
                }
                
                System.out.println(jogador1.getNome() + " qual sua nova reposta? (selecione de 1 a 4)");
                resposta1 = scanner.nextInt();
                
                while(true){
                    if(resposta1 >= 1 && resposta1 <= 4){
                        break;
                    }

                   System.out.println("digite uma opcao valida ->");
                   resposta1 = scanner.nextInt();
                }
                
                System.out.println(jogador2.getNome() + " qual sua nova reposta? (selecione de 1 a 4)");
                resposta2 = scanner.nextInt();
                
                while(true){
                    if(resposta2 >= 1 && resposta2 <= 4){
                        break;
                    }

                   System.out.println("digite uma opcao valida ->");
                   resposta2 = scanner.nextInt();
               }
           }
           
           boolean jogador1Acertou = true;
           boolean jogador2Acertou = true;
           
           if(!pergunta.getAlternativas().get(resposta1 - 1).getStatus()){
               jogador1.setVida(jogador1.getVida() - 10);
               jogador1Acertou = false;
           }
           
           if(!pergunta.getAlternativas().get(resposta2 - 1).getStatus()){
               jogador2.setVida(jogador2.getVida() - 10);
               jogador2Acertou = false;
           }
           
           System.out.println("-=-=-=-=-");
           
           if(jogador1Acertou){
            System.out.println(jogador1.getNome() + " acertou!");
           } else {
            System.out.println(jogador1.getNome() + " errou!");
           }
           
           if(jogador2Acertou){
            System.out.println(jogador2.getNome() + " acertou!");
           } else {
            System.out.println(jogador2.getNome() + " errou!");
           }
           
           System.out.println("-=-=-=-=-");
           
           if(jogador1Acertou == false || jogador2Acertou == false){
               String alternativaCerta = "";
               
               for(Alternativa alternativa : pergunta.getAlternativas()){
                    if(alternativa.getStatus()){
                        alternativaCerta = alternativa.getEnunciado();
                    }
                }
               
               System.out.println("a alternativa certa era: " + alternativaCerta);
               
               System.out.println("-=-=-=-=-");
           }
           
           System.out.println("vida de " + jogador1.getNome() + ": " + jogador1.getVida());
           System.out.println("vida de " + jogador2.getNome() + ": " + jogador2.getVida());
           
           System.out.println("-=-=-=-=-");
        }
    }
}
