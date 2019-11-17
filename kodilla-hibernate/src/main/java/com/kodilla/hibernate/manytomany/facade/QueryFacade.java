package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public final class QueryFacade {
    @Autowired
    private QueryService queryService;

    public List<Company> findCompanies(String randomLetters) {
        return queryService.findCompanies(randomLetters);
    }

    public List<Employee> findEmployees(String randomLetters) {
        return queryService.findEmployees(randomLetters);
    }
}
