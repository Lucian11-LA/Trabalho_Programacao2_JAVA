package prog2project;

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
public class Prog2project {

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

    public static void mostrarGrelha(String[][] grelha, int tamanho_x, int tamanho_y) {
        for (int i = 0; i < tamanho_x; i++) {
            for (int j = 0; j < tamanho_y; j++) {
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
                                    {"#", "#", "#", "#", ".", ".", ".", ".", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", ".", "#", ".", ".", ".", ".", ".", "."},
                                    {"#", "#", ".", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                                    {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}

                                };

                                //preenchendo a matriz
                                preencherGrelha(grelha, tamanho_x, tamanho_y);
                                // mostrar a gelha
                                System.out.println("Os espaços representados por um número, ex 12 em que 1 representa a posição X da matriz e 2 Y");
                                System.out.println("São espaços que devem ser preenchidos com uma letra, ex: A,B,C....");
                                System.out.println("Última dica, as palavras em falta nesse nível são nomes de frutas!");
                                System.out.println("Vamos comçar!");
                                
                                do{
                                    System.out.print("\n");
                                    mostrarGrelha(grelha, tamanho_x, tamanho_y);
                                    System.out.print("\n");
                                    
                                    System.out.print("Letra a inerir:");
                                    String letra = input.next();
                                    
                                    System.out.print("Posição X: ");
                                    int posicao_x = input.nextInt();
                                    System.out.print("Posição Y: ");
                                    int posicao_y = input.nextInt();
                                    String pos = ""+posicao_x+""+posicao_y;
                                    
                                    //Inserir Letra
                                    
                                    
                                    String palavra="";
                                    int aux1=0,aux2=0;
                                    boolean flag = true;
                                    for(int i = 0; i<tamanho_x; i++){
                                        for(int j= 0; j<tamanho_y; j++){
                                            if(grelha[i][j].equals(pos))
                                            {
                                                //Verifica se a posicao está correcta
                                                int n = 0;
                                                
                                                
                                                while(flag){
                                                    String posicoes = posicoesArrayList.get(n);
                                                    if(posicoes.contains(pos))
                                                    {
                                                        palavra = palavrasArrayLsit.get(n);
                                                        aux1 = i;
                                                        aux2 = j;
                                                        flag = false;
                                                        
                                                    }
                                                    n++;
                                                }
                                                
                                            }
                                        }
                                        
                                        
                                    }
                                    if(!flag){
                                        char l = letra.charAt(0);
                                        int i=0;
                                        boolean f = true;
                                        do
                                        {
                                            if(palavra.charAt(i)==l){
                                               
                                                f = false;
                                            }
                                            i++;
                                        }while(f);
                                        
                                        if(f){
                                            System.out.println("A Letra  pertence a esta palvra!");
                                             grelha[aux1][aux2] = letra;
                                        }else{
                                             System.out.println("A Letra não pertence a essa palavra!");
                                        }
                                    }else{
                                        System.out.println("Posição incorrecta");
                                    }
                                    
                                    
                                    //verifica se a letra está coontida na palavra
                                    
                                    
                                    //
                                    System.out.println("Quer continuar ? Sim/Não");
                                    String resposta = input.nextLine();
                                    
                                    
                                    if(resposta.equals("não")){
                                        jogando = false;
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
