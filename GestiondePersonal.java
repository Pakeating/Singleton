
public class GestiondePersonal {
    public static void main(String args[]) {
      String nombre="Lucía";
      String apellidos="Bolaño Esgueva";
      Contratacion nuevaContratacion=Contratacion.contrataEmpleado(nombre, apellidos);
      imprime(nuevaContratacion);
      nombre="Paco";
      apellidos="Porras García";
      nuevaContratacion=Contratacion.contrataEmpleado(nombre,apellidos);
      imprime(nuevaContratacion);
    }
    public static void imprime(Contratacion nuevaContratacion){
        System.out.println(nuevaContratacion.getNombre()+" "+nuevaContratacion.getApellidos());
    }
}