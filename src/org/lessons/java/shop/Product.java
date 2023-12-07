package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;


public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;

    private BigDecimal price;
    private BigDecimal vat;

    private Category category;


    // COSTRUTTORI

    public Product(String name, String description, BigDecimal price, BigDecimal vat, Category category) {
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
        this.category = category;
    }
    // GETTER e SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal priceCheck(){
        if (price.equals(BigDecimal.ZERO)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("price is to low");
            price = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            return price;
        }
        System.out.println("the price is correct");
        return price;
    }
    public BigDecimal vatCheck(){
        if (vat.equals(BigDecimal.ZERO)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vat is to low");
            vat = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));
            return vat;
        }
        System.out.println("the Vat is correct");
        return vat;
    }

    public String nameCheck(){
        if (name == null){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name is invalid");
            name = scanner.nextLine();
            return name;
        }
        System.out.println("name is valid");
        return name;
    }
    public BigDecimal getFullPrice(){
        // double fullPrice = price + price*vat;
        BigDecimal vatOnPrice = price.multiply(vat);
        return price.add(vatOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getFullName(){
        return code + " " + name;
    }

    private int generateCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(0, 10000);
    }


    @Override
    public String toString(){
        return getFullName() + ": " + getFullPrice() + "€ ("+ category.getName() +")";
    }
}
