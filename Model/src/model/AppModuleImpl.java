package model;

import model.common.AppModule;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 14 21:04:37 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }


    public int add(int x, int y){
        return(x+y);
    }
    
    public String runQry(){
        ViewObjectImpl vo = this.getEmployeesView1();
        vo.executeQuery();
        RowSetIterator rs = vo.createRowSetIterator(null);
        String fname="";
        while(rs.hasNext()){
            Row r = rs.next();
            fname = fname +"," + r.getAttribute("FirstName");
        }
        return fname;
    }
    
    
    public String runQueryWithParams(int d){
        ViewObjectImpl vo = this.getEmployeesView1();
        vo.setNamedWhereClauseParam("bDeptId", d);
        vo.executeQuery();
        RowSetIterator rs = vo.createRowSetIterator(null);
        String fname="";
        while(rs.hasNext()){
            Row r = rs.next();
            fname = fname +"," + r.getAttribute("FirstName");
        }
        return fname;
    }
    
//    public String applyFndByDeptIdVC(int d){
//        ViewObjectImpl vo = this.getEmployeesView1();
//        ViewCriteria vc = vo.getViewCriteria("findByDeptId");
//        vo.setNamedWhereClauseParam("bDeptId", d);
//        vo.applyViewCriteria(vc);
//        vo.executeQuery();
//        
//        RowSetIterator rs = vo.createRowSetIterator(null);
//        String fname="";
//        while(rs.hasNext()){
//            Row r = rs.next();
//            fname = fname +"," + r.getAttribute("FirstName");
//        }
//        return fname;
//    }

 
    public void applyFndByDeptIdVC(int d){
        ViewObjectImpl vo = this.getEmployeesView1();
        ViewCriteria vc = vo.getViewCriteria("findByDeptId");
        vo.setNamedWhereClauseParam("bDeptId", d);
        vo.applyViewCriteria(vc);
        vo.executeQuery();
    }

    /**
     * Container's getter for DepartmentsView1.
     * @return DepartmentsView1
     */
    public ViewObjectImpl getDepartmentsView1() {
        return (ViewObjectImpl) findViewObject("DepartmentsView1");
    }

    /**
     * Container's getter for DepartmentView1.
     * @return DepartmentView1
     */
    public ViewObjectImpl getDepartmentView1() {
        return (ViewObjectImpl) findViewObject("DepartmentView1");
    }


    /**
     * Container's getter for EmployeesView1.
     * @return EmployeesView1
     */
    public EmployeesViewImpl getEmployeesView1() {
        return (EmployeesViewImpl) findViewObject("EmployeesView1");
    }

    /**
     * Container's getter for EmployeesView2.
     * @return EmployeesView2
     */
    public EmployeesViewImpl getEmployeesView2() {
        return (EmployeesViewImpl) findViewObject("EmployeesView2");
    }

    /**
     * Container's getter for DeptEmpVL1.
     * @return DeptEmpVL1
     */
    public ViewLinkImpl getDeptEmpVL1() {
        return (ViewLinkImpl) findViewLink("DeptEmpVL1");
    }
}

