import java.util.Scanner; 

public class Main {

    private static Scanner scanner= new Scanner (System.in);
    public static void main(String[] args) {

        // ALHKBR
        Elevator elevator= new Elevator();
        elevator.setName("Hiss");
        elevator.setCurrent(3);

        System.out.println("LHMDLH. This Elevator is called: " + elevator.getName() + ", the current floor is: " + elevator.getCurrent() + " The building consists of 1 to 10 floors.");
        System.out.println("**Press: 1001 to exit the program.");
        //noinspection InfiniteLoopStatement
        while (true){

            System.out.println( "\nEnter wished floor");
            int choice= scanner.nextInt();

            if (choice == Elevator.exit) {
            	scanner.close();
            	System.exit(0);
            	break;
            	
            }
            
            else if(choice < Elevator.MinFloor || choice > Elevator.MaxFloor){
                System.out.println("Sorry, The building consists of ten floors, from 1 to 10.");
            }
            else if(choice == elevator.getCurrent()) {
                    System.out.println("we are already in: "+ choice + "th floor");
                }
                else if (choice > elevator.getCurrent()){
                    elevator.GoUp(choice);
                    System.out.println("\nYou arrived to: " + choice + "th floor\nHave nice day");
                }
                else if (choice < elevator.getCurrent()){
                    elevator.GoDown(choice);
                    System.out.println("\nYou arrived to: " + choice + "th floor\nHave nice day");

                }
            }
        }
    

    }

