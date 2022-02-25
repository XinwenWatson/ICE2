package midtermreviewcodeforpartc;

public class PasswordValidator{    
    
    public boolean passwordValidate(String password){        
        boolean validPassword=false;
        int specialCharCount=0;
        //iterate over each character to see if it is a special character
        for(int i=0;i<password.length(); i++)
        {
            if(!(Character.isLetterOrDigit(password.charAt(i))))
            {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }
        if(specialCharCount>0 &&password.length()>7)
        {
            validPassword=true;
        }
        return validPassword;
    }
    
        
}
