import java.util.ArrayList;
import java.util.List; // 2. Importar a interface List (boa prática)
import java.util.HashMap;
import java.util.Map;

public class Pizza {

    private List<String> listaIngredientes = new ArrayList<>();
    private static Map<String,Integer> listaIngredientesPizzaria = new HashMap<String,Integer>();

    public void adicionaIngrediente(String ingrediente){
        listaIngredientes.add(ingrediente);

        contabilizaIngrediente(ingrediente);
    }

    public boolean temIngrediente(){
        
       return !listaIngredientes.isEmpty();
    }

    public int getPreco(){
        int numeroIngredientes = listaIngredientes.size();

        if(numeroIngredientes<=2){
            return 15;
        }
        if(numeroIngredientes<=5){
            return 20;
        }
        return 23;
    }


    private static void contabilizaIngrediente(String ingrediente){
        
        if(!listaIngredientesPizzaria.containsKey(ingrediente)){
            listaIngredientesPizzaria.put(ingrediente, 1);
        }else{
            int valorAntigo = listaIngredientesPizzaria.get(ingrediente);
            listaIngredientesPizzaria.put(ingrediente,valorAntigo+1);
        }
        

    }



}
