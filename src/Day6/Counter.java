package Day6;

public class Counter {
	
    static int count = 0;
    
    private void incrementCount() {
        count++;
    }
    
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        
        counter1.incrementCount();
        counter2.incrementCount();
        
        System.out.println("Static Count: " + Counter.count); // Output: 2
    }
}