
package visualQuadTree;
import qtvisualizer.QuadTreeViz;

/**
 *
 * @author Christian Prajzner
 */

class QuadTree   {
    
    QNode root;
    
    QuadTree(int numOfNodes){
        root = new QNode(0);
        for (int i = 1; i <= numOfNodes; i++)
            this.insertAtRandomPosition((double)i);
        new QuadTreeViz(this.root);
        System.out.println("The sum  is "  + (int)this.sum());
    }
       
    
    void insertAtRandomPosition(double v){
        QNode current = root;
        //boolean help = true;
        do {
            int i = (int)(4 * (Math.random()));
            if(current.children[i] == null){
                current.children[i] = new QNode(v);
                //help = false;
                break;
            }
            else current = current.children[i];
        } while(true);
        
    }
    
    /*wrapper method */
    double sum(){
        if(root == null)
            return 0;
        else return root.data + sum(root.children[0]) + sum(root.children[1]) + sum(root.children[2]) + sum(root.children[3]);            
        
    }
    
    private double sum(QNode child){
        if(child == null)
            return 0;
        else return child.data + sum(child.children[0]) + sum(child.children[1]) + sum(child.children[2]) + sum(child.children[3]);
    }

}
