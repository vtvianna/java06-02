 class shoppingNiteroi extends shoppings  {
    //public shoppingNiteroi(String)
    public shoppingNiteroi(String nome, String cidade, String bairro, String rua, int numero){
        super(nome, cidade, bairro, rua, numero);
    }
    
    
    public static void main(String []args){
        shoppingNiteroi shopping = new shoppingNiteroi("plazza", "niteroi", "centro", "Av. Amaral peixoto", 297);
        shopping.imprimirDados();
        shopping.saudacao();
    }
    
    }
