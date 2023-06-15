package co4;
import java.util.*;

public class q18 {
	public static <K,V>Map<K,V> convert (Map <K,V> hash)
	{
		Map<K,V> tree=new TreeMap<>();
		tree.putAll(hash);
		return tree;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hash=new HashMap<>();
		hash.put("1", "one");
		hash.put("2", "two");
		hash.put("3", "three");
		hash.put("4", "four");
		hash.put("5", "five");
		hash.put("6", "six");
		hash.put("7", "seven");
		hash.put("8", "eight");
		System.out.println("The HashMap created is "+""+hash);
		Map<String,String> tree= convert(hash);
		System.out.println("The Treemap created is "+""+tree);
	}

}
