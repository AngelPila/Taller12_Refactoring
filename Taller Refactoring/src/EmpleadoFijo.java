public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
    }

    public void imprimirDetalles() {
        imprimirDetalles();
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
