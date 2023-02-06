import java.util.Scanner;

public class shoppings {
    private String nome, cidade, bairro, rua;
    private int numero;
    

    public shoppings(String nome, String cidade, String bairro, String rua, int numero){
        this.nome = nome;
        this.cidade = cidade;
        this. bairro = bairro;
        this. rua = rua;
        this.numero = numero;
}

public void imprimirDados(){ // método imprimirDados() 
    System.out.println("Nome:  " + nome + "Cidade:  " + cidade + "Bairro:  " + bairro + "Rua: " + rua + "Numero" + numero);


}

public void saudacao(){
    System.out.print("bem vindo ao shopping " + nome);
}

public static void main(String []args){
    shoppings shopping = new shoppings("Norte Shopping", "Rio de janeiro", "centro", "Av. Amaral Armani", 297);
    shopping.imprimirDados();
    shopping.saudacao();
}

}
