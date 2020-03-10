package ExamenDaw;

/**
 * Clase que nos permite obtener una frase compuesta de un número y una frase..
 * 
 * @author Adrián Laya García.
 * @version 10/03/2020
 */

public interface doc
{

    // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
    public abstract String obtenerLinea(int x, String file);

    int x=0;
    String file="";

    /**
     * Introduce el valor de X.
     * 
     * @param x, un numero int de x
     * 
     */      
    public abstract void setX(int x);

    this.x=x;

    /**
     * Recoge el valor de x.
     * 
     * @return x, un int de x.
     * 
     */       
    public abstract int getX();
    return x;

    /**
     * Introduce el valor de file.
     * 
     * @param file, un String de file.
     * 
     */      
    public abstract void setFile(String file);

    this.file=file;

    /**
     * Recoge el valor de file.
     * 
     * @return file, un String de file.
     */       
    public abstract int getFile();  
    return file;

}

