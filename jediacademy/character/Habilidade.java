public class Habilidade {
   private String tipoForca;
   private int valor;

   public Habilidade (String tipoForca, int valor) {
      this.setTipoForca(tipoForca);
      this.setValor(valor);

   }

   public String getTipoForca() {
      return tipoForca;
   }

   private void setTipoForca(String tipoForca) { //somente o construtor da classe pode alterar
      this.tipoForca = tipoForca;
   }

   public int getValor() {
      return valor;
   }

   private void setValor(int valor) { //somente o construtor da classe pode alterar
      this.valor = valor;
   }

}