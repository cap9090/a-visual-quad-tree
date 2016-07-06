
package visualQuadTree;
import java.util.Scanner;
/**
 *
 * @author Christian Prajzner
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many nodes would you like your quadtree to have? Not including the root");
        new QuadTree(in.nextInt());
    }
    
}
