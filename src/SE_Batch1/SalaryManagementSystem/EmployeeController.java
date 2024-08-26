package SE_Batch1.SalaryManagementSystem;

import java.io.*;
import java.util.ArrayList;

public class EmployeeController {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static ArrayList<Employee> empAry = new ArrayList<>();

	public static void main(String[] args) {
		int type;
        String name, id, slry, tstConVar;
        
        //start of employee adding process
        try {
	        do {
	        	type = Integer.parseInt(getEmpType());
	        	
	        	if(type<4 && type>0) {
	        		System.out.print("Enter employee ID: ");
	        		id = reader.readLine();
	        		System.out.print("Enter employee name: ");
	        		name = reader.readLine();
	        		System.out.print("Enter employee basic salary: ");
	        		slry = reader.readLine();
	        		
	        		switch(type) {
	        		// FullTime
	        		case 1:
	        			if(addFullTimeEmp(id, name, slry)) {
	        				System.out.println("Successfully added full-time employee.");
	        			}
	        			break;
	        			
	        			// PartTime
	        		case 2:
	        			if(addPartTimeEmp(id, name, slry)) {
	        				System.out.println("Successfully added part-time employee.");
	        			}
	        			break;
	        			
	        			// Contract
	        		case 3:
	        			if(addContractEmp(id, name, slry)) {
	        				System.out.println("Successfully added contract employee.");	
	        			}
	        			break;
	        		}
	        	}else {
	        		System.out.println("Wrong employee type!!!");
	        	}
	        		
	        		System.out.print("Do you want to add another employee? (y/n): ");
	        		tstConVar = reader.readLine();
	        		System.out.println();
	        	} while (tstConVar.equalsIgnoreCase("Y") || tstConVar.equalsIgnoreCase("y"));
        } catch (Exception e) {
        	System.out.println("Something went wrong!!!");
        	e.printStackTrace();
        }
        //end of employee adding process
        
        //start of employee displaying process
        for (Employee emp : empAry) {
        	emp.displayDetails();
        	System.out.println("------------------------------------------------------------");
        }
        //end of employee displaying process

	}
	
	private static String getEmpType() throws IOException {
		System.out.println("Select employee type of the followings.(1, 2 or 3)");
		System.out.println("1.FullTime Employee.");
		System.out.println("2.PartTime Employee");
		System.out.println("3.Contract Employee");
		System.out.print("->");
        return reader.readLine();
	}
	
	private static boolean addFullTimeEmp(String id,String name,String slry) throws Exception {
		System.out.print("Enter employee allowance: ");
        String allowance = reader.readLine();
        System.out.print("Enter employee bonus: ");
        String bonus = reader.readLine();
        return empAry.add(new FullTimeEmployee(name, Integer.parseInt(id), Double.parseDouble(slry), Double.parseDouble(allowance), Double.parseDouble(bonus)));
	}
	
	private static boolean addPartTimeEmp(String id,String name,String slry) throws Exception {
		System.out.print("Enter employee worked hour: ");
        String workedhour = reader.readLine();
        System.out.print("Enter employee hourlyrate: ");
        String hourlyrate = reader.readLine();
        return empAry.add(new PartTimeEmployee(name, Integer.parseInt(id), Double.parseDouble(slry), Integer.parseInt(workedhour), Double.parseDouble(hourlyrate)));
	}
	
	private static boolean addContractEmp(String id,String name,String slry) throws Exception {
		System.out.print("Enter employee contract amount: ");
        String cntramnt = reader.readLine();
        System.out.print("Enter employee contract duration: ");
        String cntrduration = reader.readLine();
        return empAry.add(new ContractEmployee(name, Integer.parseInt(id), Double.parseDouble(slry), Integer.parseInt(cntrduration), Double.parseDouble(cntramnt)));
	}

}
