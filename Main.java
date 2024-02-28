import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //set all 100 doors to closed state
        boolean[] doors = new boolean[100];

        //Print all doors before code runs
        System.out.println("The current state of the doors are:");
        for(boolean i : doors){
            System.out.print(i + " ");
        }
        System.out.println("\n- - - - - - - - - - - - - - - - - - -");

        for (int x = 0; x < doors.length; x++) {
            for (int i = x; i < 100; i += x + 1) {
                doors[i] = !doors[i];
            }
        }

        System.out.println("The final state of the doors are:");
        for(boolean i : doors){
            System.out.print(i + " ");
        }

        System.out.println("\nThe open doors are:");
        for(int x = 0; x < doors.length; x++){
            if(doors[x]){
                System.out.print((x + 1) + " ");
            }
        }

    }
}