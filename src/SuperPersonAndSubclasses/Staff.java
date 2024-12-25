package SuperPersonAndSubclasses;

public class Staff extends Person{
    private String college;
    private double pay;

    public Staff(String name, String address, String college, double pay) {
        super(name, address);
        this.college = college;
        this.pay = pay;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" +"Person["+
                "name='"+getName()+'\''+
                ", address'"+getAddress()+'\''+
                "], college='" + college + '\'' +
                ", pay=" + pay +
                ']';
    }
}
