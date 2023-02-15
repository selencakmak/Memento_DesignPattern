package memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<MementoEmployee> mementoEmployeeList = new ArrayList<MementoEmployee>();

    public void add(MementoEmployee emp){

        mementoEmployeeList.add(emp);
    }

    public MementoEmployee get(int index){

        return mementoEmployeeList.get(index);
    }
}
