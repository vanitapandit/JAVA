/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Role.Role;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private Map<String, Employee> employeeIDMap;

    public EmployeeDirectory() {
        employeeIDMap = new HashMap();
    }

    public Map<String, Employee> getEmployeeIDMap() {
        return employeeIDMap;
    }
    
    public Employee createEmployee(String name, String organizationID, Role role){
        Employee employee = new Employee(name, organizationID, role);
        employeeIDMap.put(employee.getEmployeeID(), employee);
        return employee;
    }
}