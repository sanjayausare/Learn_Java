public class PoolPuzzle {
    public static void main(String [] args) {
        int x = 0;
        while ( x < 1 ) {
        System.out.print("a");
        if ( x < 1 ) {
        System.out.print(" ");
        x += 1;
        }
        x += 2;
        if ( x>1 ) {
       
        System.out.println("noise");
       
        x -= 2;

        }
        if ( x == 1 ) {
        System.out.println("annoys");
        }
        if ( x>0 ) {
        System.out.print("an");
        }
        System.out.print(" ");
        System.out.print("oyster");
        }
        }
}
