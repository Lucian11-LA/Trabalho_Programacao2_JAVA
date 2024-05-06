import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void mostrarUsuarioDataPontos(String User,int pontos){
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        
        String f = now.format(format);
        
        System.out.println("Jogador(a): "+User+" Data: "+f);
    }
    public static void mostrarMenu(){
        
        System.out.println("CROSSWORD --- PALAVRAS-CRUZADAS");
        System.out.println("0-Jogar");
        System.out.println("1-Escolher Nivel");
        System.out.println("2-Criar Usuario");
        System.out.println("3-Jogos guardados");
        System.out.println("4-Hall of Fame(Maiores Pontuações)");
        System.out.println("5-Sair");
        System.out.print("---->");
    }
    
    
    public static void mostrarGrelhaDeLetras(int tamanho_x,int tamanho_y, ArrayList<String> words){
        
    }
    
    
    public static void limpaTela(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tamanho_x = 10, tamanho_y = 10;
		
		
		ArrayList <String> palavras = new ArrayList<String>();
		
		palavras.add("BANANA");
                palavras.add("BOLA");
		palavras.add("ANANÁS");
		palavras.add("ABACATE");
		palavras.add("LOENGO");
		palavras.add("KIWI");

		
                
                String[][] grelha = new String[tamanho_x][tamanho_y];
                            
                            
                                
                //CRIAR Grelha de letra
                for(int i=0; i<tamanho_x; i++){
                    for(int j=0; j<tamanho_x; j++){
                        grelha[i][j] = i+""+j;
                    }
                                    
                }
                                
                ///
                
                //Inserir Palavras
                
                boolean naColuna = true;
                boolean naLinha  = false;
                int cont = 0;
                int tamanho_palavra = 0;
                
                String palavra;
                int contaLinhas= 0;
                int contaColunas = 0;
                
                for(int i=0; i<tamanho_x; i++){
                    contaLinhas = 0;
                    contaColunas = 0;
                
                    for(int j=0; j<tamanho_x; j++){
                        
                        if(naColuna &&(cont<palavras.size()) && (i==0) && (j==0)){
                            
                            palavra = palavras.get(cont);
                            tamanho_palavra = palavra.length();
                            
                            while(contaLinhas<tamanho_palavra){
                                grelha[contaLinhas][j] = ""+palavra.charAt(contaLinhas);
                                contaLinhas++;
                            }
                            
                            
                            int k = tamanho_palavra;
                            while(k<tamanho_x){
                                grelha[k][j] = "*";
                                k++;
                            }
                            
                            
                            cont++;
                        }else if(naLinha && (cont<palavras.size())){
                           palavra = palavras.get(cont);
                           tamanho_palavra = palavra.length();
                            
                           if(!(grelha[i][j].equals("*"))){
                               
                               if(!grelha[i][j].equals(" ")){
                                   while(contaColunas<tamanho_palavra){
                                       grelha[i][contaColunas] = ""+palavra.charAt(contaColunas);
                                       contaColunas++;
                                   }
                               }
                           } 
                           
                           int k = tamanho_palavra;
                           while(k<tamanho_x){
                               grelha[i][k] = "*";
                               k++;
                           }
                            
                           cont++;  
                        }
                            
                        
                        naColuna = !(naColuna);
                        naLinha = !(naLinha);
                    }
                                    
                }
                
                
		int op;
		
		do{
		    limpaTela();
		    mostrarMenu();
		    op = input.nextInt();
		    
		    switch(op){
		        
		        case 0:
		            limpaTela();
		            
		            System.out.println("Jogar!");
		            
		            
		            boolean Isplaying = true;
		            int px;
		            int py;
		            int play;
		            char value;
		            
                                
                                
                            ////
                            
                            
		            while(Isplaying){
                 
		                mostrarUsuarioDataPontos("Luciano",10000);    
		                
		                //Mostrar grelha
                                
                                System.out.print("\n");
                                System.out.print("\n");
                                
                                for(int i=0; i<tamanho_x; i++){
                                    for(int j=0; j<tamanho_x; j++){
                                       
                                        System.out.print("| "+grelha[i][j]+" ");
                                    }
                                    System.out.print("\n");
                                }
                                System.out.print("\n");
                                System.out.print("\n");
                                //
		                
		                
		                
		                System.out.print("Posiçao X: ");
		                px = input.nextInt();
		                
		                System.out.print("Posiçao Y: ");
		                py = input.nextInt();
		               
		                System.out.print("Letra: ");
		                value = input.next().charAt(0);
		                
                                
                                
                                //Atualizar da grelha de letra 
                                
                                for(int i=0; i<tamanho_x; i++){
                                    for(int j=0; j<tamanho_x; j++){
                            
                                        grelha[px][py] = ""+value;
                                    }
                                  
                                }
                                
                                /////
		                
                                
                                //Mostrar grelha
                                
                                System.out.print("\n");
                                System.out.print("\n");
                                mostrarUsuarioDataPontos("Luciano",10000);
                                
                                for(int i=0; i<tamanho_x; i++){
                                    for(int j=0; j<tamanho_x; j++){
                                       
                                        System.out.print("| "+grelha[i][j]+" ");
                                    }
                                    System.out.print("\n");
                                }
                                System.out.print("\n");
                                System.out.print("\n");
                                //
		                
		                
                                
		                System.out.print("Sair ou continuar Jogar (1/0): ");
		                play = input.nextInt();
		                
		                if(play!=0){
		                   limpaTela();
		                   Isplaying = true;
		                }
		                else
		                    Isplaying = false;
		                    
		                
		            }
		            
		            
		            
		            
		            break;
		        case 1:
		            limpaTela();
		            System.out.println("Escolher Nivel");
		            
		            break;
		            
		        case 2:
		            limpaTela();
		            System.out.println("Criar Usuario");
		            
		            break;
		       case 3:
		            limpaTela();
		            System.out.println("Jogos Guardados!");
		       case 4:
		            limpaTela();
		            System.out.println("Hall of Fame");
		            System.out.println("Name------------------Points");
		            System.out.println("1-Luciano Alfredo ---- 9870");
		            System.out.println("2-Genilson Daniel ---- 4560");
		            System.out.println("3-Torcato Coimbra ---- 4560");
		            System.out.println("----------------------------");
		            break;
		      case 5:
		          limpaTela();
		          break;
		    }
		    
		}while(op!=5);
		
	}
}
