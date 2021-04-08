import java.util.HashMap;
import java.util.Map;

public class HashmapTest{

    public static void main(String[] args) {
        HashMapTestDriver hmd = new HashMapTestDriver();
        Map<Employee,String> mapppp = hmd.mapTest();
        System.out.println(mapppp);
       System.out.println(mapppp.get(null));
    }
}

class HashMapTestDriver {
    Map<Employee,String> map = new HashMap();
    Employee e1 = new Employee(100,"Anupam");
    Employee e2 = new Employee(101,"Varsha");

    public Map<Employee,String> mapTest(){
        map.put(e1,"HelloAnupam");
        map.put(e2,"HelloVarsha");
        return map;
    }
}

class Employee {
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
