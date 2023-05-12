import java.util.Scanner;

public class ShipgameV2{
    public static void main(String[] args) {
        //TODO change defaultParameter to user's input parameter.
        int defaultParameter = 9;
        int[][] userCoordinates = new int[3][2];
        Scanner scanner = new Scanner(System.in);

        //User's hiding spot
        System.out.print("Input your hiding spot (Row): ");
        int hideRow = scanner.nextInt();
        System.out.print("Input your hiding spot (Column): ");
        int hideColumn = scanner.nextInt();
        clearScreen();

        //User's target
        for(int i = 0; i < userCoordinates.length; i++){
            System.out.print("Input your target spot (Row): ");        
            int targetRow = scanner.nextInt();
            System.out.print("Input your target spot (column): ");
            int targetColumn = scanner.nextInt();

            //processing user's coordinate and map drawing.
            for (int x = 0; x < defaultParameter; x++){
                for( int y = 0; y <= defaultParameter; y++ ){
                    
                    if (hideColumn==targetColumn && hideRow==targetRow && x == hideRow && y == targetColumn){
                        System.out.print("o ");
                    } else if (targetColumn == y && targetRow == x && (hideColumn != targetColumn || hideRow != hideColumn) ){
                        System.out.print("x ");
                    } else if (x == 0 || y == defaultParameter || y == 0 || x == defaultParameter ){
                        System.out.print("# ");
                    } else{
                        System.out.print("~ ");
                    }
                }
            // Create noew line
            System.out.println("");
            }
            // Draw the last line from the parameter
            // TODO Draw last line according to the variable parameter 
            System.out.println("# # # # # # # # # #");
        }
        scanner.close();
    }
        // Clear user hiding in the terminal
        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

}

//TODO save prevous attemps
//TODO user input hiding spot as (password?).
//TODO instead of "#" make it into number.