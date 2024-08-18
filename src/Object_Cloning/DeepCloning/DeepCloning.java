package Object_Cloning.DeepCloning;

class Address implements Cloneable{
    String hNo = "12-34A";
    String sName = "sr Nagar";
    String city = "Pune";

    public String toString(){
        return "hNo=" + hNo+"\nsName="+sName+ "\ncity="+city;
    }

    public Address Clone() throws CloneNotSupportedException{
        return (Address)super.clone();
    }

}

class Employee implements Cloneable{
    String name = "sanjeev";
    String id = "A123";
    Address add = new Address();

    public String toString(){
        return "name=" + name+"\nid="+id;
    }

    public Employee Clone() throws CloneNotSupportedException{
        Employee e = (Employee)super.clone(); // clones the object and store it in e
        e.add = this.add.Clone(); // clone method of address class
        return e;
    }
}



public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee();
        System.out.println("---Original Object---");
        System.out.println(e1);
        System.out.println(e1.add);
        System.out.println("hash code of e1="+ e1.hashCode()); // one numeric no generate while object creation is hash code

        // performing cloning process
        Employee e2 = e1.Clone();
        System.out.println("---Cloned Object---");
        System.out.println(e2);
        System.out.println(e2.add);
        System.out.println("hash code of e2="+ e2.hashCode());

        // comparing the reference
        // if two references are same then its is shallow cloning
        // if not then it is deep cloning
        if(e1.add == e2.add) { // comparing the reference variable
            System.out.println("----Shallow Cloning----");
        }else{
            System.out.println("----Deep Cloning----");
        }

    }
}
