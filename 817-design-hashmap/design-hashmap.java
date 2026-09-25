class MyHashMap {
    class Node{
        int key;
        int val;
        Node next;

        Node(int key, int val){
            this.key = key;
            this.val = val;
            next = null;
        }
    }
    Node head;
    public MyHashMap() {
        head = null;
    }
    
    public void put(int key, int value) {

        // Empty list
        if(head == null) {
            Node newnode = new Node(key, value);
            head = newnode;
            return;
        }

        // Check if key already exists
        Node temp = head;

        while(temp != null) {

            if(temp.key == key) {
                temp.val = value;
                return;
            }

            temp = temp.next;
        }

        // Key doesn't exist, so add new node
        temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }

        Node newnode = new Node(key, value);
        temp.next = newnode;
    }

    public int get(int key) {
        if(head == null){
            return -1;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.key == key){
                return temp.val;
            }
            temp = temp.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        if(head == null){
            return;
        }
        if(head.key == key){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.key == key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        return;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */