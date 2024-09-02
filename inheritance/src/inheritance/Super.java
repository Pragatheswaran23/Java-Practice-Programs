package inheritance;


public class Super {
    public static void main(String[] args) {
        System.out.println(new Childs());
    }
    
}



class Parents {

    int i;

    Parents(){
        System.out.println("from parent");
    }

    Parents(int i){
        System.out.println(i);
    }

    
}


class Childs extends Parents{
    int j;

    Childs(){
        super(12);
        System.out.println(super.i);
        System.out.println("form child");
    }
}
