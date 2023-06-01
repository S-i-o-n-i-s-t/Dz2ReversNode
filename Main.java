public class Main {

    public static void main(String[] args) {
        Main sort1 = new Main();
        sort1.addNod(2);
        sort1.addNod(4);
        sort1.addNod(6);
        sort1.addNod(8);
        sort1.print();
        System.out.println(" ");
        sort1.reversNod(sort1.size());
        System.out.println("________________________");
        // Тот же метод на двухзвязной сортировке
        Main sort2 = new Main();
        sort2.add(2);
        sort2.add(4);
        sort2.add(6);
        sort2.add(8);
        sort2.print();
        System.out.println(" ");
        sort2.reversNod(sort1.size());
    }

    Node heat;
    Node teil;
    // Дз по реверсу массива
    public void reversNod(int size){
        Node prev = null;
        Node node = heat;
        while (node != null){
            Node tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
        }
        while (prev != null){
            System.out.println(prev.item);
            prev = prev.next;
        }


    }
    public int size(){
        int size = 0;
        Node tmp = heat;
        if (tmp == null){
            return 0;
        }
        while (tmp != null){
            tmp = tmp.next;
            size++;
        }
        return size;
    }

    public void addNod(int value){
        Node node = new Node();
        node.item = value;
        if (heat != null){
            node.next = heat;
        }heat = node;
    }

    public void remove(){
        heat = heat.next;
    }

    private void print(){
        Node node = heat;
        while (node != null){
            System.out.println(node.item);
            node = node.next;
        }
    }

    public void find(){}

    public void add(int value){
        Node node = new Node();
        node.item = value;
        if (heat == null){
            heat = node;
            teil = node;
        }
        else {
            teil.next = node;
            node.prevy = teil;
            teil = node;
        }
    }
}
class Node{
    public int item;

    // @Override
    // public String toString() {
    //     return "Node" + item;
    // }

    public Node next;
    public Node prevy;

}