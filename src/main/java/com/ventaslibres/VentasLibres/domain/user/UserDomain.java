package com.ventaslibres.VentasLibres.domain.user;



public class UserDomain {

    String name;
    String lastName;
    String numberPhone;
    String dateBritDay;

    public UserDomain(String name, String lastName, String numberPhone, String dateBritDay) {
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.dateBritDay = dateBritDay;
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

