public class Override {
    public void make(){
        System.out.println("make sound");
    }
    public static void main(String[] args){
        Override o=new Override();
        Override o1=new Over2();
        o.make();
        o1.make();
    }
    
}
class Over2 extends Override{
    public void make(){
        System.out.println("over2 making sound");
    }
   

}
