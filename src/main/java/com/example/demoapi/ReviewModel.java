package com.example.demoapi;

public class ReviewModel {
    private float kind;
    private float info;
    private float packaging;
    private float delivery;
    private float staff;
    private float payment;

    public ReviewModel(float kind, float info, float packaging, float delivery, float staff, float payment) {
        this.kind = kind;
        this.info = info;
        this.packaging = packaging;
        this.delivery = delivery;
        this.staff = staff;
        this.payment = payment;
    }

    public float getKind() {
        return kind;
    }

    public void setKind(float kind) {
        this.kind = kind;
    }

    public float getInfo() {
        return info;
    }

    public void setInfo(float info) {
        this.info = info;
    }

    public float getPackaging() {
        return packaging;
    }

    public void setPackaging(float packaging) {
        this.packaging = packaging;
    }

    public float getDelivery() {
        return delivery;
    }

    public void setDelivery(float delivery) {
        this.delivery = delivery;
    }

    public float getStaff() {
        return staff;
    }

    public void setStaff(float staff) {
        this.staff = staff;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "ReviewModel{" +
                "kind=" + kind +
                ", info=" + info +
                ", packaging=" + packaging +
                ", delivery=" + delivery +
                ", staff=" + staff +
                ", payment=" + payment +
                '}';
    }
}
