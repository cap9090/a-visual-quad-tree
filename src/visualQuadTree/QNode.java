
package visualQuadTree;
import qtvisualizer.QuadTreeNode;

/**
 *
 * @author Christian Prajzner
 */
class QNode implements QuadTreeNode{
        
        double data;
        QNode[] children = new QNode[4]; //auto fill with nulls
        
        
        QNode (double data){
            this.data = data;
        }
        
        
        @Override
        public QuadTreeNode[] getChildren(){
            QuadTreeNode[] children = {this.children[0], this.children[1], this.children[2], this.children[3]};
            return children;
        }
    }
