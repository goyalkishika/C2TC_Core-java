
interface Writeable{
    void writes();
}
interface Readable {   
    void reads();
}
public class ex15 implements Readable,Writeable
{
    public void reads() {
		System.out.println("Student reads.. ");
    }
    public void writes(){
		System.out.println("Student writes..");
    }
    public static void main(String args[]){
		ex15 s = new ex15();
		s.reads();
		s.writes();
    } 


}
