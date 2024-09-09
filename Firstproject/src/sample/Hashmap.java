package sample;
import java.util.*;
import java.util.HashMap;

public class Hashmap {
	public static void main(String[]args) {
		HashMap<String,String> country = new HashMap<String,String>();
		country.put("india","delhi");
		country.put("uk","london");
		country.put("japan","tokyo");
		country.replace("uk","london","paris");
		country.remove("india");
		
		System.out.println(country);
	}

}
