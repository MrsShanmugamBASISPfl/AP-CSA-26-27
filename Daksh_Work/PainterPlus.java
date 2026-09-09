public class PainterPlus{

    public void pickUp (int steps , boolean turnRight , int currentLocation) {
            int newLocation = move(currentLocation, steps);
            if (turnRight == true){
                System.out.println("New Location = " + newLocation + " and turned right.");
            } else {
                System.out.println("Wrong Direction");
            }
    
    }

    private int move(int currentLocation, int steps){
        return currentLocation + steps;
    }
}