package PrototypePattern;

public abstract class Shape implements Cloneable {
    String type;
    private String id;

    abstract void draw();

    String getType() {
        return type;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone;
    }

}
