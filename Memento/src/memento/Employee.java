package memento;

public class Employee {
	public int id;
    public String name;
    public float price;
    public String department;
    public String project;



    public Employee(int id, String name,float price,String department,String project) {
        super();
        this.id = id;
        this.name = name;
        this.price=price;
        this.department=department;
        this.project=project;

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public float getPrice(){

        return price;
    }
    public void setPrice(float price){

        this.price=price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public String getProject() {

        return project;
    }

    public void setProject(String project) {

        this.project = project;
    }

    public MementoEmployee createMemento() {

        return new MementoEmployee(this);
    }

    public void restoreToMemento(MementoEmployee memento) {
        this.id = memento.getId();
        this.name = memento.getName();
        this.price= memento.getPrice();
        this.department=memento.getDepartment();
        this.project= memento.getProject();
    }

    public void printEmp(){
        String string1 = "ID= "+this.id+ " ; Name = "+this.name+ " Price= "+this.price+ " Department= "+this.department+" Project= "+this.project;
        System.out.println(string1);
    }

}
