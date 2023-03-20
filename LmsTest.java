package Collection1;

import java.util.ArrayList;
public class LmsTest {
	public static void main(String[] args) {
		ArrayList<Integer> lms=new ArrayList<>();
		lms.add(570);
		lms.add(1060);
		lms.add(1062);
		lms.add(1065);
		/*for(int i=0;i<lms.size();i++) {
			System.out.println(lms.get(i));
		}
		for(Integer x:lms) {
			System.out.println(x);
		}
		lms.forEach(x->System.out.println(x));*/
		/*for(int i=0;i<lms.size();i++) {
			if(i%2==0) {
				System.out.println(lms.get(i)+"is even");
			}
			else {
				System.out.println(lms.get(i)+"is odd");
			}
		}*/
		int temp=0;
		int count=0;
		for(Integer y:lms) {
			temp=temp+y;
			
		}
		System.out.println(temp);
		lms.forEach(x->{if(x>1000) { System.out.println(x);}});
	}
}
