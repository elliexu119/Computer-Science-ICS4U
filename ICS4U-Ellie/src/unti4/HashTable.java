/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4;

/**
 *
 * @author 1xuell
 */
public class HashTable implements HashTableInterface {

    /**
     * @return Returns the number of keys in this hashtable.
     */
    private Student s[];

    public HashTable() {
        s = new Student[53];
    }

    public int size() {
        int full = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                full++;
            }
        }
        return full;
    }

    /**
     * @return Returns the capacity of this hash table.
     */
    public int capacity() {
        return s.length;
    }

    /**
     * @return The load factor of the hashtable.
     */
    public double loadFactor() {
        return capacity() / size();
    }

    /**
     * Clears this hashtable so that it contains no keys.
     */
    public void makeEmpty() {
        s = null;
    }

    /**
     * Tests if this hashtable maps no keys to values.
     */
    public boolean isEmpty() {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Increases the capacity of and internally reorganizes this hashtable, in
     * order to accommodate and access its entries more efficiently.
     */
    public void rehash() {
        
    }

    /**
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     *
     * @param key
     * @return
     */
    public Student get(int key) {
        return s[hash(key)];
    }

    /**
     *
     * @param key
     * @param value
     */
    public void put(int key, Student value) {
        if (s[hash(key)] == null) {
            s[hash(key)] = value;
        } else {
            for (int i = hash(key); i < s.length; i++) {
                if (s[i] == null) {
                    s[i] = value;
                }
            }
        }
    }

    @Override
    public String toString() {
        String value = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                value += "null \n";
            } else {
                value += s[i].getFirst() + " " + s[i].getLast() + "\n";
            }
        }
        return value;
    }

    /**
     *
     * @param value
     * @return
     */
    public boolean contains(Student value) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param key
     * @return
     */
    public boolean containsKey(int key) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].getkey() == key) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param key
     * @return
     */
    public int hash(int key) {
        return key & capacity();
    }

}
