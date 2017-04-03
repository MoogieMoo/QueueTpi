/*****************************************************
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/


public interface Deque<Quasar> {

    public void addFirst(Quasar e);
    public void addLast(Quasar e);
    public Quasar removeFirst();	
    public Quasar removeLast();
    public Quasar peekFirst();	
    public Quasar peekLast();


}//end interface Deque                                                                                           
