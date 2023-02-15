package memento;

public class Main {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();

        Employee employee =new Employee(10,"Selen",20000,"IT","Backend");
        employee.printEmp();
        careTaker.add(employee.createMemento());


        employee.setPrice(25000);
        employee.setDepartment("HM");



        employee.printEmp();
        careTaker.add(employee.createMemento());

        employee.restoreToMemento(careTaker.get(0));
        System.out.println("\nAfter Restore:");
        employee.printEmp();

	}

}
