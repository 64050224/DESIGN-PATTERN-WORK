import java.util.ArrayList;

public class Employee {
    private String name;
    private String position;
    private int salary;
    private ArrayList<Employee> underEmp;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String dept) {
        this.position = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void addUnderEmp(Employee emp){
        if(underEmp == null){
            underEmp = new ArrayList<Employee>();
        }
        underEmp.add(emp);
    }public void removeUnderEmp(Employee emp){
        underEmp.remove(emp);
    }
    public ArrayList<Employee> getUnderEmployees(){
        return underEmp;
    }
    public String toString() {
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }

    public String printEmpAndUnder(){
        return generateText("");
    }public String generateText(String preString){
        StringBuffer sb = new StringBuffer();
        sb.append(preString+toString());
        if(underEmp == null){
            return preString+toString()+"\n";
        }else{
            sb.append("\n");
            for (Employee employee : underEmp) {
                sb.append(employee.generateText(preString+"L\t"));
            }
        }
        return sb.toString();
    }
}