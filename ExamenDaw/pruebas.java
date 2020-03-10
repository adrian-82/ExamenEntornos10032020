package ExamenDaw;


/**
 * Write a description of class pruebas here.
 * 
 * @author Adrián Laya García 
 * @version 10/03/2020
 */
public class pruebas
{
    public static int paraProbar(int x)
    {
        if(x<4)
        {
            return x-4;
        }
        else
        {
            if(x%2==0)
            {
                return x + 2;
            }
            else
            {
                return x+1;
            }
        }
    }    // instance variables - replace the example below with your own
}
