package Hello.milestone_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList;                //Employee class

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    // to display all the fields
    public void display(){
        int i=1;
        for(Employee employee:this.employeeList){
            System.out.println("Employee"+i+" ::: id: "+employee.getId()+" name: "+employee.getName()+" purchaseAmount: "+employee.getpurchaseAmount()+" age: "+employee.getAge());
            i++;
        }
    }
    //comparator
    public void sort(){
        Collections.sort(this.employeeList,new Comparator<Employee>() { 
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });
    }
   // to update the field using Id
    public boolean update(int id, int purchaseAmount) {
        boolean flag=false;
        for(Employee employee:this.employeeList){
            if(employee.getId()==id){
                flag=true;
                employee.setpurchaseAmount(purchaseAmount);
            }
        }
        return flag;
    }
}
