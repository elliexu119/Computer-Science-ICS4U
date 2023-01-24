package unti4.ifThereIsALock_ThenThereMustBeAKey;

/**
 *
 * @author ellix
 */
public interface ParentInterface {

    //to check if the unlock is unlocked or locked
    public boolean isState();

    //set the default combo for the locks
    public void setCombo(int combo[], int max);

    //checks if the entered combo matches the actual combo to unlock the lock 
    public boolean unlock(int combo[], int a, int b, int c, int d);

    //locks the lock 
    public void lock();

    public String toString(int combo[]);
}
