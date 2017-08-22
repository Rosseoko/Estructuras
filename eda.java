
 *
 * @author mrodrigusan
 */
public class Anagrama {
    
    private static void anagrama(String s1, String s2) {
        char c;
        String resto;

        if (s1.length() == 0) {
            System.out.println(s2);
        } else {

            for (int i = 0; i < s1.length(); i++) {
                c = s1.charAt(i);
                resto = s1.substring(0, 1) + s1.substring(i+1);
                anagrama(resto, c + s2); //Ir reduciendo s1, caracter por caracter
            }

        }
    }
    
    
    private static void ana(String cadena){
     anagrama(cadena,"");
    
    }
      
     public static void main(String[] args) {
         
         ana("Hey");
        
    }
    
    
}

    