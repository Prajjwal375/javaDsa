public class OOP {
public static void main(String[] args) {
    Pen p1 = new Pen(); // created  a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());

    BankAccount myAcc = new BankAccount();
    myAcc.username = "Prajval Saki";
    myAcc.setPassword("abcdefghi");
}
}   

class Pen {
   private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip; // getter 
    }

    void setColor(String new Color) { // setter
        this.color  = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;

    }
}


class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}