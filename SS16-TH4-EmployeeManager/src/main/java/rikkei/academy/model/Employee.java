package rikkei.academy.model;

public class Employee {
    private Integer id;
    private String name;
    private String phone;
    private String address;
    private  boolean status;

    public Employee() {
    }

    public Employee(Integer id, String name, String phone, String address, boolean status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
