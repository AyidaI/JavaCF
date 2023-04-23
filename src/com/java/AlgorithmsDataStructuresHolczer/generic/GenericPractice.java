package com.java.AlgorithmsDataStructuresHolczer.generic;

class Store<T>{

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

        }
        class Hashtable<K, V>{
        private V value;
        private K key;

        public Hashtable(K key, V value){
            this.key=key;
            this.value=value;
        }

            @Override
            public String toString() {
                return "Hashtable{" +
                        "value=" + value +
                        ", key=" + key +
                        '}';
            }
        }

    public class GenericPractice {

    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>("Hello", 23);
        System.out.println(hashtable);



    }
}
