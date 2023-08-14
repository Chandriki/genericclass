package chandriki2;

public class genericclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test<String,Integer> obj=new Test<String,Integer>("Hello",8);
          obj.print();
	}

}
class Test<T,U>
{
	T obj1;
	U obj2;
	Test(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}