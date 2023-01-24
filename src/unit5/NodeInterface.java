package unit5;

import unit5.Node;

/**
 * Lesson: 6.03 - a Node, in a Linked List
 */
public interface NodeInterface {

    /**
     * The node pointed to by 'next' is returned
     */
    public Node getNext();

    /**
     * The node pointed to by 'next' is changed to newNode
     */
    public void setNext( Node newNode );

    /**
     * The value (data) of the node.
     */
    public String getValue();

}
