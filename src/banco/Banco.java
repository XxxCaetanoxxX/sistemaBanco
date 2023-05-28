package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    //conta caetano
    contaBanco p1 = new contaBanco();
    p1.setNumConta(1111);
    p1.setDono("Caetano");
    p1.abrirConta("CC");
    p1.depositar(500);
    p1.sacar(100);
    p1.estadoAtual();
    
    
    //conta Augusto
    contaBanco p2 = new contaBanco();
    p2.setNumConta(2222);
    p2.setDono("Augusto");
    p2.abrirConta("CP");
    p2.depositar(350);
    p2.estadoAtual();
    }
    
}
