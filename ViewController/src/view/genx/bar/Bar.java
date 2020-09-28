package view.genx.bar;

import java.util.ArrayList;
import java.util.Hashtable;

import java.util.List;

import oracle.adf.view.rich.component.rich.RichForm;

import org.apache.myfaces.trinidad.model.CollectionModel;
import org.apache.myfaces.trinidad.model.ModelUtils;

public class Bar {
    private RichForm getBarChartData;

    public Bar() {
    }

    public void setGetBarChartData(RichForm getBarChartData) {
        this.getBarChartData = getBarChartData;
    }

    public RichForm getGetBarChartData() {
        return getBarChartData;
    }
    
    public CollectionModel getBarChartData() {

    List<Hashtable> dataItems = new ArrayList<Hashtable>();


    Hashtable table1 = new Hashtable();
    table1.put("location", "Atlanta"); // Series
    table1.put("job", "Manager");//Group
    table1.put("salary", 3000);//Value


    Hashtable table2 = new Hashtable();
    table2.put("location", "Frankfort");
    table2.put("job", "Manager");
    table2.put("salary", 3500);


    Hashtable table3 = new Hashtable();
    table3.put("location", "Atlanta");
    table3.put("job", "Director");
    table3.put("salary", 5000);


    Hashtable table4 = new Hashtable();
    table4.put("location", "Frankfort");
    table4.put("job", "Director");
    table4.put("salary", 6000);


    dataItems.add(table1);
    dataItems.add(table2);
    dataItems.add(table3);
    dataItems.add(table4);



    return ModelUtils.toCollectionModel(dataItems);

    }
}
