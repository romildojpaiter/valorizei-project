package br.com.paiter.valorizei;

public class Custumer {

    private String name;

    public Custumer(){}

    public Custumer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void placeOrder() {
        System.out.println("A new order is placed by " + name);
    }

}
