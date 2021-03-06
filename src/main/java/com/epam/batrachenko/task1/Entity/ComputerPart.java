package com.epam.batrachenko.task1.Entity;

import com.epam.batrachenko.task7.field_annotaions.FieldTittle;

import java.math.BigDecimal;
import java.util.Objects;

public class ComputerPart extends Product {
    @FieldTittle(tittle = "category")
    protected String category;
    @FieldTittle(tittle = "purpose")
    protected String purpose;

    public ComputerPart() {
    }

    public ComputerPart(String name, BigDecimal price, String country, String category, String purpose) {
        super(name, price, country);
        this.category = category;
        this.purpose = purpose;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "ComputerPart{" +
                "name='" + name + '\'' +
                ", price='" + price +'\'' +
                ", country='" + country + '\'' +
                ", category='" + category + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerPart that = (ComputerPart) o;
        return Objects.equals(category, that.category) && Objects.equals(purpose, that.purpose);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), this.category, this.purpose);
    }
}
