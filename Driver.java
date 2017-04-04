public class Driver {
    
    public static void main ( String[] args ) {

	Deque<String> test1 = new ALDeque<String>();
	
	System.out.println("\nTesting enqueue() from front end...");
	q.addFirst("uno");
	q.addFirst("dos");
	q.addFirst("tres");
	System.out.println(q);//show how it looks at this point

	System.out.println("\nTesting enqueue() from back end...");
	q.addLast("yi");
	q.addLast("er");
	q.addLast("san");
	System.out.println(q);//show how it looks at this point
     
	System.out.println("\nTesting get() methods...");
	System.out.println( "First: " );
	System.out.println( q.getFirst() );
	System.out.println( "Last: " );
	System.out.println( q.getLast() );
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( "First: " );
	System.out.println( q.removeFirst() );
	System.out.println( "Second: " );
	System.out.println( q.removeFirst() );
	System.out.println( "Third: " );
	System.out.println( q.removeFirst() );

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( "First: " );
	System.out.println( q.removeLast() );
	System.out.println( "Second: " );
	System.out.println( q.removeLast() );
	System.out.println( "Third: " );
	System.out.println( q.removeLast() );

    }//end main method

}//end class Driver
