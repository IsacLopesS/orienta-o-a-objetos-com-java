
public class Main {
    public static void main(String args[])  {
        

        Gato g1 = new Gato("Garfield", 4);
        Gato g2 = new Gato("Gato de botas", 2);
        Gato g3 = new Gato("Tom", 8);


        g1.ver();

        Gato.verNumeroGatos();

        System.out.println(Gato.quantidade_de_gatos);


        // chamar um método estatico que nao esta associado a nenhuma classe

        Double media = calcularMedia(4.0, 8.0);

        System.out.println("Valor da média: " + media);

    }


    /* um método estatico na classe Main é o analogo a uma função em C. Logo ela pode ser invocada sem estar associada
     * a nenhuma classe.
     */
    public static Double calcularMedia(Double a, Double b){

        return (a+b)/2;
    }
}
