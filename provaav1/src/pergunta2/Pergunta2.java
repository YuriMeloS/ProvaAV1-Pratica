package pergunta2;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Pergunta2 {
    Stack p1 = new Stack();
    Stack p2 = new Stack();
    Stack p3 = new Stack();

    Scanner scan1;
    Scanner scan2;
    Scanner scan3;

    scan1 = new Scanner(new File("C:\\IntelliJ/provaav1/src/pilha/pilha1.txt")) ;
    scan2= new Scanner(new File("C:\\IntelliJ/provaav1/src/pilha/pilha2.txt")) ;
    scan3 = new Scanner(new File("C:\\IntelliJ/provaav1/src/pilha/pilha3.txt")) ;

		while(scan1.hasNextLine() && scan2.hasNextLine() && scan3.hasNextLine()) {
        pilha1.push(scan1.nextLine());
        pilha2.push(scan2.nextLine());
        pilha3.push(scan3.nextLine());
    }

		while(!pilha1.empty() && !pilha2.empty() && !pilha3.empty()) {
        System.out.println("Assistente 1 - prato: "+pilha1.pop());
        System.out.println("Assistente 2 - prato: "+pilha2.pop());
        System.out.println("Assistente 3 - prato: "+pilha3.pop());
    }
}

