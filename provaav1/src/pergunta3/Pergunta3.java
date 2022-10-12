package pergunta3;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Pergunta3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Deque<Post> redeSocial = new LinkedList<Post>();

        int menu=0;
        String publicacao;
        byte relevante;
        do {
            System.out.println("1 -Cadastrar Post \n2 - Visualizar Posts Relevantes \n3 - Sair");
            menu = scan.nextInt();
            scan = new Scanner(System.in);
            switch (menu){
                case 1:
                    System.out.println("Cadastrar post: ");
                    publicacao = scan.nextLine();
                    System.out.println("Defina a relevância do post? '1 - relevante 1 // 2 - relevante 2'");
                    relevante = scan.nextByte();

                    if (relevante==1){
                        Post Post = new Post(publicacao, relevante);
                        redeSocial.addFirst(Post);
                    } else if (relevante == 2) {
                        Post Post = new Post(publicacao, relevante);
                        redeSocial.addLast(Post);
                    }else{
                        System.out.println("Defina a relevância do seu post novamente");
                    }
                    break;
                case 2:
                    for (Post post: redeSocial){
                        if (post.getRelevancia()==1){
                            System.out.println(post.getMsg() +"\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Logoff");
                    break;
                default:
                    System.out.println("Valor incorreto.");
            }
        }while(menu!=3);
    }
}
