package desafioecore_palindromo;

/**
 *
 * @author Evandro Falkembach Barbosa.
 */
public class DesafioECore_Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Palindromo("arara");
        Palindromo("ovo");
        Palindromo("1234809890");
        Palindromo("socorram me subi no onibus em marrocos");
        Palindromo("Este não pode ser palindrome");
    }

    public static void Palindromo(String frase) { 
	if( testePalindromo(frase) ){
            System.out.println( frase + " é um palíndromo");
	}else{
            System.out.println( frase + " não é um palíndromo");   
        }    
    }
    
    private static boolean PalindromoRecursive(String frase, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (frase.charAt(i) != frase.charAt(j)) {
            return false;
        }
        return PalindromoRecursive(frase, i + 1, j - 1);
    }
    
    public static boolean testePalindromo(String frase) {
        frase = frase.replaceAll(" ", "");
        return PalindromoRecursive(frase, 0, frase.length() - 1);
    }
}
