
public class ChildDemo<s,m> extends Demo<s> {
	private m temp;
	
public ChildDemo(s data,m temp) {
	// TODO Auto-generated constructor stub
	super(data);
	this.temp=temp;
}

public m getTemp() {
	return temp;
}

public void setTemp(m temp) {
	this.temp = temp;
}
public static void main(String[] args) {
	ChildDemo<String,Integer> c1=new ChildDemo<String,Integer>("polo",44);
	System.out.println(c1.getData()+" " +c1.getTemp());
	
	ChildDemo<Integer,String> c2=new ChildDemo<Integer,String>(01,"xyz");
	System.out.println(c2.getData()+" " +c2.getTemp());
}
}
