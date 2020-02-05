public class Elevator {

    private int current;
    private String name;
    final static int MaxFloor= 10;
    final static int MinFloor= 1;
    final static int exit= 1001;
    
//    public Elevator(String name, int current) {
//        Elevator.name = name;
//        this.current = current;
//    }

    public String toString() {
        return this.current + " " + this.name;
    }

    public void setCurrent(int current){
        this.current= current;
    }
    public int getCurrent(){
        return this.current;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void GoUp(int choice){
        int c= current + 1;
        for(int i=c;i<=choice; i++)
        {
            System.out.println( "pling … at floor " + i);
        }

        //System.out.println( "\nYou arrived to:" + choice + "th floor\nHave a nice day");
        current = choice;
    }


    public void GoDown(int choice){

        int c= current - 1;
        for(int i=c;i>=choice; i--)
        {
            System.out.println( "pling … at floor " + i);
        }
        //System.out.println("\nYou arrived to:" + choice + "th floor\nHave a nice day");
        current = choice;
    }

//    @Override
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
}
