
package ExercicioPessoa;

public class Pessoa {
    
    public String nome, email, endereco, sexo;
    public int telefone, idade; 

    void lerNome ( String a ) { this.nome = a; }
    void lerIdade( int b ) { this.idade = b; }
    void lerSexo ( String c) { this.sexo = c; }
    void lerTelefone ( int d ) { this.telefone = d; }
    void lerEndereco ( String e ) { this.endereco = e; } 
    void lerEmail ( String f ) { this.email = f; }
        
        void dadosPessoais(String nome, int idade, String sexo, int telefone, String endereco, String email) {
        System.out.println("\n Dados Pessoais Armazenados \n");
        System.out.println("\n Nome: " + nome);
        System.out.println("\n Idade: " + idade);
        System.out.println("\n Sexo: " + sexo);
        System.out.println("\n Telefone: " + telefone);
        System.out.println("\n Endereço: " + endereco);
        System.out.println("\n E-mail: " + email);
    }
 
    public void exibir ( ) {
        Pessoa a1;
        a1 = new Pessoa();
        a1.dadosPessoais(nome, idade, sexo, telefone, endereco, email);
    }
}
