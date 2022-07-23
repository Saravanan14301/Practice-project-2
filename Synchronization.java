
public class Synchronization implements Runnable { 
	 int tickets = 20;
	    static int a= 1, b = 2, c = 3;
	    public void bookticket (String name, int wantedtickets)
	    {
	        if (wantedtickets <= tickets)
	        {
	            System.out.println (wantedtickets + " booked to " + name);
	            tickets = tickets - wantedtickets;
	        }
	        else
	        {
	            System.out.println ("No tickets to book");
	        }
	    }
	    public void run ()
	    {
	        String name = Thread.currentThread ().getName ();
	        if (name.equals ("n1"))
	        {
	            bookticket (name, a);
	        }
	        else if (name.equals ("n2"))
	        {
	            bookticket (name, b);
	        }
	        else
	        {
	            bookticket (name, c);
	        }
	    }

	public static void main(String[] args) {
		 Synchronization s = new Synchronization ();
	        Thread n1 = new Thread (s);
	        Thread n2 = new Thread (s);
	        Thread n3 = new Thread (s);
	        n1.setName ("n1");
	        n2.setName ("n2");
	        n3.setName ("n3");
	        n1.start ();
	        n2.start ();
	        n3.start ();

	}

}
