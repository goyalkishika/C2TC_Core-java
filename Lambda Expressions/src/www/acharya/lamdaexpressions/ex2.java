package www.acharya.lamdaexpressions;

interface Sayable {  
    public void say();  
}  
public class ex2{  
     public static void main(String[] args) 
        {  
            Sayable s=() -> { System.out.println("I have nothing to say"); } ;
            s.say();  
}  


}
