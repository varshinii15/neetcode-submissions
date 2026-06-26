class LRUCache {

    class Node{
        
        int key,val;
        Node prev;
        Node next;
        Node(int key,int val){
            
            this.key=key;
            this.val=val;
            prev=null;
            next=null;
        }
    }

    int cap;
    HashMap<Integer,Node> h;
    Node head,tail;

    public LRUCache(int capacity) {
        cap=capacity;
        h=new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        
        if(h.containsKey(key)){
            Node n=h.get(key);
            deleteNode(n);
            h.remove(key);
            addNode(n);
            h.put(key,n);
            return n.val;

        }

        return -1;
    }
    
    public void put(int key, int value) {

        if (h.containsKey(key)) {
            Node n = h.get(key);
            deleteNode(n);
            h.remove(key);
        }

        if (h.size() == cap) {
            Node lru = tail.prev;
            deleteNode(lru);
            h.remove(lru.key);
        }

        Node n = new Node(key, value);
        addNode(n);
        h.put(key, n);
    }

        
    


    public void addNode(Node n){

        Node temp = head.next;

        head.next = n;
        n.prev = head;

        n.next = temp;
        temp.prev = n;

    }

    public void deleteNode(Node n){
        Node pre=n.prev;
        Node nex=n.next;

        pre.next=nex;
        nex.prev=pre;
    }
}
