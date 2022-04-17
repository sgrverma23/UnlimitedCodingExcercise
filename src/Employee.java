public class Employee {
    Integer employeeId;

    public Employee(int i, String saa) {
        this.employeeId = i;
        this.employeeName = saa;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    String employeeName;
}
