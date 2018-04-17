import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * La clase EntradaTexto permitirá introducir un mensaje en el cual muestra el dia del mensaje, autor, texto, los me gustan y momento de publicacion.
 *
 * @author (Carlos Alvarez)
 * @version (16/04/2018)
 */
public class EntradaTexto
{
    private String usuario;
    private String mensaje;
    private int cantidadMeGusta;
    private ArrayList <String> comentarios;
    private LocalDateTime momentoPublicacion;

    /**
     * Constructor para los objetos de la clase EntradaMuro.
     */
    public EntradaTexto(String autor, String texto)
    {
        usuario = autor;
        mensaje = texto;
        cantidadMeGusta = 0;
        comentarios = new ArrayList <>();
        momentoPublicacion = LocalDateTime.now();        
    }

    /**
     * El metodo meGusta
     * Suma 1 meGusta al contador de me gusta.
     * 
     */
    public void meGusta()
    {
        cantidadMeGusta += 1;
    }

    /**
     * El metodo addComentario
     * permite añadir un comentario a las publicaciones.
     * @param introduce comentario como cadena.
     */
    public void addComentario(String text)
    {
        comentarios.add(text);
    }

    //Getters//

    /**
     * El metodo getMensaje
     * @return String como mensaje nuevo a una publicacion.
     */
    public String getMensaje()
    {
        return mensaje;
    }

    /**
     * El metodo LocalDateTime
     * @return hora actual en el momento de compartir una publicacion
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    //Metodo toString Texto//

    /**
     * El metodo toString
     * @return devuelve String con las caracteristicas de entrada a texto.
     */
    public String toString()
    {
        String devolver = "";
        devolver += usuario + " ha escrito " + mensaje + " hace: " + (LocalDateTime.now().getMinute() - momentoPublicacion.getMinute()) + " minutos y tiene: " + cantidadMeGusta +" me gusta- ";
        if(comentarios.size() == 0){
            devolver += "No hay comentarios";
        } else {
            for(int contador = 0; contador < comentarios.size(); contador++) {
                if(contador == comentarios.size() - 1) {
                    devolver += comentarios.get(contador);
                }
                else {
                    devolver += comentarios.get(contador) + " - ";
                }
            }
        }
        return devolver;
    }
}