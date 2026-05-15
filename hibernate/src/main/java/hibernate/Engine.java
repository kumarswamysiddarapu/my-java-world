package hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Engine {

    @Id
    private Integer id;
    private String type;
    private Integer cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}