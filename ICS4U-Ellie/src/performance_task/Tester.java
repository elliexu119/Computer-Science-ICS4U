package performance_task;

/**
 * Open Hash Table Tester
 *
 * @version v2016.S2
 */
public class Tester {

    /**
     */
    static CSStudent studentAA1 = new CSStudent("Arielle", "A", 7111, 11);
    static CSStudent studentAA2 = new CSStudent("Ali", "A", 2221, 12);
    static CSStudent studentJB = new CSStudent("James", "B", 2332, 12);
    static CSStudent studentRD = new CSStudent("Raidi", "D", 1443, 12);
    static CSStudent studentAE = new CSStudent("Ahmad", "E", 2554, 12);
    static CSStudent studentJG = new CSStudent("Gillian", "J", 6665, 12);
    static CSStudent studentYK = new CSStudent("Yulia", "K", 7976, 12);
    static CSStudent studentRL = new CSStudent("Ryan", "L", 8387, 12);
    static CSStudent studentRM = new CSStudent("Ruiling", "M", 9098, 11);
    static CSStudent studentYM = new CSStudent("Youssef", "M", 1120, 12);
    static CSStudent studentFS = new CSStudent("Faisal", "S", 2231, 12);
    static CSStudent studentKSE = new CSStudent("Karim", "SE", 8695, 12);
    static CSStudent studentMS = new CSStudent("Matthew", "S", 3695, 12);
    static CSStudent studentCW = new CSStudent("Christiana", "W", 2691, 12);
    static CSStudent studentEX = new CSStudent("Ellie", "X", 1234, 11);
    static CSStudent studentIY = new CSStudent("Irmak", "Y", 1235, 12);

    public static void main(String[] args) {

        //linkedList();
        hashTables();
        
    }
    
    public static void hashTables(){
        OpenHashTable tab = new OpenHashTable (); 
        
        //empty case
        assert(tab.size() == 0);
        assert(tab.isEmpty() == true);
        assert(tab.capacity() == 11);
        assert(tab.containsKey(1234) == false);
        assert(tab.get(1234) == null);
        
        //put
        tab.put(studentAA1);
        tab.put(studentAA2);
        tab.put(studentJB);
        tab.put(studentRD);
        tab.put(studentAE);
        tab.put(studentJG);
        tab.put(studentYK);
        tab.put(studentRL);
        tab.put(studentRM);
        tab.put(studentYM);
        tab.put(studentFS);
        tab.put(studentKSE);
        tab.put(studentMS);
        tab.put(studentCW);
        tab.put(studentEX);
        tab.put(studentIY);
        
        System.out.println(tab.toString());
        
        //
        assert(tab.capacity() == 11);
        assert(tab.get(1234) == studentEX);
        assert(tab.size() == 16);
        assert(tab.isEmpty() == false);
        assert(tab.containsKey(1234) == true);
        System.out.println(tab.get(1234));
        
        //make empty
        tab.makeEmpty();
        assert(tab.size() == 0);
        assert(tab.isEmpty() == true);
        assert(tab.capacity() == 11);
        assert(tab.containsKey(1234) == false);
        assert(tab.get(1234) == null);
    }

    public static void linkedList() {

        LinkedListPT link = new LinkedListPT();
        //empty case
        assert(link.size() == 0);
        assert(link.isEmpty() == true);
        assert(link.get(7111) == null);
        assert(link.remove(7111) == null); 
        link.makeEmpty();
        
        //add
        link.addAtEnd(studentAA1);
        link.addAtEnd(studentAA2);
        link.addAtEnd(studentJB);
        link.addAtEnd(studentRD);
        link.addAtEnd(studentAE);
        link.addAtEnd(studentJG);
        link.addAtEnd(studentYK);
        link.addAtEnd(studentRL);
        link.addAtEnd(studentRM);
        link.addAtEnd(studentYM);
        link.addAtEnd(studentFS);
        link.addAtEnd(studentKSE);
        link.addAtEnd(studentMS);
        link.addAtEnd(studentCW);
        link.addAtEnd(studentEX);
        link.addAtEnd(studentIY);
        
        assert (link.isEmpty() == false);
        assert(link.size() == 16); 
        
        System.out.println(link.toString());
        
        //at front 
        assert(link.get(7111) == studentAA1); 
        assert(link.remove(7111) == studentAA1);
        assert(link.get(7111) == null); 
        assert(link.size() == 15); 
        
        //at middle
        assert(link.get(1120) == studentYM); 
        assert(link.remove(1120) == studentYM);
        assert(link.get(1120) == null); 
        assert(link.size() == 14); 
        
        //at end
        assert(link.get(1235) == studentIY); 
        assert(link.remove(1235) == studentIY);
        assert(link.get(1235) == null); 
        assert(link.size() == 13); 
        
        System.out.println(link.toString());
        
        //make empty
        link.makeEmpty();
        System.out.println(link.toString());
        assert (link.isEmpty() == true);
        assert(link.size() == 0);
        assert(link.isEmpty() == true);
        assert(link.get(7111) == null);
        assert(link.remove(7111) == null); 
    }

}
