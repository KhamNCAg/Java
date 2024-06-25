package Day5;

public class demoClass {
    static int count = 1;
    int instanceVar = 1;

    public static void staticMethod() {
        System.out.println("Student Count: " + count++);
    }

    public void instanceMethod() {
        System.out.println("Student Instance: "+ instanceVar++);
    }

    public static void main(String[] args) {

    	demoClass obj = new demoClass();
        obj.instanceMethod();//i
        obj.staticMethod();//s
        
        System.out.println();
        
        demoClass obj1 = new demoClass();
        obj1.instanceMethod();//i
        obj1.staticMethod();//s
        
    }
}
