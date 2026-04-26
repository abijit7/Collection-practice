package hashMapp;

public class Customer {
    private int id;
    private String name;
    private String district;

    public Customer(int id, String name, String district) {
        this.id = id;
        this.name = name;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
