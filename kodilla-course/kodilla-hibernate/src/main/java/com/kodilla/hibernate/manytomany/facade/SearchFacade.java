package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> searchDbEmploees(String employeePattern) {

        System.out.println("Searching Employees in DB based on given pattern: " + employeePattern);
        List<Employee> employeeList = employeeDao.findEmployeesByPattern(employeePattern);
        System.out.println("Result list of Employees: " + employeeList);

        return employeeList;
    }

    public List<Company> searchDbCompanies(String companyPattern) {
        System.out.println("Searching Companies in DB based on given pattern: " + companyPattern);
        List<Company> companyList = companyDao.findCompaniesByPattern(companyPattern);
        System.out.println("Result list of Companies: " + companyList);

        return companyList;
    }
}
