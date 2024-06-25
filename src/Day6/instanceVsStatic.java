package Day6;

public class instanceVsStatic {
    // Static member
    static int staticVar = 0;
    
    // Instance member
    int instanceVar = 0;
    
    public instanceVsStatic() {
    	staticVar++;
    	instanceVar++;
    }
    
    public static void main(String[] args) {
    	instanceVsStatic obj1 = new instanceVsStatic();
    	instanceVsStatic obj2 = new instanceVsStatic();
        
        System.out.println("Static Count: " + instanceVsStatic.staticVar); //static variable count
        System.out.println("Instance Count obj1: " + obj1.instanceVar); // instance variable count
        System.out.println("Instance Count obj2: " + obj2.instanceVar); // instance variable count
    }
}
