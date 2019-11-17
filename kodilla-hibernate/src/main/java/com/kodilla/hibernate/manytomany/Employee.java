package com.kodilla.hibernate.manytomany;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = "Employee.retrieveEmployeesWithTheGivenLastName",
                query = "FROM Employee WHERE lastname = :LASTNAME"),
        @NamedQuery(name = "Employee.retrieveEmployeesWithNamesContainingPhrase",
                query = "FROM Employee WHERE lastname LIKE CONCAT('%',:PHRASE,'%')")
})

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "JOIN_COMPANY_EMPLOYEE", joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")})
    public List<Company> getCompanies() {
        return companies;
    }

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
