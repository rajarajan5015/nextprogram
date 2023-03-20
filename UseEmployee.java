package Collection1;
import java.util.ArrayList;
public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("raja",1062,24,17000,true);
		Employee e2=new Employee("arun",1063,25,17800,true);
		Employee e3=new Employee("jamu",1064,24,15000,false);
		Employee e4=new Employee("varun",1066,24,14600,true);
		Employee e5=new Employee("pooja",1068,22,42900,false);
		Employee e6=new Employee("yogi",1069,24,17200,true);
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		/*for(int i=0;i<emp.size();i++) {
			//System.out.println(emp.get(i).getName()+","+emp.get(i).isMale());
			System.out.println(emp.get(i));
		}*/
		/*for(Employee x: emp) {
			if(x.getAge()>23&&x.equals(x)==true) {
				System.out.println(x);
			}
		}*/
		/*Employee min=emp.get(0);
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getAge()<min.getAge()) {
				min=emp.get(i);
			}
		}
		System.out.println(min);*/
		/*emp.forEach(x->{
			if(x.isMale()==false&&x.getSalary()<25000){
				System.out.println(x);
			}
		});
		int count=0;
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getName().contains("a")||emp.get(i).getName().contains("e")||emp.get(i).getName().contains("i")||emp.get(i).getName().contains("o")||emp.get(i).getName().contains("u")) {
				count++;
			}
		}
		System.out.println(count);*/
		Employee max=e1;
		for(Employee x:emp) {
			if(x.getSalary()>max.getSalary()) {
				max=x;
			}
		}
		System.out.println(max);
		/*emp.forEach(x->{
			if(x.getName().length()>=5) {
				System.out.println(x);
			}
		});*/
	}
}
