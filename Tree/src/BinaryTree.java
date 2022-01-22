public class BinaryTree<E> {
    private class Node<E> {
        private E data;
        private Node left, right;

        public Node(E data) {
            this.data = data;
            this.left = this.right = null;
        }

        public Node(E data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root = null;

    public BinaryTree(Comparable<E> root) {
        this.root = new Node(root);
    }

    private Node insert(Node r, Comparable<E> data) {
        if (r == null) {
            r = new Node(data);
            return r;
        }
        if (data.compareTo((E) r.data) < 0) {
            r.left = insert(r.left, data);
            return r;
        } else if (data.compareTo((E) r.data) > 0) {
            r.right = insert(r.right, data);
            return r;
        }
        System.out.println("Erorr, Data " + data + " Already In The Tree");
        return r;
    }

    public void inserBTS(Comparable<E> data) {
        this.insert(root, data);
    }

    private void printBTS(Node r) {
        if (r != null) {
            System.out.print(r.data + ", ");
            printBTS(r.left);
            printBTS(r.right);
        }
    }

    private boolean search(Node r, Comparable<E> e) {
        if (r == null) {
            System.out.println("Tree Null");
            return false;
        }
        if (e.equals(r.data) == true) {
            return true;
        }
        if (e.compareTo((E) r.data) > 0) {
            search(r.right, e);
        } else if (e.compareTo((E) r.data) < 0) {
            search(r.left, e);
        }
        return false;
    }
    public void search(Comparable<E> x) {
        if(search(root,x) == true){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public void print() {
        printBTS(root);
    }
}