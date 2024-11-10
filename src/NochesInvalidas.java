public class NochesInvalidas extends Exception {
  public NochesInvalidas() {
    super("NUMERO NEGATIVO DETECTADO");
  }

  public NochesInvalidas(String mensaje) {
    super(mensaje);
  }
}
