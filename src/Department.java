public class Department {
    Integer employeeId;
    public Department(int i, String saa) {
        this.employeeId = i;
        this.department = saa;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String department;
}
