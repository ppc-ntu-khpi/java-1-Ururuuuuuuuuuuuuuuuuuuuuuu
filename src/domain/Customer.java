package src.domain;

public class Customer {
    private int ID = 0;
    private boolean isNew = true;
    private double total = 1.5;
    public void displayCustomerInfo(){
        System.out.println("ID POLZEVATELY "+ID);
        System.out.println("novyi POLZEVATEL "+isNew);
        System.out.println("summa POLZEVATELy "+total);
    }

    public Customer(int ID, boolean isNew, double total) {
        this.ID = ID;
        this.isNew = isNew;
        this.total = total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
