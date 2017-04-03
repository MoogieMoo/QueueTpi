import java.util.ArrayList;

public class ALDeque<T> implements Deque<T>{

    //Instance vars
    private ArrayList<T> _deque;

    //Default constructor
    public ALDeque(){
	_deque = new ArrayList<T>();
    }

    //Add an item at the front end of the deque
    public void addFirst( T item ){
	_deque.add( 0, item );
    }

    //Add an item at the back end of the deque
    public void addLast( T item ){
	_deque.add( item );
    }


    //Remove the item at the front end of the deque
    public T removeFirst(){
	T item = _deque.remove(0);
	return item;
    }

    //Remove the item at the back end of the deque
    public T removeLast(){
	T item = _deque.remove( size() - 1 );
	return item;
    }

    //Return the item at the front end of the deque
    public T getFirst() {
        return _deque.get(0);

    }

    //Return the item at the back end of the deque
    public T getLast(){
	return _deque.get( size() - 1 );
    }

    //Check to see if the deque is empty
    public boolean isEmpty(){
	return _deque.get(0) == null;
    }

    //Accessor for the size of the deque
    public int size(){
	return _deque.size();
    }

    //Prints out the items in the deque, from front end to back end
    public String toString(){
	String s = "";
	for ( int i = 0; i < size(); i++ ) {
	    s += _deque.get(i);
	    s += " ";
	}
	return s;
    }

    //tests
    public static void main( String[] args ){
	Deque<String> q = new ALDeque<String>();

	System.out.println("\nnow enqueuing from front end...");
	q.addFirst("happy");
	q.addFirst("dappy");
	q.addFirst("zappy");
	System.out.println(q);//show how it looks at this point

	System.out.println("\nnow enqueuing from back end...");
	q.addLast("super");
	q.addLast("duper");
	q.addLast("muper");
	System.out.println(q);//show how it looks at this point

	System.out.println("\nnow testing toString()...");
	System.out.println( q );

	System.out.println("\nnow testing get methods...");
	System.out.println( q.getFirst() );
	System.out.println( q.getLast() );
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( q.removeFirst() );
	System.out.println( q.removeFirst() );
	System.out.println( q.removeFirst() );

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( q.removeLast() );
	System.out.println( q.removeLast() );
	System.out.println( q.removeLast() );

	//	System.out.println("\nnow dequeuing fr empty deque...");
	//	System.out.println( q.removeFirst() );
    }
}
