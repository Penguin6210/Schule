public class Encryptor{
    private int upper; // obere Grenze für die Verschlüsselung
    private int lower; //untere Grenze für die Verschlüsselung
    private boolean isChar; // Boolean, um zu speichern, ob es sich um einen Buchstaben handelt, und eine Verschluesselung notwendig ist
    public static void main(String[] args){
    }
    public String encrypt (String input, int code, boolean revert){
        String temp = ""; // temporäre Variable, die die Verschlüsselten Zeichen aufnimmt
        for (int i=1;i<=input.length();i++){
                    int asciiInt = (int)input.charAt(i-1);
            
                    /**
                     * Prüfen, ob es sich um einen Groß-,Kleinbuchstaben oder anderes Zeichen handelt
                     */
                    if (asciiInt < 91 && asciiInt > 63){
                    
                       upper = 91;
                       lower = 63;
                       isChar = true;
                    }else if (asciiInt < 122 && asciiInt > 97){
                        
                        upper = 122;
                        lower = 97;
                        isChar = true;
                    }else{
                        isChar = false;
                    }
                    
                    /**
                     * Eigendliche Verschlüsselung  
                     */
                    if (isChar == true){
                    asciiInt= asciiInt + code;
                    if (asciiInt>=upper){
                            asciiInt = asciiInt - 26;
                    }else if(asciiInt<=lower){
                            asciiInt = asciiInt + 26;
                    }
                } else {}
                
                    
                            
                /**
                 * Umwandlung der Integer- in eine Char-Variable (aus Ganzzahl Zeichen)
                 */
                char c = (char)(asciiInt);
                /**
                 * Hinzufügen des Zeichens zum temporären String
                 */
                temp = temp + c;
        }
                    if (revert == true){
                        String rev = "";
                        for (int i = temp.length(); i>=1 ; i--){
                            rev = rev + temp.charAt(i-1);
                        }
                        temp = rev;
                    }
        /**
         * Temporären string aus allen Zeichen zurückgeben
         */
        return temp;
    }
    public String decrypt(String input, int code, boolean revert){
        /**
         * Zum Entschlüsseln muss der Code nur vom jew. Zeichen subtrahiert werden.
         * Dies geschieht hier, indem der code negativ gemacht wird ( code * (-1) )
         * und mit diesem dann die verschluesselungsfunktion aufgerufen wird.
         */
        code = code * (-1);
        return encrypt (input, code, revert);
        
    }
}


