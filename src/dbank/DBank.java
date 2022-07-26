package dbank;

import java.util.Scanner;

public class DBank {
    public static void main(String[] args) {
        Conta p1 = new Conta(0001, "Jubileu", "CC");
        p1.abrirConta();
        p1.estadoConta();
        p1.sacar(50);
        p1.fecharConta();
        
        Conta p2 = new Conta(0002, "Creuza", "CP");
        p2.abrirConta();
        p2.estadoConta();
        p2.fecharConta();
    }    
}
