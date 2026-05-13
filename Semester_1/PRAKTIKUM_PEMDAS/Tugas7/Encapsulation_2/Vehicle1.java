package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas7.Encapsulation_2;

public class Vehicle1 {
    protected double load, maxload;

    public Vehicle1(double max) {
        this.maxload = max;
    }

    public double getload() {
        return this.load;
    }

    public double getMaxload() {
        return this.maxload;
    }

    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = this.load + weight;
        if (temp <= maxload) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}