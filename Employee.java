
public class Employee {
    private String fName;
    private String lName;
    private String id;
    
    public Employee(String fName, String lName, String id) {
         this.fName = fName;
           this.lName = lName;
           this.id = id;  
    }
         
    public void setfName(String fName) {
        this.fName = fName;
    }
    
    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getfName() {
        return fName;
    }
    
    public String getlName() {
        return lName;
    }
    
    public String getID() {
        return id;
    }
}
