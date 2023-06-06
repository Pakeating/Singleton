
public class GestiondePersonal {
    public static void main(String args[]) {
        System.out.println("Los principales patrones de diseño creacionales son:");
        System.out.println("El patron singleton: Obliga a que solo pueda crearse una instancia de una clase. Se usa cuando el uso de varias instancias pueda provocar que se traten de hacer varias veces a la vez un proceso que no soporta eso.");
        System.out.println("El patron Factory: Permite añadir mas clases de diferentes tipos sin tocar las ya existentes. Un ejemplo sería añadir nuevos modelos de zapatillas (por ejemplo) con una caracteristica concreta en la aplicacion de una tienda");
        System.out.println("El patron Builder: Permite construir un objeto sencillo y a partir de el ir añadiendo capas de complejidad. Por ejemplo podríamos tener una clase coche basica, al que añadir otras como coche4x4, cocheLujo o cocheElectrico");
        System.out.println("El patron Prototype: Permite hacer clones de un objeto de manera rápida. Por ejemplo si tenemos de objetos muy similares pero que se diferencian en el valor de un solo atributo. Ejemplo: Muchos coches iguales de los cuales solo los diferencia su matricula");
        System.out.println("Los principales patrones de diseño estructurales son:");
        System.out.println("El patron Decorator: Nos permite amplicar la funcionalidad de una clase, haciendo de wrapper, lo que nos permite no tocar la clase original. Un ejemplo sería si tenemos una clase que realiza unas tareas contra una base de datos y decidimos añadir la funcionalidad de imprimir cada consulta");
        System.out.println("El patron Adapter: Nos permite adaptar una clase que no cumple con la interfaz que deben cumplir todos nuestras clases mediante el uso de una clase puente. un ejemplo sería una clase legacy de hace 10 años que debe aplicarse ahora a un programa actual.");
        System.out.println("El patron Facade o fachada: Oculta toda la logica interna en otra clase y simplifica el trabajo al programador que viene detras. Un uso tipico sería ocultar el funcionamiento interno de una parte del programa, por ejemplo de la conexion contra una base de datos");
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
