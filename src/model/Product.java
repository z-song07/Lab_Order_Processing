/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author archil
 */
public class Product {

    private String prodName;
    private double price;
    private int modelNumber;
    private int avail;

    private static int count = 0;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    public Product() {
        count++;
        modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    @Override
    public boolean equals(Object obj) {
        // same object reference
        if(this == obj) { 
            return true;
        }
        // check if null or these are not the same type of class
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Product selectedProduct = (Product) obj;
        // compare the contents
        return Objects.equals(selectedProduct.getProdName(), this.prodName) && selectedProduct.getModelNumber() == this.modelNumber && selectedProduct.getPrice() == this.price;
    }
    
    // override hash code
    @Override
    public int hashCode() {
        return Objects.hash(prodName, modelNumber, price);
    }
}
