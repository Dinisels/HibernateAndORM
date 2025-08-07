package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String model;
    @Column
    private int series;

    @OneToOne(mappedBy = "car") // ссылка на поле "car" в классе User
    private User user;

    public Car(String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
