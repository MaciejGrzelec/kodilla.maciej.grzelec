package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryService {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompanies(String randomLetters) {
        return companyDao.retrieveCompaniesWithNamesContainingPhrase(randomLetters);
    }

    public List<Employee> findEmployees(String randomLetters) {
        return employeeDao.retrieveEmployeesWithNamesContainingPhrase(randomLetters);
    }
}
