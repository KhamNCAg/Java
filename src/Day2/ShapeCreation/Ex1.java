package Day2.ShapeCreation;

public class Ex1 {

	public static void main(String[] args) {
//		ShapeA
		System.out.println("(A)");
		createBackward(5, false, false);
		System.out.println();

//		ShapeB
		System.out.println("(B)");
		createTriangle(8,false);
		System.out.println();

//		ShapeC
		System.out.println("(C)");
		createBackward(5, false, false);
		createForward(5);
		System.out.println();
		
//		ShapeD
		System.out.println("(D)");
		createBackward(5,true, false);
		System.out.println();

//		ShapeE
		System.out.println("(E)");
		createBackward(5,true, true);
		System.out.println();
		
//		ShapeF
		System.out.println("(F)");
		createTriangle(8,true);
		System.out.println();
	}
	
	public static void createBackward(int n, boolean isNum, boolean isVertical) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
            	String tmpVar = isVertical? ""+j : ""+i ;
            	tmpVar = isNum ? ""+tmpVar : "*" ;
            	System.out.print(tmpVar);
            }
            System.out.println();
        }
	}
	
	public static void createForward(int n) {
		for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            System.out.println();
        }
	}
	
	public static void createTriangle(int n, boolean isNum) {
   
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
            	String tmpVar = isNum? ""+i : "*" ;
            	tmpVar = j<=i? tmpVar+" " : " " ;
            	System.out.print(tmpVar);
            }
            System.out.println();
        }

	}

}
