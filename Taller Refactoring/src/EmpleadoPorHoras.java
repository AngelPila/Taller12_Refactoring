public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;


    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);
        this.tarifaHora = tarifaHora;
        super.setSalarioBase(calcularSalario());
    }

    public void imprimirDetalles() {
        imprimirDetalles();
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * tarifaHora;
    }

    // Más metodos
}