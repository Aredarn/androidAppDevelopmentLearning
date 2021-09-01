package org.martin.challeneg_3;

public class Skin {
    private String name;
    private String medicalCondition;

    public Skin(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }
}
