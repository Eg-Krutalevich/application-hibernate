package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Table;
import javax.persistence.FetchType;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int company_id;

    @Column
    private String company_name;

    @Column
    private String company_country;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Car> cars;

    public Company() {
    }

    public Company(String company_name, String company_country) {
        this.company_name = company_name;
        this.company_country = company_country;
        cars = new ArrayList<>();
    }

    public int getCompanyId() {
        return company_id;
    }

    public void setCompanyId(int companyId) {
        this.company_id = company_id;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String companyName) {
        this.company_name = company_name;
    }

    public String getCompanyCountry() {
        return company_country;
    }

    public void setCompanyCountry(String companyCountry) {
        this.company_country = company_country;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        car.setCompany(this);
        this.cars.add(car);
    }

    @Override
    public String toString() {
        return "Company{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", company_country='" + company_country + '\'' +
                '}';
    }
}
