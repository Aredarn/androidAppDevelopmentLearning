package org.martin.challeneg_3;

public class Heart {
    private String name;
    private String medicalCondition;
    private int hearthRate;

    public Heart(String name, String medicalCondition, int hearthRate) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.hearthRate = hearthRate;
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public int getHearthRate() {
        return hearthRate;
    }

    public void setHearthRate(int hearthRate) {
        this.hearthRate = hearthRate;
    }
}
