package org.martin.challeneg_3;

public class RightEye {
    private String name;
    private String medicalCondition;
    private String color;

    public RightEye(String name, String medicalCondition, String color) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public String getColor() {
        return color;
    }
}
