package model;

public class Customer {
    private int idCustomer;
    private String name;
    private String email;
    private String company;

    public Customer(int idCustomer, String name, String email, String company) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.company = company;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
