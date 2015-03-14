package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/12/15.
 */
public class drawRockets {
    public static void rocket(int size) {


        // This code draws the lines on the rocket
        String rocketline = "+";
        for (int i = 0; i <= size; i++){
            rocketline = rocketline + "*=";
        }
        rocketline = rocketline + "+";

        // This code draws the cones
        String cone = "/* *\\";
        String coneLine;
        String spaces = "";
        for (int i = 0; i < size; i++) {

            for (int j = size; j > 0; j--) { //this creates the right number of spaces before the cone
                spaces = spaces + " ";
                coneLine = spaces + cone + "\n";
            }

        }



        // This code draws the first body of the rocket

        // This code draws the second body the rocket

    }
    public static void main(String[] args){
        rocket(7);


    }
}
