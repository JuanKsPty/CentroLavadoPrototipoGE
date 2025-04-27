package milibreria;

public class Funcionalidades_Logicas {
    private double peso;
    private int tipoRopa;
    private double volumenAgua;

    final double TIEMPO_SUAVE = 3.0;
    final double TIEMPO_NORMAL = 4.0;
    final double TIEMPO_PESADO = 5.0;

    final double TEMP_MAX_SECO = 35.7;
    final double TEMP_PLANCHAR = 40.7;

    public Funcionalidades_Logicas(double peso, int tipoRopa, double volumenAgua) {
        this.peso = peso;
        this.tipoRopa = tipoRopa;
        this.volumenAgua = volumenAgua;
    }

    public void CicloLogicoTerminado() {
        if (controlCargaAgua() && validarCarga()) {
            lavado();
            centrifugado();
            secado();
            planchado();
        } else {
            System.out.println("No se cumplen las condiciones iniciales para iniciar el ciclo.");
        }
    }

    private boolean controlCargaAgua() {
        boolean validacion = volumenAgua >= 4.0 && volumenAgua <= 4.5;
        if (!validacion) {
            System.out.println("El volumen del agua esta fuera del rango permitido (4.0 - 4.5 pies cubicos).");
        }
        return validacion;
    }

    private boolean validarCarga() {
        boolean validacion = (tipoRopa == 1 && peso == 10) ||
                (tipoRopa == 2 && peso == 20) ||
                (tipoRopa == 3 && peso == 30);
        if (!validacion) {
            System.out.println("El peso y el tipo de ropa no corresponden.");
        }
        return validacion;
    }

    private void lavado() {
        String tipo;
        if (tipoRopa == 1) {
            tipo = "Suave o delicada.";
        } else if (tipoRopa == 2) {
            tipo = "Normal o común.";
        } else { tipo = "Pesada o gruesa."; }

        System.out.println("Iniciando lavado de ropa tipo: " + tipo);
    }

    private void centrifugado() {

        double tiempo;

        if (tipoRopa == 1) {
            tiempo = TIEMPO_SUAVE;
        } else if (tipoRopa == 2) {
            tiempo = TIEMPO_NORMAL;
        } else {tiempo = TIEMPO_PESADO; }

        System.out.println("Centrifugando durante " + tiempo + " minutos.");
    }

    private void secado() {
        System.out.println("Secado en proceso...");

        double temperaturaAlcanzada = Math.random() < 0.5 ? TEMP_MAX_SECO : TEMP_PLANCHAR;

        if (temperaturaAlcanzada >= TEMP_PLANCHAR) {
            System.out.println("Secado completo: Se ha alcanzado temperatura de planchado.");
        } else if (temperaturaAlcanzada >= TEMP_MAX_SECO) {
            System.out.println("Secado completo: Solo se ha secado la prenda.");
        } else {
            System.out.println("Advertencia: No se alcanzó temperatura suficiente de secado.");
        }
    }


    private void planchado() {
        if (tipoRopa == 1 || tipoRopa == 2) {
            System.out.println("Planchado finalizado exitosamente para tipo de ropa permitido.");
        } else {
            System.out.println("Tipo de ropa no requiere planchado final.");
        }
    }
}
