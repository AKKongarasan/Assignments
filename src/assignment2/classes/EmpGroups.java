package assignment2.classes;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		employees data = new employees();
		
		String[] empname = new String[3];
		int[] empid = new int[3];
		
		empname[0] = data.EmployeeName1;
		empname[1] = data.Employee2;
		empname[2] = data.Employee3;
		
		empid[0]= data.empid1;
		empid[1]= data.empid2;
		empid[2]= data.empid3;
		
		System.out.println(empname[0]+ ":" + empid[0] );
		System.out.println(empname[1]+ ":" + empid[1]);
		System.out.println(empname[2]+ ":" + empid[2] );

//		
//		System.out.print("employee name1:"+ data.EmployeeName1);
//		System.out.println(",employee ID1:"+ data.empid1);
//		
//		System.out.print("employee name2:"+ data.Employee2);
//		System.out.println(",employee ID2:"+ data.empid2);
//		
//		System.out.print("employee name3:"+ data.Employee3);
//		System.out.print(",employee ID3:"+ data.empid3);
		
		

	}

}
