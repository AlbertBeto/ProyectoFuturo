public class ProyectoFuturo {
public static String HorasEstudio(String nombre, int asignaturas, int horasSemana){
    System.out.println("Estudiante : " + nombre);
    if (horasSemana==asignaturas){
        return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
    }else if (horasSemana<asignaturas){
        return "Poco tiempo de estudio. Debes dedicar más tiempo.";
    }else{
        return "Ideal. Trabajas los contenidos en casa.";
    }
}
}