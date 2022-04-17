import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"saa");
        Employee emp2 = new Employee(2,"saa");
        Employee emp3 = new Employee(3,"uaa");
        Department dep1 = new Department(1,"saa");
        Department dep2 = new Department(2,"saa");
        Department dep3 = new Department(3,"taa");
        List<Employee> emplList = (List<Employee>) List.of(emp1,emp2,emp3);
        List<Department> deptList = (List<Department>) List.of(dep1,dep2,dep3);
        List<Employee> filteredList = emplList.stream()
                .filter(empl -> deptList.stream()
                        .anyMatch(dept ->
                                dept.getDepartment().equals("saa") &&
                                        empl.getEmployeeId().equals(dept.getEmployeeId())))
                .collect(Collectors.toList());
        System.out.println(filteredList.get(0).getEmployeeId());
        System.out.println(filteredList.get(1).getEmployeeId());
        System.out.println(filteredList.get(2).getEmployeeId());
    }
}
