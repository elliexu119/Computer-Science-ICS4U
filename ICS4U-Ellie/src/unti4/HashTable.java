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
public class HashTable implements HashTableInterface{
/**
     * @return Returns the number of keys in this hashtable.
     */
    public int size(){
        
        return -1;
    }
    
    /**
     * @return Returns the capacity of this hash table.
     */
    public int capacity(){
        
        return -1;
    }
    
    /**
     * @return The load factor of the hashtable.
     */
    public double loadFactor(){
        
        return -1;
    }
    
    /**
     * Clears this hashtable so that it contains no keys.
     */
    public void makeEmpty(){
        
        
    }
    
    /**
     * Tests if this hashtable maps no keys to values.
     */
    public boolean isEmpty(){
        
        return false;
    }
    
    /**
     * Increases the capacity of and internally reorganizes this hashtable, in 
     * order to accommodate and access its entries more efficiently.
     */
    public void rehash(){
        
    }
    
    /**
     * Returns the value to which the specified key is mapped, or null if this 
     * map contains no mapping for the key.
     * @param key
     * @return
     */
    public Student get( int key ){
        
    }
    
    /**
     *
     * @param key
     * @param value
     */
    public void put( int key, Student value){
        
    }
    
    /**
     *
     * @param value
     * @return
     */
    public boolean contains( Student value ){
        
        return false;
    }
    
    /**
     *
     * @param key
     * @return
     */
    public boolean containsKey( int key ){
        
        return false;
    }
    
    /**
     *
     * @param key
     * @return
     */
    public int hash( int key ){
        
    }    
    
}
