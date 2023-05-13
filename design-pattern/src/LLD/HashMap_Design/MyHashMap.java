package LLD.HashMap_Design;


public class MyHashMap<K,V> {    

    private static final double LOAD_FACTOR = 0.75;
    private static int INITIAL_SIZE = 16;
    private static int size = 0;
    public static MyHashMap<Integer,String> map;
    Entry<K,V>[] bucketList;
    public MyHashMap() {
        bucketList = new Entry[INITIAL_SIZE];
    }
    public MyHashMap(int size) {
        bucketList = new Entry[size];
    }
    public int getSize() {
        return size;
    }
    public void put(K key, V value) {
        if( bucketList.length * LOAD_FACTOR == map.getSize()) {
            // already reached the max capacity
            // re-arrange the map
            System.out.println("re-arranging map...");
            Entry<K,V>[] newBucket = new Entry[size*size];
            for(int i = 0; i < bucketList.length; i++) {
                Entry<K,V> node = bucketList[i];
                if(node != null) {
                    while(node != null) {
                        int hashCode = node.getKey().hashCode() % newBucket.length;
                        newBucket[hashCode] = node;
                        node = node.next;
                    }
                }
            }
            bucketList = newBucket;
        }
        int hashCode = key.hashCode() % bucketList.length;
        Entry<K,V> node = bucketList[hashCode];
        size++;
        if(node == null) {
            bucketList[hashCode] = new Entry<K,V>(key, value);
        }else{
            Entry<K,V> prev_node = null;
            while(node != null) {
                if(node.getKey() != key){
                    prev_node = node;
                    node = node.next;
                }else{
                    node.setValue(value);
                    return;
                }    
            }
            prev_node.next = new Entry<K,V>(key, value);
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % bucketList.length;
        Entry<K,V> node = bucketList[hashCode];
        while(node != null) {
            if(node.getKey() == key) {
                System.out.println(node.getValue());
                return node.getValue();
            }
            node = node.next;
        }
        System.out.println("null");
        return null;
    }    
    public static void main(String[] args) {

        map = new MyHashMap<>();
        map.put(1,"Dhilip");
        map.put(2,"Kumar");
        map.put(3,"java");
        map.put(4,"developer");
        map.put(5,"Dhilip");
        map.put(6,"Kumar");
        map.put(7,"java");
        map.put(8,"developer");
        map.put(9,"developer");
        map.put(10,"developer");
        map.put(11,"Dhilip");
        map.put(12,"Kumar");
        map.put(13,"java");
        map.put(14,"developer");
        map.put(15,"developer");
        map.put(16,"developer");
        map.put(17,"developer");
        map.get(17);

    }
    
}
