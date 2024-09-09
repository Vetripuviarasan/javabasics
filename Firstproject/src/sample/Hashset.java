package sample;
import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet<String> country = new HashSet<String>();
		country.add("london");
		country.add("india");
		country.add("tamilnadu");
		country.remove("uk");
		System.out.println(country.contains("uk"));
		
	}

}
