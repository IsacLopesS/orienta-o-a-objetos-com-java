public class Candidato implements Comparable<Candidato> {

    private int nota;
    private boolean deficiente;
    private int idade;

    

    public Candidato(int nota, boolean deficiente, int idade) {
        this.nota = nota;
        this.deficiente = deficiente;
        this.idade = idade;
    }

    public int getNota() {
            return nota;
        }
    public boolean isDeficiente() {
        return deficiente;
    }
    public int getIdade() {
        return idade;
    }



    public int compareTo(Candidato outro){

        if(nota == outro.getNota()){
            if(deficiente == outro.isDeficiente()){
                return outro.getIdade() - idade;
            }else{
                if(deficiente)
                    return -1;
                else
                    return 1;
            }

        }else{
            return outro.getNota() - nota;
        }
    }

    @Override
    public String toString(){
        return nota+";"+deficiente+";"+idade;
    }

    public void imprimir(){
        System.out.println(nota+";"+deficiente+";"+idade);
    }


}
