package Generics.Generic_Interfaces.MultipleParameters;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class KeyValuePair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
 class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new KeyValuePair<>("One", 1);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
