package SuperPersonAndSubclasses;

public class TestMain {
    public static void main(String[] args) {
        //creating instance of Student class
        Student s1=new Student("kiran","Hyderabad,Telangana","B.tech",3,99000);
        System.out.println(s1);

        //creating instance of Staff class
        Staff s2=new Staff("praveen","Vizag,Andhra","JNTUH",50000);
        System.out.println(s2);

        //Testing the getters
        s1.setFee(89000);
        s1.setProgram("B.com");
        s1.setYear(2);
        System.out.println("Name is: "+s1.getName());
        System.out.println("Program is: "+s1.getProgram());
        System.out.println("Year is: "+s1.getYear());
        System.out.println("Fee is: "+s1.getFee());
        System.out.println("Address is: "+s1.getAddress());
        System.out.println();
        s2.setPay(60000);
        System.out.println("Name is: "+s2.getName());
        System.out.println("College is: "+s2.getCollege());
        System.out.println("Pay is: "+s2.getPay());
        System.out.println("Address is: "+s2.getAddress());

        Person p1=new Student("anjan","Mumbai,Maharastra","B.tech",4,100000);
        System.out.println(p1);

        Person p2=new Person("krish","Kolkata,WestBengal");

        System.out.println("Name is: "+p2.getName());
        System.out.println("Address is: "+p2.getAddress());

    }
}
