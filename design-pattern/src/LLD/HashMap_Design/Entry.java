package LLD.HashMap_Design;

public class Entry<K,V> {
    K key;
    V value;
    Entry<K,V> next;
    public Entry(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }
    public V getValue() {
        return this.value;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public void setValue(V value) {
        this.value = value;
    }

}
