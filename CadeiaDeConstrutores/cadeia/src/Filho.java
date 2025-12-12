public class Filho extends Pai{
     
    protected int attrFilho;

    public Filho(int atrP, int atrF){
        super(atrP); // chama o construtor do pai e passa o atrP para ele
        this.attrFilho = atrF;

        System.out.println("Eu sou o Filho. meus atributos: "+atrP+" e "+attrFilho);
    }

}
