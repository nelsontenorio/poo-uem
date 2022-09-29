import java.util.ArrayList;

public class Jedi extends Ser {
    private String corSabre;
    private ArrayList<Habilidade> habilidade; // criação da associação de arraylist (Collection) de habilidades

    public Jedi(String nome, String tipoForca, String valor) {
        // criação da composição do arraylist de habilidade com o Jedi
        String[] vetForca = tipoForca.split(","); // separa as forças da String
        String[] vetValorStr = valor.split(", "); // separa o valor das forças da String
        int[] vetValor = new int[vetValorStr.length]; // prepara um vetor de int para valor de forças
       
        for (int i = 0; i < vetValor.length; i++) {
            vetValor[i] = Integer.valueOf(vetValorStr[i]); // converte um vetor str em vetor de int
        }
       
        this.setNome(nome);
        this.habilidade = new ArrayList<Habilidade>();
        
        for (int i = 0; i < vetForca.length; i++) {
            this.habilidade.add(new Habilidade(vetForca[i], vetValor[i])); // adiciona no arrayList criando o objeto
                                                                           // habilidades conforme construtor
        }

    }

    public String getCorSabre() {
        return corSabre;
    }

    public void setCorSabre(String corSabre) {
        this.corSabre = corSabre;
    }

    public ArrayList<Habilidade> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(ArrayList<Habilidade> habilidade) {
        this.habilidade = habilidade;
    }

    public String toString() {
        String habilidades = "";
        for (Habilidade h : this.habilidade) {
            habilidades = habilidades + "\nHabilidade: " + h.getTipoForca() + "   Valor: " + h.getValor();
        }

        return "\nJedi: " + this.getNome() + habilidades;

    }

}