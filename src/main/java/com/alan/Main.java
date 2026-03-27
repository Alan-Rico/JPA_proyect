package com.alan;

import com.alan.Util.UtilEntity;
import com.alan.entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager em = UtilEntity.getEntityManager();
        List<Employee> employees = em.createQuery("Select e from Employee e", Employee.class).getResultList();
        System.out.println("---LISTANDO TODOS---");
        employees.forEach(System.out::println);

        System.out.println("---BUSCANDO POR ID---");
        int employeeId = 114;
        Employee employee = em.find(Employee.class, employeeId);
        System.out.println("Empleado encontrado: " + employee);

    }
}