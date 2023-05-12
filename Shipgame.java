import java.util.Scanner;

public class Shipgame {
    public static void main(String[] args){
        System.out.print("enter the board parameter: ");

        Scanner scanner = new Scanner(System.in);
        int parameter = scanner.nextInt();
        
        if (parameter > 9){
            System.out.println("mate too big");
        } else {
            Generator(parameter);
        }
        
        scanner.close();
    }
    private static void Generator(int parameter){

        for ( int column = 0 ; column <= parameter; column++ ){
            System.out.print(column + " ");
        }
        // I think this is where the detecter should be
        // don't know how to print without broke this
        // maybe this is a bad example of a board.
        System.out.println("");
        for ( int row = 1 ; row <= parameter; row++ ){
            System.out.print(row + " ");
            for ( int y = 0 ; y < parameter; y++ ){
                System.out.print("~ ");
            }
            
            System.out.println("");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your hiding spot(column): ");
        int hideRow = scanner.nextInt();
        System.out.print("Enter your hiding spot(row): ");
        int hideColumn = scanner.nextInt();

        System.out.print("Enter your target(column): ");
        int targetRow = scanner.nextInt();
        System.out.print("Enter your hiding spot(row): ");
        int targetColumn = scanner.nextInt();

        if (hideColumn==targetColumn||hideRow==targetRow){
            System.out.println("o");
        }else{
            System.out.println("x");
        }
        scanner.close();
    }

}

// Easy:to do make a detecter if target = hide then o else x
// Hard: to print it