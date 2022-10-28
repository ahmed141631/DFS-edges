import alist.*;
public class Main {

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.addNode(new Node('a'));
        graph.addNode(new Node('b'));
        graph.addNode(new Node('c'));
        graph.addNode(new Node('d'));
        graph.addNode(new Node('e'));
        graph.addNode(new Node('f'));
        graph.addNode(new Node('g'));
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 0);
        graph.addEdge(2, 6);
        graph.addEdge(3, 5);
        graph.addEdge(4, 2);
        graph.addEdge(4, 6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 6);
        
        DFS.traversal(graph);
        
        

    }
}