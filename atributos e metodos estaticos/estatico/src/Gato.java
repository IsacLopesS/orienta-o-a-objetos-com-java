public class Gato {

    /*
     * Atributos estáticos são atributos que não pertencem à nenhum objeto, mas a classe.
     * São como uma variavel global para aquela classe
     */
    public static int quantidade_de_gatos=0; 
    public String nome;
    public int idade;

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        quantidade_de_gatos=quantidade_de_gatos+1;
    }

    /*métods estáticos assim como atributos estaticos não pertencem a nehum objeto. Ou seja,
     *os objetos não acessam este método - é um método que pertence a classe.
        - Para acessar um método estatico:
            [nome_da_classe].[nome_do_método]
      
     */

    public static void verNumeroGatos(){
        System.out.println(quantidade_de_gatos);
    }

    public void ver(){
        System.out.println("nome: "+nome+" idade: "+idade);
    }

}
