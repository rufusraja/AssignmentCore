
public class PersonDetail1 {

	public static void main(String[] my) {
		// TODO Auto-generated method stub
		String fname = my[0];
		String lname = my[1];
		long pnum = Long.parseLong(my[2]);
		String address = my[3];
		int age = Integer.parseInt(my[4]);
		
		fname=my[0].toString();
		lname=my[1].toString();
		pnum=Long.parseLong(my[2]);
		address=my[3].toString();
		age=Integer.parseInt(my[4]);
		
		System.out.println("First Name  : "+fname);
		System.out.println("Last Name   : "+lname);
		System.out.println("Phone Number: "+pnum);
		System.out.println("Address     : "+address);
		System.out.println("Age         : "+age);
	}


}
