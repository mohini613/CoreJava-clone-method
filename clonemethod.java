package clonemethod;

public class clonemethod implements Cloneable {
int x=10;
int y=20;
	public static void main(String[] args) throws CloneNotSupportedException{
clonemethod t=new clonemethod();
System.out.println(t);
clonemethod t1= (clonemethod)t.clone();//typecasting
	System.out.println(t1);
t1.x=111;
t1.y=222;
System.out.println(t.x+"_______"+t1.x);
}
}
