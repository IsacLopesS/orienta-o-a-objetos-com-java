public class App {
    public static void main(String[] args) throws Exception {
       

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();

        p1.adicionaIngrediente("tomate");
        p1.adicionaIngrediente("cebola");

        p2.adicionaIngrediente("tomate");

        p2.adicionaIngrediente("cebola");

        p2.adicionaIngrediente("calabreza");


        CarrinhoDeCompras c1 = new CarrinhoDeCompras();

        c1.adicionaPizza(p2);
         
    }
}
