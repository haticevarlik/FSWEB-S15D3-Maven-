package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1, "Dogancan", "Kinik"));
        employeeList.add(new Employee(1, "Dogancan", "Kinik"));
        employeeList.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employeeList.add(new Employee(2, "Seyyit Battal", "Arvas"));
        employeeList.add(new Employee(3, "Anil", "Ensari"));
        employeeList.add(new Employee(3, "Anil", "Ensari"));
        employeeList.add(new Employee(4, "Burak", "Cevizli"));
        employeeList.add(null);

       // findDuplicates(employeeList);
       // findUniques(employeeList);
        removeDuplicates(employeeList);

        WordCounter.calculatedWord();

    }

    public static List<Employee> findDuplicates(List<Employee> employeeList){
        Set<Employee> tempList = new HashSet<>();
        List<Employee> duplicateEmployees = new ArrayList<>();
        for (Employee e:employeeList){
            if(!tempList.add(e)){
                duplicateEmployees.add(e);
            }
        }
        System.out.println(duplicateEmployees.toString());
        return duplicateEmployees;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employeeList){
        Map<Integer, Employee> uniqueMap = new HashMap<>();
        for (Employee e:employeeList){
            if(e!=null){
                uniqueMap.put(e.getId(), e);
            }
        }
        System.out.println(uniqueMap);
        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> employeeList){
        Set<Employee> tempList = new HashSet<>();
        Set<Employee> duplicateEmployees = new HashSet<>();
        for (Employee e:employeeList){
            if(!tempList.add(e)){
                duplicateEmployees.add(e);
            }
        }
        tempList.removeAll(duplicateEmployees);
        List<Employee> resultList = new ArrayList<>(tempList);
        System.out.println(resultList.toString());
        return resultList;
    }
}