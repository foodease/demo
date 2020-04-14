package com.example.demo;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEAL")
public class Meal {
    @Id
    @Column(name = "MEAL_ID")
    @GeneratedValue
    private long MEAL_ID;
    @Column(name = "RESTAURANT_NAME")
    private String RESTAURANT_NAME;
    @Column(name = "RESTAURANT_ID" )
    private String RESTAURANT_ID;
    @Column(name = "TOKEN_VALUE")
    private int TOKEN_VALUE;
    @Column(name = "PURCHASE_DATE")
    private Date PURCHASE_DATE;
    @Column(name = "EXPIRATION_DATE")
    private Date EXPIRATION_DATE;

    public Meal() {
        super();
    }


    public Meal(long id, String restaurantName, String restaurantID, int tokenValue, Date purchaseDate, Date expirationDate) {
        super();
        this.MEAL_ID = id;
        this.RESTAURANT_NAME = restaurantName;
        this.RESTAURANT_ID = restaurantID;
        this.TOKEN_VALUE = tokenValue;
        this.PURCHASE_DATE = purchaseDate;
        this.EXPIRATION_DATE = expirationDate;
    }

    public long getMEAL_ID() {
        return MEAL_ID;
    }

    public void setMEAL_ID(long MEAL_ID) {
        this.MEAL_ID = MEAL_ID;
    }

    public String getRESTAURANT_NAME() {
        return RESTAURANT_NAME;
    }

    public void setRESTAURANT_NAME(String RESTAURANT_NAME) {
        this.RESTAURANT_NAME = RESTAURANT_NAME;
    }

    public String getRESTAURANT_ID() {
        return RESTAURANT_ID;
    }

    public void setRESTAURANT_ID(String RESTAURANT_ID) {
        this.RESTAURANT_ID = RESTAURANT_ID;
    }

    public int getTOKEN_VALUE() {
        return TOKEN_VALUE;
    }

    public void setTOKEN_VALUE(int TOKEN_VALUE) {
        this.TOKEN_VALUE = TOKEN_VALUE;
    }

    public Date getPURCHASE_DATE() {
        return PURCHASE_DATE;
    }

    public void setPURCHASE_DATE(Date PURCHASE_DATE) {
        this.PURCHASE_DATE = PURCHASE_DATE;
    }

    public Date getEXPIRATION_DATE() {
        return EXPIRATION_DATE;
    }

    public void setEXPIRATION_DATE(Date EXPIRATION_DATE) {
        this.EXPIRATION_DATE = EXPIRATION_DATE;
    }
}
