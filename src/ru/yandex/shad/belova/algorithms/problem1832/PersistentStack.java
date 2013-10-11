package ru.yandex.shad.belova.algorithms.problem1832;

class PersistentStack {
    private Node[] nodes;
    private int head = 0;
    class Node {
        final int prevNode;
        final int mass;
        public Node(int prevNode, int mass){
            this.prevNode = prevNode;
            this.mass = mass;
        }
    }
    public PersistentStack(int size){
        this.nodes = new Node[size+1];
        this.nodes[head++] = new Node(0, 0);
    }
    public void push(int whichClone, int mass){
        this.nodes[head++] = new Node(whichClone, mass + this.nodes[whichClone].mass);
    }
    public void pop(int whichClone){
        Node node = this.nodes[whichClone];
        this.nodes[this.head++] = this.nodes[node.prevNode];
    }
    public long totalWeight(){
        long totalWeight = 0;
        for(Node node: this.nodes){
            totalWeight += node.mass;
        }
        return totalWeight;
    }

}
