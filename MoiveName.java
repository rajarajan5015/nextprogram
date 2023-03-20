package Collection1;

import java.util.ArrayList;
public class MoiveName {
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<>();
		name.add("TITANIC");
		name.add("DHOOM-1");
		name.add("JUNGLEWARRIOR");
		name.add("DRAGONWARRIOR");
		name.add("HERBEE");
		name.add("SWEETBITTERS");
		name.add("ANTMAN");
		name.add("NARNIYA");
		name.add("HULK");
		name.add("THE NIGHT MANAGER");
	/*	for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		for(int i=name.size()-1;i>0;i--) {
			System.out.println(name.get(i));
		}
		for(String x:name) {
			System.out.println(x);
		}
		name.forEach(x->System.out.println(x));*/
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).charAt(name.get(i).length()-1));
		}
		/*int a=0;
		String b="";
		for(String x:name) {
			if(x.length()>a) {
				a=x.length();
				b=x;
			}
		}
		System.out.println(b);*/
		/*name.forEach(x->{
			if(!x.startsWith("y")) {
				System.out.println(x);
			}
		});*/
	}
}
