package Day3;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: if there is only one disk, move it from fromRod to toRod
//    	System.out.println(n);
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }
}
