package APs;

import APs.common.AppModule;

import oracle.jbo.JboException;
import oracle.jbo.common.ResourceBundleDef;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 05 13:47:51 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for EmployeesVO1.
     * @return EmployeesVO1
     */
    public ViewObjectImpl getEmployeesVO1() {
        return (ViewObjectImpl) findViewObject("EmployeesVO1");
    }

    /**
     * Container's getter for DepartmentsVO1.
     * @return DepartmentsVO1
     */
    public ViewObjectImpl getDepartmentsVO1() {
        return (ViewObjectImpl) findViewObject("DepartmentsVO1");
    }
    
    public void foo() {
        ResourceBundleDef r= getResourceBundleDef();
        throw new JboException(r, "INVALID", null);
    }

    /**
     * Container's getter for DepartmentsVO2.
     * @return DepartmentsVO2
     */
    public ViewObjectImpl getDepartmentsVO2() {
        return (ViewObjectImpl) findViewObject("DepartmentsVO2");
    }
}
