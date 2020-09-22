package view.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class Validate {
    public Validate() {
    }

    public void emailValidator(FacesContext facesContext, UIComponent uIComponent, Object object) {
            // Add event code here...
        String email_address = object.toString();
        String email_pattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern patn = Pattern.compile(email_pattern);
        Matcher matcher=patn.matcher(email_address);
        
        String Error_Message = "You have entered an invalid email address. Please try again.";
        
        if(!matcher.matches()){
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,Error_Message,null));
        }
        
        }
}
