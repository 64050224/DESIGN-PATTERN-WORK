public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Elon", "CEO", 69420);

        Employee headProduction = new Employee("Ellie", "Head Production", 42069);
        ceo.addUnderEmp(headProduction);
        Employee gygy1 = new Employee("Somchai", "Production", 9999);
        Employee gygy2 = new Employee("Sombun", "Production", 8888);
        headProduction.addUnderEmp(gygy1);
        headProduction.addUnderEmp(gygy2);

        Employee headMarketing = new Employee("Elec", "Head Marketing", 42069);
        ceo.addUnderEmp(headMarketing);
        Employee gygy3 = new Employee("Somying", "Marketing", 9999);
        Employee gygy4 = new Employee("Somsri", "Marketing", 8888);
        headMarketing.addUnderEmp(gygy3);
        headMarketing.addUnderEmp(gygy4);

        printAllEmployee(ceo);
    }
    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo.printEmpAndUnder());
    }
}
