import java.util.ArrayList;
import java.util.List;

public class PersonaCRUD {
    private List<Persona> personas;

    public PersonaCRUD() {
        this.personas = new ArrayList<>();
    }

    // Crear una nueva persona
    public void crearPersona(String nombre, int edad) {
        Persona nuevaPersona = new Persona(nombre, edad);
        personas.add(nuevaPersona);
        System.out.println("Persona creada: " + nuevaPersona);
    }

    // Leer todas las personas
    public void leerPersonas() {
        System.out.println("Lista de personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    // Actualizar una persona
    public void actualizarPersona(int index, String nuevoNombre, int nuevaEdad) {
        if (index >= 0 && index < personas.size()) {
            Persona persona = personas.get(index);
            persona.setNombre(nuevoNombre);
            persona.setEdad(nuevaEdad);
            System.out.println("Persona actualizada: " + persona);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Eliminar una persona
    public void eliminarPersona(int index) {
        if (index >= 0 && index < personas.size()) {
            Persona persona = personas.remove(index);
            System.out.println("Persona eliminada: " + persona);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
