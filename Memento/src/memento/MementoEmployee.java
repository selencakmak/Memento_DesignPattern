package memento;

public class MementoEmployee {

	int id;
    String name;
    float price;
    String department;
    String project;

    public MementoEmployee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.price=employee.price;
        this.department=employee.department;
        this.project=employee.project;
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

    public String getDepartment()
    {
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
}
