package com.ventaslibres.VentasLibres.domain.user;


import javax.persistence.*;

@Entity
@Table()
public class UserDomain {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @Column(length = 20)
    private String name;
    @Column(length = 20)
    private String lastName;
    @Column(length = 20)
    private String numberPhone;
    @Column(length = 20)
    private String dateBritDay;

    public UserDomain(String userId, String name, String lastName, String numberPhone, String dateBritDay) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.dateBritDay = dateBritDay;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDomain() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getDateBritDay() {
        return dateBritDay;
    }

    public void setDateBritDay(String dateBritDay) {
        this.dateBritDay = dateBritDay;
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", dateBritDay='" + dateBritDay + '\'' +
                '}';
    }
}

