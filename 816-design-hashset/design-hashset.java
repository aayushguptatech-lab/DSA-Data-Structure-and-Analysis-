class MyHashSet {
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node head;
    public MyHashSet() {
        head = null;
    }
    
    public void add(int key) {
        if(head == null){
            Node newnode = new Node(key);
            head = newnode;
            return;
        }
        if(contains(key) == true){
            return;
        }
        if(contains(key) == false){
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            Node newNode = new Node(key);
            temp.next = newNode;
        }
        
    }
    
    public void remove(int key) {
        if(head == null){
            return;
        }
        if(head.val == key){
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            if(temp.next.val == key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
    
    public boolean contains(int key) {
        if(head == null){
            return false;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.val == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */