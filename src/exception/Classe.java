package exception;

public class Classe {
    private String studenti;
    // pogliani,scarsella,berti
    private int maxStudenti = 3;

    public Classe(String studenti) throws ClasseTroppoGrandeException{

        if(contaStudenti(studenti) > maxStudenti){
            // scateno l'eccezione
            throw new ClasseTroppoGrandeException("classe troppo grande");
        }else{
            this.studenti = studenti;
        }
    }
    public int contaStudenti(String s){
        return s.split(",").length;
        //return Integer.parseInt(String.valueOf(this.studenti.chars().filter(ch -> ch == ',').count()))+1;
    }
}
