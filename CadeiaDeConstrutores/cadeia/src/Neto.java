public class Neto extends Filho {

    protected int attrNeto;
    public Neto(int pai, int filho, int neto){
        super(pai,filho);
        attrNeto = neto;
        
        System.out.println("Eu sou o neto. meus atributos: "+attrPai+" "+attrFilho+" "+attrNeto);
    }

}
