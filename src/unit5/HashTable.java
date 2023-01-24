/*
 * Ellie
 * June 2018
 * Creates the Hashtable object
 */
package unit5;

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
    
    public HashTable(int size){
        for (int i = 2; i < size; i++) {
            if (size % i == 0){ 
                size++;
                i = 2; 
            }
        }
        s = new Student [size]; 
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
        return size() / (double) capacity();
    }

    /**
     * Clears this hashtable so that it contains no keys.
     */
    public void makeEmpty() {
        s = new Student[s.length];
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
        System.out.println("REHASH");
        int newSize = (int) Math.ceil(size() / 0.25);
        for (int i = 2; i < newSize; i++) {
            if (newSize % i == 0) {
                newSize++;
                i = 2;
            }
        }

        Student temp[] = s;
        s = new Student[newSize];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                put(temp[i].getkey(), temp[i]);
            }
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key.
     *
     * @param key
     * @return
     */
    public Student get(int key) {
        if (s[hash(key)] != null) {
            for (int i = hash(key); s[i].getkey() != key; i++) {
                if (i == s.length - 1) {
                    i = 0;
                }
                if (i + 1 == hash(key)) {
                    return null;
                }
            }
            return s[hash(key)];
        } else {
            return null;
        }
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
                    break;
                }
                if (i == s.length - 1) {
                    i = 0;
                }
            }
        }
        if (loadFactor() > .75) {
            rehash();
        }
    }

    @Override
    public String toString() {
        String value = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) {
                value += "null \n";
            } else {
                value += "[" + i + "] first name: " + s[i].getFirst() + " last name: " + s[i].getLast() + " phone: " + s[i].getPhone()
                        + " key: " + s[i].getkey() + " hash: " + hash(s[i].getkey()) + "\n";
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
            if (s[i] != null) {
                if (s[i].getkey() == key) {
                    return true;
                }
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
        return key % capacity();
    }

}
