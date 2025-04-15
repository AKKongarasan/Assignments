package arrays;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [][][] college = new String[5][6][6];
		
		//Sem 1 Subjects
		college [0][0][0] = "MathsI";
		college [0][0][1] = "Physics";
		college [0][0][2] = "Chemistry";
		college [0][0][3] = "CP";
		college [0][0][4] = "ED";
		college [0][0][5] = "BEE";
		
		//Sem 1 marks
		college [0][1][0] = "Pass(78)";
		college [0][1][1] = "Pass(85)";
		college [0][1][2] = "Pass(21)";
		college [0][1][3] = "Pass(74)";
		college [0][1][4] = "Pass(88)";
		college [0][1][5] = "Pass(79)";
		
		//Sem 2 Subjects
		college [1][0][0] = "MathsII";
		college [1][0][1] = "Mechanics";
		college [1][0][2] = "Environmental Scl";
		college [1][0][3] = "Basic Electronice";
		college [1][0][4] = "Eng physics";
		college [1][0][5] = "Eng Graphics";
		
		//Sem 2 Marks
		college [1][1][0] = "Pass(82)";
		college [1][1][1] = "Pass(77)";
		college [1][1][2] = "Pass(93)";
		college [1][1][3] = "Pass(19)";
		college [1][1][4] = "Pass(24)";
		college [1][1][5] = "Pass(90)";
		
		//Sem 3 subject
		college [2][0][0] = "Data structurre";
		college [2][0][1] = "Discrete maths";
		college [2][0][2] = "Digital electronice";
		college [2][0][3] = "Operating system";
		college [2][0][4] = "Signals and systems";
		college [2][0][5] = "Object oriented programs";
		
		//Sem 3 Marks
		college [2][1][0] = "Pass(88)";
		college [2][1][1] = "Pass(81)";
		college [2][1][2] = "Pass(76)";
		college [2][1][3] = "Pass(32)";
		college [2][1][4] = "Pass(85)";
		college [2][1][5] = "Pass(78)";
		
		
		//Sem 5 subjects
		college [4][0][0] = "Probabilityy&stats";
		college [4][0][1] = "machine learning";
		college [4][0][2] = "compiler design";
		college [4][0][3] = "Theory of computation";
		college [4][0][4] = "Embedded system";
		college [4][0][5] = "Computer graphics";
		
		
		
		
		//Sem 5 Marks
		college [4][1][0] = "Pass(86)";
		college [4][1][1] = "Pass(88)";
		college [4][1][2] = "Pass(84)";
		college [4][1][3] = "Pass(95)";
		college [4][1][4] = "Pass(73)";
		college [4][1][5] = "Pass(90)";
		
		
		
	
		System.out.println("Semester 3, Subject 4:"+college [2][0][3]);
		System.out.println("Semester 3, Subject 5:"+college[2][0][4]);
		System.out.println("Marks of semester 4 subject 3:"+ college[4][1][2] );
		System.out.println("Marks of semester 4 subject 6:"+ college[4][1][5] );
		
		
		

	}

}
