package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int car_id;

    @Column
    private String name;

    @Column
    private int year;

    @Column
    private int distance;

    @Column
    private String fuel;

    @Column
    private String fuelConsumption;

    @Column
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public Car() {
    }

    public Car(String name, int year, int distance, String fuel, String fuelConsumption, int price) {
        this.name = name;
        this.year = year;
        this.distance = distance;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public int getCarId() {
        return car_id;
    }

    public void setCarId(int carId) {
        this.car_id = car_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", distance=" + distance +
                ", fuel='" + fuel + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}
