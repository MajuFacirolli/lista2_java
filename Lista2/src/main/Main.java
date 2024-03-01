package main;
import produto.Produto;
public class Main {
    public static void main(String[] args) {
        Produto obj = new Produto();

        obj.setCodigo(10);
        obj.setQuantidade(8);

        System.out.println("código: " + obj.getCodigo());
        System.out.println("quantidade: " + obj.getQuantidade());
    }
}
