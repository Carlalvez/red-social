import java.util.ArrayList;
/**
 * En esta clase, se implementará todo lo que se muestran en las clase EntradaTexto y EntradaFoto
 *
 * @author (Carlos Alvarez)
 * @version (17/04/2018)
 */
public class Muro
{
    private ArrayList <EntradaTexto> mensajes;
    private ArrayList <EntradaFoto> fotos;

    /**
     * Constructor de objetos de la case Muro
     */
    public Muro()
    {
        mensajes = new ArrayList <>();
        fotos = new ArrayList <>();
    }

    /**
     * Metodo que introduce texto en el Muro
     * @param erntrada texto
     */

    public void addEntradaTexto (EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }

    /**
     * Metodo que introduce foto en el Muro
     * @param erntrada foto
     */

    public void addEntradaFoto (EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    
    /**
     * Metodo que muestra todas las entradas mencionadas anteriormente.
     */
    public String toString(){
        String publitexto = "";
        String publifoto = "";
        if(mensajes.size() > 0){
            int contador1 = 1;
            for(EntradaTexto entradaTexto : mensajes)
            {
                publitexto += " Entrada de texto: " + contador1 + entradaTexto;
                contador1++;
            }
        } else {
            System.out.println("El muro no tiene entradas de texto");
        }  
        System.out.println();

        if(fotos.size() > 0){
            int contador2 = 1;
            for(EntradaFoto entradaFoto :fotos)
            {
                publifoto+= " Entrada de Foto: " + contador2 + entradaFoto ;
                contador2++;
            }
        } else {
            System.out.println("El muro no tiene entradas de fotos");
        }
        return publitexto + " " + publifoto;
    }
}