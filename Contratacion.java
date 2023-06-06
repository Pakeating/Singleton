public class Contratacion{
    private String nombre;
    private String apellidos;
    private static Contratacion contratacion;
    private Contratacion(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    public static Contratacion contrataEmpleado(String nombre, String apellidos){
        if(contratacion==null){
            Contratacion contratacion=new Contratacion(nombre, apellidos);
            return contratacion;
        }
        else{
            contratacion.nombre=nombre;
            contratacion.apellidos=apellidos;
            return contratacion;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
}