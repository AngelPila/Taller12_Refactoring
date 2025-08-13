public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Departamento dpsis = new DepSistemas();
        Departamento dpcont = new DepContabilidad();
        Departamento dpmed = new DepMedico();
        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, dpsis, "Masculino");
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor",700,45,dpcont,40, "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas",200,20,dpmed,6, "Masculino");

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}