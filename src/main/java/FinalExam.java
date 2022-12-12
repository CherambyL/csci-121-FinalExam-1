public class FinalExam {
    /**
     * converts a string into an array of characters terminated by a null character ('\0').
     * The character at each array index is the same as the character at that index in the string.
     *
     * @param aString a string
     * @return returns an array of character terminated by a '\0' containing the characters in the string
     */
    public static char[] cstring(String aString){
        if(aString == null){
            return null;
        }
        char[]  tide = new char[aString.length() + 1];
        for (int x = 0; x < aString.length(); x++){
            tide[x] = aString.charAt(x);
        }
        tide[tide.length - 1] = '\0';
        return tide;
    }
}

