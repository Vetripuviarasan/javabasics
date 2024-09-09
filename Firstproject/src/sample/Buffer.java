package sample;

public class Buffer {
	public static void main(String[]args) {
		StringBuffer name = new StringBuffer("@vetri_");
		name.append("vetri");
		System.out.println(name);
		
		StringBuffer name1=new StringBuffer("@vetri");
		name1.insert(6,"_");
		name1.append("Vetrivel");
		System.out.println(name1);
		
		StringBuffer name2=new StringBuffer("@vetri");
		name2.replace(1,3,"ve v9");
		System.out.println(name2);
		
		StringBuffer name3=new StringBuffer("@vettttrri");
		name3.delete(6, 11);
		System.out.println("name3");
		
		StringBuffer name4=new StringBuffer("@vetrri");
		name4.reverse();
		System.out.println(name4);
	}

}
