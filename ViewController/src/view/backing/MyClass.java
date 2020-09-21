package view.backing;

import javax.faces.event.ActionEvent;


import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class MyClass {
    public MyClass() {
    }
    
//    private int x;
//    private int y;
//    private int z;
    
    
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    
    public void addTwoNumbers(ActionEvent actionEvent) {
        
//        this.setZ(this.getX() + this.getY());
        int a = Integer.parseInt(this.getIt1().getValue().toString());
        int b = Integer.parseInt(this.getIt2().getValue().toString());
        this.getIt3().setValue(a+b  );
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }


    public void createEmployee(ActionEvent actionEvent) {
        
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bc =bctx.getCurrentBindingsEntry();
        OperationBinding ob = bc.getOperationBinding("CreateInsert");
        ob.execute();
    }
}
