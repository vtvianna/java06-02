
    public class shoppingsrj{

        private String nome;
        private String cidade;
        private String bairro;
        private String rua;
        private int numero;
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getCidade() {
            return cidade;
        }
    
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    
        public String getBairro() {
            return bairro;
        }
    
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }
    
        public String getRua() {
            return rua;
        }
    
        public void setRua(String rua) {
            this.rua = rua;
        }
    
        public int getNumero() {
            return numero;
        }
    
        public void setNumero(int numero) {
            this.numero = numero;
        }
    
        public void imprimirDados(){
            System.out.println("Rua: " + rua + "\nNúmero: " + numero + "\nBairro: " + bairro + "\nCidade: " + cidade);
          }
    }