package ro.ctrln.java.ownership;

import java.util.Objects;

public class Owner {

    private String name;
    private OwnerType type;

    public Owner() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnerType getType() {
        return type;
    }

    public void setType(OwnerType type) {
        this.type = type;
    }

    public Owner(String name, OwnerType type){
        this.name = name;
        this.type = type;


    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return name.equals(owner.name) && type == owner.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
