import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        List<Candidato> lista = new ArrayList<>();

        lista.add(new Candidato(80, true, 30));
        lista.add(new Candidato(80, false, 25));
        lista.add(new Candidato(80, false, 28));
        lista.add(new Candidato(90, false, 20));

        Collections.sort(lista);

        for(Candidato c : lista){
            //c.imprimir();
            System.out.println(c);
        }

    }
}
