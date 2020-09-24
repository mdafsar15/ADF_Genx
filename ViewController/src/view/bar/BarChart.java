package view.bar;

import java.math.BigDecimal;

import java.util.Iterator;

import java.util.List;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class BarChart {
    public BarChart() {
    }

    public void onClick(SelectionEvent selectionEvent) {
        // Add event code here...

        // Get the Selected bar

        RowKeySet rowset = selectionEvent.getAddedSet();

        Iterator selectedRowsIterator = rowset.iterator();

        //Get the Employee Iterator

        DCBindingContainer bindings = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();

        DCIteratorBinding employeeIterator = bindings.findIteratorBinding("EmployeeEOView1Iterator");

        RowSetIterator employeeRowSetIterator = employeeIterator.getRowSetIterator();

        // Loop through selected rows

        while (selectedRowsIterator.hasNext()) {

        // Get key for selected row

        Key key = (Key)((List)selectedRowsIterator.next()).get(0);

        // Use the key to get the data from the above binding that is related to the row

        Row myRow = employeeRowSetIterator.getRow(key);

        //Get the Salary of selected bar

        BigDecimal salary =(BigDecimal) myRow.getAttribute("Salary");

        //Set the Salary to Gauge Chart

//        this.dialGauge1.setValue(salary);

        //Refresh the Dial gauge

        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();

//        adfFacesContext.addPartialTarget(this.dialGauge1);

        }
    }
}
