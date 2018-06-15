package performance_task;

/**
 * Linked List of Students
 *
 * @version v2018.S2
 */
public class LinkedListPT {

    private NodePT head;
    private NodePT tail;

    /**
     * Constructor: Empty Linked List
     */
    public LinkedListPT() {
        this.head = null;
        this.tail = null;
    }

    /**
     * @return returns the size (# of students) in the linked list.
     */
    public int size() {
        int counter = 1;
        if (head == null && tail == null) {
            return 0;
        }

        NodePT n = head;
        for (; n.getNext() != null; n = n.getNext(), counter++) {
        }
        return counter;
    }

    /**
     * This method makes the linked list empty.
     */
    public void makeEmpty() {
        // TO DO
        head = null;
        tail = null;
    }

    /**
     * This method returns true if the linked list is empty
     *
     * @return returns true if there are no student objects in the linked list
     */
    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method adds a student object to the end of the linked list.
     *
     * @param student
     */
    public void addAtEnd(CSStudent student) {
        NodePT node = new NodePT(student);
        if (isEmpty()) {
            this.tail = node;
            this.head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    /**
     * This method will get a student object from the linked list, given the
     * student number
     *
     * @param key student number (key)
     * @return returns the student object for the given key, or null if it
     * doesn't exist.
     */
    public CSStudent get(int key) {
        NodePT value = head;
        if (head != null && head.getData().getStudentNumber() == key) {
            return head.getData();
        } else {
            for (; value != null && value.getNext() != tail.getNext(); value = value.getNext()) {
                if (value.getNext().getData().getStudentNumber() == key) {
                    return value.getNext().getData();
                }
            }
        }
        return null;
    }

    /**
     * This method will remove a student object from the linked list, given the
     * student number.
     *
     * @param key student number (key)
     * @return returns the removed student object, or null if the key is not
     * found
     */
    public CSStudent remove(int key) {
        NodePT value = head;
        CSStudent cs = null;
        boolean foundIt = false;
        if (head != null && head.getData().getStudentNumber() == key) {
            foundIt = true;
            cs = head.getData();
        } else {
            for (; value != null && value.getNext() != tail.getNext(); value = value.getNext()) {
                if (value.getNext().getData().getStudentNumber() == key) {
                    foundIt = true;
                    cs = value.getNext().getData();
                    break;
                }
            }
        }

        if (foundIt == true) {
            if (key == head.getData().getStudentNumber()) {
                if (head != null) {
                    if (head == tail) {
                        tail = null;
                    }
                    head = head.getNext();
                }
            } else if (value.getNext() == tail) {
                if (tail != null) {
                    if (head == tail) {
                        tail = null;
                        head = null;
                    } else {
                        NodePT n = head;
                        while (n.getNext().getNext() != null) {
                            n = n.getNext();
                        }
                        tail = n;
                        tail.setNext(null);
                    }
                }
            } else {
                value.setNext(value.getNext().getNext());
            }
            return cs;
        } else {
            return null;
        }
    }

    /**
     * DONE FOR YOU
     */
    @Override
    public String toString() {
        return "HEAD: " + toString(this.head);
    }

    /**
     * DONE FOR YOU
     */
    private String toString(NodePT n) {
        String s = "";
        if (n != null) {
            s = n.getData() + " --> " + this.toString(n.getNext());
        }
        return s;
    }

}
