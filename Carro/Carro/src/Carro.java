public class Carro {
    int potencia;
    int velocidade=0;
    String nome;
    int limiteVelocidadade=100;

    void acelerar(){
        
         velocidade+=potencia;
        if(velocidade >= limiteVelocidadade){
            velocidade = limiteVelocidadade;
        }
       
       
        
    }

    void freiar(){
        velocidade = velocidade/2;
    }

    int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro "+nome+" está a velocidade de "+velocidade+" km/h");
    }

}
