class Test {
Integer id;
Test(int id)
{this.id=id;
}public static void name(String[] args) {
	Test t1= new Test(3);
	Test t2= new Test(3);
System.out.println(t1 == t2);
System.out.println(t1.equals(t2));
}
	public int hashCode()
	{
		return 1;
		
	}
	public boolean equals(Object obj)
	{
		return (this.id).equals(((Test)obj).id);
		
	}
}
