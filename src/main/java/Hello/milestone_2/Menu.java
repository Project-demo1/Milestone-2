package Hello.milestone_2;
import java.util.*;
public class Menu {
	    public static void main(String[] args) {
	    	//adding values to ArrayList
	        List<Employee> employeeList=new ArrayList<>();
	        employeeList.add(new Employee(1,"Shefali",20000,17));
	        employeeList.add(new Employee(2,"Bunny",40000,35));
	        employeeList.add(new Employee(3,"Mayank",60000,20));
	        employeeList.add(new Employee(4,"Dimple",40000,24));
	        employeeList.add(new Employee(5,"Rama",70000,29));
	        employeeList.add(new Employee(6,"Rajesh",180000,26));
	        employeeList.add(new Employee(7,"Giresh",30000,22));
	        employeeList.add(new Employee(8,"Heena",20000,28));
	        employeeList.add(new Employee(9,"Ishita",50000,21));
	        employeeList.add(new Employee(10,"Shilpa",120000,30));
	        EmployeeList employeeList1 = new EmployeeList(employeeList);
	        System.out.println("Enter key");
	        Scanner s=new Scanner(System.in);
	        int key=s.nextInt();
	         //switch case
	        switch (key){
	            case 1: //Press 1 will display all the record
	                
	                employeeList1.sort();
	                employeeList1.display();
	                break;
	            case 2: //Press 2 will update the employee if Id is present in record else it will pass the message inavlid id
	                System.out.println("Enter employee id");
	                int id = s.nextInt();
	                System.out.println("Enter employee updated purchaseAmount");
	                int purchaseAmount = s.nextInt();
	                if(employeeList1.update(id,purchaseAmount)){
	                    employeeList1.display();
	                }
	                else{
	                    System.out.println("Invalid id provided");
	                    
	                }
	                break;
	            case 3:
	                break;
	        }
	    }
	}

