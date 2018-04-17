import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * La clase EntradaFoto permitirá introducir una imagen acoplada al comentario por el texto, saldrá tambien el autor, texto y y momento de publicacion.
 *
 * @author (Carlos Alvarez)
 * @version (16/04/2018)
 */
public class EntradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private int cantidadMeGusta;
    private ArrayList <String> comentarios;
    private LocalDateTime momentoPublicacion;

    /**
     * Constructor para los objetos de la clase EntradaMuro.
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        this.usuario = autor;
        this.urlImagen = url;
        cantidadMeGusta = 0;
        comentarios = new ArrayList <>();
        momentoPublicacion = LocalDateTime.now();
        this.titulo = titulo;
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
     * El metodo getUrlImagen
     * @return String como imagen nueva a una publicacion.
     */
    public String getUrlImagen()
    {
        return urlImagen;
    }

    /**
     * El metodo getTituloImagen
     * @return el titulo que llevará la publicación insertada
     */
    public String getTituloImagen()
    {
        return titulo; 
    }
    
    /**
     * El metodo LocalDateTime
     * @return hora actual en el momento de compartir una publicacion
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    //Metodo toString Foto//
    
    /**
     * El metodo toString
     * @return devuelve String con las caracteristicas de entrada a texto.
     */
    public String toString()
    {
        String devolver = "";
        devolver += usuario +" publica enlace " + urlImagen + " con titulo " + titulo + " hace: " + (LocalDateTime.now().getMinute() - momentoPublicacion.getMinute()) + " minutos y tiene: " + cantidadMeGusta +" me gusta- ";
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