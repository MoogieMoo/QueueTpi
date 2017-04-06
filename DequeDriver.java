/*
  Kelly Wang
  APCS2 pd1
  HW #29: Stress is the Best
  Due W 2017-04-05
*/

public class DequeDriver {

    public static void main ( String[] args ) {

	//tests the deque without a capacity
        ALDeque<String> place = new ALDeque<String>();
	System.out.println("\nDEQUE WITH NO CAPACITY:");

	//each element should be added at the head of the list
	System.out.println("\nNow testing addFirst:");
        place.addFirst("hello");
        place.addFirst("melon");
	System.out.println(place);

	//each element should be added at the tail of the list
	System.out.println("\nNow testing addFirst:");
        place.addLast("lotion");
        place.addLast("will");
	System.out.println(place);

	//the element at the head should be removed
	System.out.println("\nNow testing removeLast:");
        System.out.println(place.removeLast());
        System.out.println(place.removeLast());
	System.out.println(place);

	//the element at the tail should be removed
	System.out.println("\nNow testing removeFirst:");
        System.out.println(place.removeFirst());
        System.out.println(place.removeFirst());
	System.out.println(place);
	
	//there are no more elements, so pollLast should return null.
	System.out.println("Should return null:");
        //System.out.println(place.pollLast());

	/*
	//tests the deque with a capacity
        ALDeque<String> hold = new ALDeque<String>(4);
	System.out.println("\nDEQUE WITH CAPACITY 4:");

	//Offer methods should only add an element to the list if it has not reached capacity.
	//offerFirst adds elements at the head
	System.out.println("\nNow testing offerFirst:");
        hold.offerFirst("hello");
        hold.offerFirst("melon");
	System.out.println(hold);

	//offerLast adds elements at the tail
	System.out.println("\nNow testing offerLast:");
        hold.offerLast("lotion");
        hold.offerLast("will");
	//"heellele" will not be added to the list because there are already 4 elements
        hold.offerLast("heellele");
        System.out.println(hold);

	//removes from the tail 
	System.out.println("\nNow removeLast:");
        System.out.println(hold.removeLast());
        System.out.println(hold.removeLast());

	//removes from the head
	System.out.println("\nNow testing removeFirst:");
        System.out.println(hold.removeFirst());
        System.out.println(hold.removeFirst());

	//all elements have been removed. an exception should be thrown
	System.out.println("\nShould throw an exception:");
        System.out.println(hold.removeLast());
	*/
    }
}


