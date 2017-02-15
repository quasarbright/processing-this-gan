Todos los derechos reservados
 * Para cambiar esta cabecera de licencia, elija Cabeceras de licencia en Propiedades del proyecto.
 * Para cambiar este archivo de plantilla, elija Herramientas | Plantillas
 * Y abre la plantilla en el editor.
 * /
Paquete ACSL2;
Import java.util.ArrayList;
Todos los derechos reservados
 *
 * @author mdelmonaco
 * /
Public class AscendingStrings {
    Public static String uno (String num, String prev, boolean atStart) {
        If (atStart) {
            Para (int i = 0; i <num.length (); i ++) {
                If (Integer.parseInt (num.substring (0, i + 1))> Integer.parseInt (prev))
                    Return num.substring (0, i + 1);
            }
        }
        más{
            Para (int i = num.length () - 1; i> = 0; i -) {
                If (Integer.parseInt (num.substring (i, num.length ()))> Integer.parseInt (prev))
                    Return num.substring (i, num.length ());
            }
        }
        Devolver "duque";
    }
    Public static int cutLength (String num, String prev, boolean atStart) {
        If (atStart) {
            Para (int i = 0; i <num.length (); i ++) {
                If (Integer.parseInt (num.substring (0, i + 1))> Integer.parseInt (prev))
                    Return num.substring (0, i + 1) .length ();
            }
        }
        más{
            Para (int i = num.length () - 1; i> = 0; i -) {
                If (Integer.parseInt (num.substring (i, num.length ()))> Integer.parseInt (prev))
                    Return num.substring (i, num.length ()). Length ();
            }
        }
        Return -1;
    }
    Public static ArrayList <Integer> proceso (String num) {
        ArrayList <Integer> nums = new ArrayList <> ();
        Boolean atStart = false;
        Cadena prev = num.substring (0,1);
        Nums.add (prev);
        Num = num.substring (1);
        Int len ​​= 1;
        While (! Prev.equals ("duque") && len! = -1 && cutLength (num, prev, atStart)
            
            Prev = one (num, prev, atStart); // cambiar cosas, anexar, etc
            Nums.add (prev);
            Len = cutLength (num, prev, atStart);
            If (atStart) {
                Num = num.substring (len-1);
            }
            más{
                Num = num.substring (0, num.length () - len + 1);
            }
            AtStart =! AtStart;
        }
        
        
    }
    
    
    Public static void main (String [] args) {
        ArrayList <Integer> nums = new ArrayList <> ();
        String num = "31415926538"; // debería tener una lista de cadenas más adelante
        Nums = proceso (num);
    }
}
