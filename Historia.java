import java.util.Scanner;

public class Historia {

        
        public static void main(String[] args) throws Exception{
            
            String titulo = "A SALA";

            String abertura = "Acorda numa sala sem nenhuma lembrança de como chegou aqui";
            //sala + escolhas
            String sala = "Está numa sala branca quase vazia, \n tem apenas uma cama forrada, \n uma escrivaninha, \n uma estante de livros \n e uma porta tão branca quanto as paredes da sala. "; 
            String escolha1 ="cama";
            String escolha2 = "escrivaninha";
            String escolha3 = "estante";
            String escolha4 = "porta";
            String resultado1 ="Caminha até a escrivaninha, feita de um metal escuro, não tem nada em cima mas olhando embaixo tem um cofre velho e pesado, \n vai tentar uma combinação?  ";
            //String combinacao = "Direita";
            String resultado2 = "Chega a estante de livros, sente que é de madeira ao tocar mas está toda preta e os livros tem suas totalmente brancas, \n os livros falam de assuntos que não entende, mas encontra uma foto presa entre as paginas, é de um senhor velho e na parte de trás diz 'Sempre a direita' ";
            String resultado3 = "Se dirige até a cama, \n o lencol e o travesseiro tem um tom marfim, aparenta confortavel... Se deita";
            //Escolha para um dos finais 
            String escolha3final = "Vai se deitar novamente..?";
            String final1 ="Adormece e aceita sua nova realidade, \n escolhendo viver aqui para sempre.";
            String final2 ="A ansiedade toma conta, não consegue avançar e abrir a porta, \n talvez seja melhor não saber a verdade.";
            String final3 = "A porta se abre revelando o outro lado, a verdade se encontra fora desta sala pequena, \n apesar de receoso dá o 1° passo em direção ao mundo.";
            
            System.out.println(titulo);
            System.out.println("Abre os olhos e " + abertura);
            System.out.println(sala);
            System.out.println("");
            System.out.println(escolha1);
            System.out.println(escolha2);
            System.out.println(escolha3);

            Scanner opcao = new Scanner(System.in);
            String escolha = opcao.nextLine();
             
            if(escolha.equals(escolha1)) {
                //cofre
                System.out.println(resultado3);
                System.out.println(final1);
                //System.out.println
               // if (escolha.equals(combinacao)) {
               //     System.out.println("Consegue a chave");
               // }
            }
            
            else if(escolha.equals(escolha2)) {
               // livros
               System.out.print(resultado2);
            }

            else if(escolha.equals(escolha3)) {
                //fazer o final da cama 
                System.out.print(resultado1);
                //String escolha3final =.nextLine();
                System.out.println(escolha3final);
                System.out.println(final1);
            }

            else if(escolha.equals(escolha4)) {
                System.out.println("Diante da porta .... \n vai abrir?");

                System.out.println(final2);
                System.out.println(final3);
            }

            else {
                //printar sala 
                System.out.println(sala);
                //repetir escolha 
            }
            opcao.close();
            
        }

    }