class Mascota {

    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    public Mascota(String nombre, String especie,
                   double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setPeso(double nuevoPeso) {
        if (nuevoPeso <= 0) {
            System.out.println(
                    "RECHAZADO: el peso debe ser mayor que cero."
            );
            return;
        }

        this.peso = nuevoPeso;
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad < 0) {
            System.out.println(
                    "RECHAZADO: la edad no puede ser negativa."
            );
            return;
        }

        this.edad = nuevaEdad;
    }

    public int valorConsulta() {
        int valor;

        if (peso > 25) {
            valor = 55000;
        } else if (peso > 10) {
            valor = 45000;
        } else {
            valor = 35000;
        }

        if (edad >= 8) {
            valor += 12000;
        }

        return valor;
    }

    public String descripcion() {
        return nombre + " (" + especie + ", "
                + peso + " kg, " + edad + " anios)";
    }
}