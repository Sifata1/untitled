public class SecurePassword
{
    // instance variable
    private String password;

    // constructor
    public SecurePassword(String password)
    {
        this.password = password;
    }

    public void setPassword(String newPassword)
    {
        password = newPassword;
    }

    /* Returns true if password:
       - Is at least 8 characters long
       - Contains at least one uppercase letter
       - Contains at least one lowercase letter
       - Contains at least one numeric digit
       - Contains at least one of these "special symbols":  ! @ # $ % ^ & * ?
       Must satisfy ALL FIVE categories for password to be "secure"
       Return false if any of the above security requirements are not fulfilled.
    */
    public boolean isSecure()
    {
        if (this.isLongEnough() && this.containsDigit() && this.containsLowercase() && this.containsUppercase() && this.containsSpecialSymbol()) {
            return true;
        }
        return false;
    }

    /* Returns a String that contains information about the security status of the
       current password.

       If isSecure() is true, this method returns "Password is secure"
       If isSecure() is false, this methods should return a single String that informs the
       user of which security requirements are not currently being met.

       For example, the password 3WrT6tH does not meet length or special symbol
       requirements, so this method should return the following String (using a line
       break \n):

       "The password must be at least 8 characters
        The password must contain a special symbol: ! @ # $ % ^ & * ?"
    */
    public String status()
    {

    }


    // PRIVATE HELPER METHODS (marked "private" rather than "public")

    /* Returns true if the password’s length meets the minimum requirement of 8 characters
       and false otherwise.
     */
    private boolean isLongEnough()
    {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    /* Returns true if the password has at least one uppercase letter and false otherwise.
     */
    private boolean containsUppercase()
    {
        /* this one is completed for you as a hint for how to do the others! */
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return checkString(upperCaseLetters);
    }

    /* Returns true if the password has at least one lowercase letter and false otherwise.
     */
    private boolean containsLowercase()
    {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = upperCaseLetters.toLowerCase();
        return checkString(lowerCaseLetters);
    }

    /* Returns true if the password has at least one digit and false otherwise.
     */
    private boolean containsDigit()
    {
        String numbers = "0123456789";
        return checkString(numbers);
    }

    /* Returns true if the password has at least one of these special symbols:
       ! @ # $ % ^ & * ?    and false otherwise.
     */
    private boolean containsSpecialSymbol()
    {
        String specialChar = "!@#$%^&*";
        return checkString(specialChar);
    }

    /* Checks a given character string to see if password contains at least one
       character from that string.

       For example, if characterString is "ABCDEFGH", and password == "jbHFmfA"
       this method will find two occurrences (F and A) and return true, since two
       is at least one
     */
    private boolean checkString(String characterString)
    {
        int count = 0;
        for (int i = 0; i != password.length(); i++) {
            if (password.indexOf(password.charAt(i)) != -1  ) {
                count++;
            }
            i++;

        }
        if (count >= 1){
            return true;
        }
        return false;
    }
}
