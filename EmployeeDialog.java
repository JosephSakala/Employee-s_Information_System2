import javax.swing.*;//needed for JOptionPane

class Employee1{
    //instance variables
    private String name;
    private String employeeID;
    private double salary;

    //this is a constructor
    public Employee1(String name, String employeeID,double salary){
        this.employeeID= employeeID;
        this.name = name;
        this.salary = salary;
    }

    //mutatas
    public void setName(String name){
        this.name = name;

    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    //Accessors
    public String getName(){
        return name;
    }
    public String getEmployeeID(){
        return employeeID;
    }
    public double getSalary(){
        return salary;
    }

}





public class EmployeeDialog {

    public static void main(String []args){

        Employee1 UserInput = new Employee1(null, null, 0.0);

        String name = JOptionPane.showInputDialog(null, "Enter employye's name","eg Joseph Sakala");
        UserInput.setName(name);
        String ID = JOptionPane.showInputDialog(null,"Enter employee's ID number");
        UserInput.setEmployeeID(ID);
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter employee's salary"));
        UserInput.setSalary(salary);

        JOptionPane.showMessageDialog(null, "Name:"+UserInput.getName()+"\nID:"+UserInput.getEmployeeID()+"\nSalary:ZMK"+UserInput.getSalary());
        //JOptionPane.showMessageDialog(null, "ID:"+UserInput.getEmployeeID());


    }
    
}
