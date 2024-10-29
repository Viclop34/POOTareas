public class Main {
    public static void main(String[] args) {
        Envio envioNacional = new EnvioNacional(300,6,600);
        envioNacional.validarPeso(envioNacional.peso);
        envioNacional.calcularTiempoYCostoEntrega();

        System.out.println(" ");

        Envio enviInternacional = new EnvioInternacional(500,12,"España");
        enviInternacional.validarPeso(enviInternacional.peso);
        enviInternacional.calcularTiempoYCostoEntrega();
    }
}