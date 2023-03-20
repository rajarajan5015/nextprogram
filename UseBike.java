package Collection1;
import java.util.ArrayList;
public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike("BMW",2016,190000,"WHITE",true,"TN09N1999");
		Bike b2=new Bike("HERO",2017,750000,"BLUE",false,"TN15N9999");
		Bike b3=new Bike("JAWA",2020,178000,"GREEN",true,"KA05R4411");
		Bike b4=new Bike("RE",2016,190000,"PURPLE",true,"KL99M5015");
		ArrayList <Bike> b=new ArrayList<>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		ArrayList<Bike> bIsPertol=new ArrayList<>();
		for(Bike m:b) {
			if(m.isPetrol()==false) {
				bIsPertol.add(m);
			}
		}
		bIsPertol.forEach(x->System.out.println(x));
	}
}