package view.backing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class SSNValidator implements Validator {
    public SSNValidator() {
        super();
    }

    @Override
       public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException {
           
           String SSN = object.toString();
           String SSN_REGEX = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
           Pattern SSN_PATTERN = Pattern.compile(SSN_REGEX);
           Matcher matcher = SSN_PATTERN.matcher(SSN);
           String ERROR_MESSAGE = "SSN is Invalid!.";
           if(matcher.matches()){
                           
           }
           else{
               throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,ERROR_MESSAGE,null));
           }
       }
}
