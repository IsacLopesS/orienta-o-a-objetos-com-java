import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

   private List<Pizza> carrinho = new ArrayList<>();


   public void adicionaPizza(Pizza pizza){    

      if(pizza.temIngrediente()){
         carrinho.add(pizza);
      }else{
         System.out.println("Erro: impossivel adicionar pizza sem ingredientes! ");
      }
   }

   

   public int valorTotalCompra(){

      int valorTotal = 0;

      for(Pizza p : carrinho){
            valorTotal = valorTotal + p.getPreco();

      }
      return valorTotal;
   }

    
    
}
