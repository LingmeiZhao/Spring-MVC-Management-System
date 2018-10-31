package org.company.models;

import java.util.ArrayList;
import java.io.*;

public class Methods {
    public ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public Methods() {

    }

    public ArrayList<String> readFile(String path) {
        ArrayList<String> lineData = new ArrayList<String>();
        File file = new File(path);
        BufferedReader br = null;
        String line = "";
        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                lineData.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineData;
    }

    public void readIntoList() {
        ArrayList<String> lineData = readFile("/home/juliazhao/Documents/MyCode/Java/EmployeeManagementSystem/EmployeeList.txt");
        employeeList = new ArrayList<Employee>();
        for (int i = 0; i < lineData.size(); i++) {
            String line = lineData.get(i);
            String[] array = line.split(",");
            Employee employee = new Employee(Long.parseLong(array[0]), array[1], array[2],
                    Double.parseDouble(array[3]), array[4]);
            employeeList.add(employee);
        }

    }

    public void writeToFile(String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < employeeList.size(); i++) {
                String string = new String();
                string = String.valueOf(employeeList.get(i).getId()) + "," +
                        employeeList.get(i).getName() + "," + employeeList.get(i).getGender() + ","
                        + String.valueOf(employeeList.get(i).getSalary()) + ","
                        + employeeList.get(i).getDepartment();
                writer.write(string);
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(long id, String name, String gender, double salary, String department) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setGender(gender);
        employee.setSalary(salary);
        employee.setDepartment(department);
        employeeList.add(employee);
    }

    public boolean canDelete(long id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void deleteEmployee(long id) {
        int index = 0;
        if (canDelete(id) == true) {
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getId() == id) {
                    index = i;
                }
            }
        }
        for (int i = index; i < employeeList.size() - 1; i++) {
            employeeList.set(i, employeeList.get(i + 1));
        }
        employeeList.remove(employeeList.size() - 1);
    }

    public boolean canFindEmployee(long id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Employee findEmployee(long id) {
        Employee employee = new Employee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employee = employeeList.get(i);
            }
        }
        return employee;
    }

    public boolean canModification(long id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Employee modificationInfo(long id) {
        Employee employee = new Employee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employee = employeeList.get(i);
            }
        }
        return employee;
    }

    public String[] displayEmployee() {

        String[] strings = new String[employeeList.size()];
        for (int i = 0; i < employeeList.size(); i++) {
            strings[i] = "<tr><td>" + employeeList.get(i).getId() + "</td>"
                    + "<td>" + employeeList.get(i).getName() + "</td>"
                    + "<td>" + employeeList.get(i).getGender() + "</td>"
                    + "<td>" + employeeList.get(i).getSalary() + "</td>"
                    + "<td>" + employeeList.get(i).getDepartment() + "</td></tr>";
        }
        return strings;
    }

}
