/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog2projecto;

/**
 *
 * @author lenevo
 */


import java.util.*;

class Celula
{
    String valor;
    String posicao;
    
}

class Palavras
{
    int tamanho;
    String valor;
}
public class Prog2projecto{

    public static void mostrarMenu() {
        System.out.println("CROSSWORD --- PALAVRAS-CRUZADAS");
        System.out.println("1-Jogar");
        System.out.println("2-Escolher Nivel");
        System.out.println("3-Criar Usuario");
        System.out.println("4-Jogos guardados");
        System.out.println("5-Hall of Fame(Maiores Pontuações)");
        System.out.println("0-Sair");
        System.out.print("---->");

    }

    public static void mostrarGrelhaTeste(String[][] grelha, int tamanho_x, int tamanho_y) {
        for (int i = 0; i < tamanho_x; i++) {
            for (int j = 0; j < tamanho_y; j++) {
                System.out.print(" " + grelha[i][j] + " ");

            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }
    
    public static void mostrarGrelha(String[][] grelha, int tamanho_x, int tamanho_y) {
        for (int i = 0; i < tamanho_x; i++) {
            for (int j = 0; j < tamanho_y; j++) {
                if(grelha[i][j].equals("#"))
                    System.out.print(" ");
                else
                    System.out.print(" " + grelha[i][j] + " ");

            }
            System.out.print("\n");
        }

        System.out.print("\n");
    }


    public static void preencherGrelha(String[][] grelha, int tamanho_x, int tamanho_y) {
        for (int i = 0; i < tamanho_x; i++) {
            for (int j = 0; j < tamanho_x; j++) {
                if (!grelha[i][j].equals("#")) {
                    grelha[i][j] = i + "" + j;

                }

            }

        }
    }

    public static void main(String[] args) {

        ArrayList<Celula> celulasArrayList = new ArrayList<Celula>();
        ArrayList<String> palavrasArrayLsit = new ArrayList<String>();
        ArrayList<String> posicoesArrayList = new ArrayList<String>();
        int op = 1;
        Scanner input = new Scanner(System.in);

        do {
            mostrarMenu();
            op = input.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Jogando....");
                    
                    int op2 = 1;
                    
                    palavrasArrayLsit.add("KIWI");
                    posicoesArrayList.add("14 15 16 17");
                    palavrasArrayLsit.add("BANANA");
                    posicoesArrayList.add("54 55 56 58 59");
                    
                    
                    
                    
                    do {
                        System.out.println("Escolher nível:");
                        System.out.println("1-Primeiro Nivel");
                        System.out.println("2-Primeiro Nivel");
                        System.out.println("3-Terceiro Nivel");
                        System.out.println("0-Voltar ao menu inicial");

                        op2 = input.nextInt();

                        switch (op2) {
                            
                           
                                
                            case 1:
                                boolean jogando = true;
                                int tamanho_x = 10;
                                int  tamanho_y = 10;
                                int  total_pontos = 0;

                                String[][] grelha = {
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", ".", ".", ".", ".", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", ".", ".", ".", ".", ".", "."},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}

                                };
                                
                                int tentativas = 10;
                                
                                ArrayList<Celula> celulas = new ArrayList<Celula>();
                                
                                Celula c1 = new Celula();
                                
                                c1.valor = "B";
                                c1.posicao ="12";
                                
                                Celula c2 = new Celula();
                                
                                c2.valor = "A";
                                c2.posicao ="13";
                                
                                Celula c3 = new Celula();
                                
                                c3.valor = "N";
                                c3.posicao ="14";
                                
                                Celula c4 = new Celula();
                                
                                c4.valor = "A";
                                c4.posicao ="15";
                                
                                Celula c5 = new Celula();
                                
                                c5.valor = "N";
                                c5.posicao ="16";
                                
                                Celula c6 = new Celula();
                          
                                c6.valor = "A";
                                c6.posicao ="17";
                                
                                
                                
                                celulas.add(c1);
                                celulas.add(c2);
                                celulas.add(c3);
                                celulas.add(c4);
                                celulas.add(c5);
                                celulas.add(c6);
                                

                                //preenchendo a matriz
                                preencherGrelha(grelha, tamanho_x, tamanho_y);
                                // mostrar a gelha
                                System.out.println("Os espaços representados por um número, ex 12 em que 1 representa a posição X da matriz e 2 Y");
                                System.out.println("São espaços que devem ser preenchidos com uma letra, ex: A,B,C....");
                                System.out.println("Última dica, as palavras em falta nesse nível são nomes de frutas!");
                                System.out.println("Vamos comçar!");
                                
                                mostrarGrelhaTeste(grelha, tamanho_x, tamanho_y);
                                do{
                                    System.out.print("\n");
                                    System.out.println("Jogador:Desconhecido---Pontos: "+total_pontos);
                                    mostrarGrelha(grelha, tamanho_x, tamanho_y);
                                    
                                    System.out.print("\n");
                                    System.out.print("\n");
                                    System.out.print("Letra a inSerir:");
                                    String letra = input.next();
                                    letra = letra.toUpperCase();
                                    
                                    System.out.print("Posição X: ");
                                    int posicao_x = input.nextInt();
                                    System.out.print("Posição Y: ");
                                    int posicao_y = input.nextInt();
                                    String pos = ""+posicao_x+""+posicao_y;
                                    
                                    //Inserir Letra
                                    boolean encontrou = false;
                                    for(int i=0;i<tamanho_x;i++){
                                        for(int j=0;j<tamanho_y;j++){
                                            
                                            String end = ""+i+""+j;
                                            
                                            if(end.equals(pos)){
                                                int n = 0; 
                                                while(n<celulas.size())
                                                {
                                                    if(celulas.get(n).posicao.equals(pos))
                                                    {
                                                        //System.out.println("Celula encontrada");
                                                        if(celulas.get(n).valor.equals(letra))
                                                        {
                                                            grelha[posicao_x][posicao_y] = letra;
                                                            total_pontos +=10;
                                                            encontrou = true;
                                                        }
                                                    }
                                                    n++;
                                                }
                                            }
                                            
                                        }
                                    }
                                    
                                    if(encontrou)
                                         System.out.println("\nLetra correcta!\n");
                                    else{
                                        tentativas--;
                                        System.out.println("\nTente uma outra letra ou posicao correcta!\n");
                                    }
                                    //verifica se a letra está coontida na palavra
                                    
                                    
                                    //
                                    
                                    
                                    if(tentativas>0){
                                        jogando = true;
                                    }else{
                                        jogando = false;
                                        System.out.println("Voce perdeu, tente jogar novamente!");
                                    }
                                    
                                    
                                }while(jogando);
                                 
                                break;

                            default:
                                throw new AssertionError();
                        }
                    } while (op2 != 0);
                    break;
                case 3:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op != 0);
    }

}
