package view.genx;

import javax.faces.event.ActionEvent;

public class GenxClassNew {
    public GenxClassNew() {
    }
    
    private int x;
    private int y;
    private int z;

    public void addTwoNum(ActionEvent actionEvent) {
        // Add event code here...
        
        this.setZ(this.getX() + this.getY());
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}
