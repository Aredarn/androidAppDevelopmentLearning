package org.martin.oop_3;

public class engine {
    private String model;
    private int prm;

    public engine(String model, int prm) {
        this.model = model;
        this.prm = prm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrm() {
        return prm;
    }

    public void setPrm(int prm) {
        this.prm = prm;
    }
}
