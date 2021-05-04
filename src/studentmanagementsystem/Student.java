
package studentmanagementsystem;
public class Student {
    private String userName = "NULL";
    private String password = "NULL";
    private String name = "NULL";
    private String studentID = "NULL";
    private String department = "NULL";
    static int totalStudent = 0;
    private String oppEnrollKey="java";

    public Student() {
    }
    
        public Student(String userName, String password, String name, String studentID, String department) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.studentID = studentID;
        this.department = department;
      //  this.tuitionFees = tuitionFees;
    }
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getDepartment() {
        return department;
    }

   // public double getTuitionFees() {
      //  return tuitionFees;
   // }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

   // public void setTuitionFees(double tuitionFees) {
        //this.tuitionFees = tuitionFees;
   // }

    public String getOppEnrollKey() {
        return oppEnrollKey;
    }
    
}
