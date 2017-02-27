import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = (Circle) c1.clone();
		System.out.println(c1==c2);
	}
}
class Circle implements Cloneable {
    public Object clone() {  
    	Circle o = null;  
        try {  
            o = (Circle) super.clone();  
        } catch (CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return o;  
    }  
}
