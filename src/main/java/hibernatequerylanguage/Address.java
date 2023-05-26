package hibernatequerylanguage;

import jakarta.persistence.*;
@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    public Address(long id, String addressLine1, String zipcode, String city, Employeee employee) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.zipcode = zipcode;
        this.city = city;
        this.employee = employee;
    }

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "city")
    private String city;

    @OneToOne
    @JoinColumn
    private Employeee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employeee getEmployee() {
        return employee;
    }

    public void setEmployee(Employeee employee) {
        this.employee = employee;
    }

}