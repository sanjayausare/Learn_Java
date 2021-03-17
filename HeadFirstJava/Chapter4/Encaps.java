class Rando{

    private int num;

    void setNum(int num) {
        this.num = num;
    }

    private int getNum() {
        return num;
    }

    int getNum2() 
    {
        return getNum();
    }

}

public class Encaps {
    
    public static void main(String[] args) {
        
        Rando r = new Rando();

        r.setNum(3);
        System.out.println(r.getNum2());

    }

}

//private makes them accessible only in their class
