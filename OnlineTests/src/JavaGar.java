
public class JavaGar {
 JavaGar t;
 static int i=1;
 protected void finalize(){
	 System.out.println("Garg"+ i);
	 i++;
 }
 public static void main(String[] args) {
	JavaGar t1= new JavaGar();
	JavaGar t2= new JavaGar();
	t1.t=t2;
	t2.t=t1;
	t1=null;
	t2=null;
	System.gc();
}
}
