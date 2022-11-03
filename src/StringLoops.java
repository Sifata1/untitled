public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public static int countCharacters(String character, String searchString) {
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            String s = searchString.charAt(i) + "";
            if (s.equals(character)) {
                count++;
            }
        }
        return count;
    }


    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString)
    {
        String orig = origString;
        String s ="";
        for (int i=0; i<origString.length();i++) {
            s = orig.substring(i,i+1) + s;
        }
        /* to be implemented */
        return s;
    }


    /* Returns the original string reversed -- SECOND IMPLEMENTATION

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString2(String origString)
    {
        String orig = origString;
        String s ="";
        for (int i=origString.length(); i<0;i--) {
            s = orig.substring(i,i+1) + s;
        }
        /* to be implemented */
        return s;
    }

    public int countVowels(String origString)
    {
        int count = 0;
        for (int i = 0; i < origString.length(); i++) {
            String s = origString.charAt(i) + "";
            if (s.equals("a") || s.equals("e") || s.equals("i")|| s.equals("o") || s.equals("u") || s.equals("A") || s.equals("E") || s.equals("I")|| s.equals("O") || s.equals("U"))  {
                count++;
            }
        }
        return count;
    }

    public int countString(String searchString, String origString) {
        int count = 0;
        String s = origString;
        int max = origString.length() - searchString.length();
        int len = searchString.length();



        for (int i = 0; i <= max; i++) {
            String substring = origString.substring(i, i + searchString.length());
            if (substring.equals(searchString)) {
                count++;
            }
        }
        return count;


    }
}
