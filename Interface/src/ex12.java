
interface  Sayable{    
     default void say(){  
        System.out.println("Hello, this is default method");  
    }  
     void  sayMore(String msg);  
}  
public class ex12  implements  Sayable{  
     public void  sayMore(String msg){        
        System.out.println(msg);  
    }  
     public static void main (String[] args) {  
        ex12 dm =  new  ex12();  
        dm.say();    
        dm.sayMore("Work is worship");  
    }  


}
