package com.company;

public class Main {

    public static void main(String[] args) {

        Motorbike m1 = new Motorbike("Yamaha", "FZ1");
        MotorbikeSold m2 = new MotorbikeSold("Guzzi", "Stelvio");

        System.out.println(m1);
        System.out.println(m2);

        m2.setSpeed(200);

        System.out.println(m1);
        System.out.println(m2);
    }
}

class Motorbike {
    String brand;
    String model;
    double maxspeed = 200;
    boolean antitheft = false;

    public Motorbike(String brand, String model, double maxspeed, boolean antitheft) {
        super();
        this.brand = brand;
        this.model = model;
        this.maxspeed = maxspeed;
        this.antitheft = antitheft;
    }

    public Motorbike(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public boolean isAntitheft() {
        return antitheft;
    }

    public void setAntitheft(boolean antitheft) {
        this.antitheft = antitheft;
    }

    @Override
    public String toString() {
        return "Motorbike [brand=" + brand + ", model=" + model + ", maxspeed=" + maxspeed + "isAntitheft=" + antitheft + "]";
    }
}

class MotorbikeSold extends Motorbike {
    double speed = 0.0;
    String licencePlate = "JohnDoe";

    public MotorbikeSold(String brand, String model, double maxspeed, boolean antitheft, double speed, String licencePlate) {
        super(brand, model, maxspeed, antitheft);
        this.speed = speed;
        this.licencePlate = licencePlate;
    }

    public MotorbikeSold(String brand, String model) {
        super(brand, model);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return "MotorbikeSold [speed=" + speed + ", licensePlate=" + licencePlate + ", brand=" + brand + ", model=" + model +
                ", maxspeed=" + maxspeed + ", antitheft=" + antitheft + "]";
    }
}
/* Wanted output:
Motorbike [brand=Yamaha, model=FZ1, maxspeed=200.0isAntitheft=false]
MotorbikeSold [speed=0.0, licensePlate=JohnDoe, brandGuzzi, model=Stelvio, maxspeed=200.0, antitheft=false]
Motorbike [brand=Yamaha, model=FZ1, maxspeed=200.0isAntitheft=false]
MotorbikeSold [speed=200.0, licensePlate=JohnDoe, brandGuzzi, model=Stelvio, maxspeed=200.0, antitheft=false]
 */