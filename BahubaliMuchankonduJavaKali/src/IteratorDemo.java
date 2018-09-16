import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> lst= new ArrayList<String>();
		lst.add("Anil");
		lst.add("Sunil");
		lst.add("Ramesh");
		lst.add("Suresh");
		System.out.println("-------Iterator---------------");
		Iterator<String> it = lst.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("------- List Iterator---------------");
		ListIterator<String> lit = lst.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next());
		while(lit.hasPrevious())
			System.out.println(lit.previous());
		
		List lst1 =  new ArrayList();
		lst1.add("Java");
		lst1.add(100);
		lst1.add(1, true);
		System.out.println(lst1);
		
		lst.addAll(lst1);
		System.out.println(lst);
		
		lst.remove(1);
		System.out.println(lst);
		lst.remove(Integer.valueOf(1000));
		System.out.println(lst);
		lst.add(1, "10");
		System.out.println(lst);
		lst.add(2, "3000");
		lst.add("1600");
		lst.removeAll(lst1);
		System.out.println(lst);
		
		
	}

}
