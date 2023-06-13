package co4;
import java.util.*;
public class q17 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Map<Integer,String> map=new TreeMap<>();
	map.put(1,"Benz");
	map.put(2,"Bmw");
	map.put(3,"Audi");
	map.put(4,"Ferrai");
	map.put(5,"Bentley");
	map.put(6,"Koenigsegg");
	System.out.println(map);
	map.replace(3, "Mclaren");
	System.out.println(map);
	map.putIfAbsent(7,"Aston Martin");
	System.out.println(map);
	map.remove(2);
	System.out.println(map);
	
	}

}
