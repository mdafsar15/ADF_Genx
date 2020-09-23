package view.dynamic;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class BackingBean {
    public BackingBean() {
    }
    
    boolean MkaeEdit = false;

    public void it4_validator(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...

    }

    public void setMkaeEdit(boolean MkaeEdit) {
        this.MkaeEdit = MkaeEdit;
    }

    public boolean isMkaeEdit() {
        return MkaeEdit;
    }

}
