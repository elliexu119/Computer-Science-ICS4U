package unti4;

/**
 * Lesson: 6.02 - Queue w/Integer
 */
public interface QueueInterface {
    
    public Integer front();
    
    public Integer back();
    
    public boolean enqueue( Integer value );

    public Integer dequeue();

    public int size();
    
    public int capacity();

    public boolean isEmpty();
    
    public boolean isFull();

    public boolean makeEmpty();

}
