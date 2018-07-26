package com.example.master10;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by McadaC on 6/11/18.
 */
@Component
@ConfigurationProperties(prefix = "master.spring")
public class ExternalProperties {

    private String name;

    private String lastName;

    private String age;


    @PostConstruct
    public void postContructor(){

        System.out.println("Name : " + name);
        System.out.println("Last Name : " + lastName);
        System.out.println("Age : " + age);
    }


    /**
     * Getter for property 'name'.
     *
     * @return Value for property 'name'.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property 'name'.
     *
     * @param name Value to set for property 'name'.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for property 'lastName'.
     *
     * @return Value for property 'lastName'.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for property 'lastName'.
     *
     * @param lastName Value to set for property 'lastName'.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for property 'age'.
     *
     * @return Value for property 'age'.
     */
    public String getAge() {
        return age;
    }

    /**
     * Setter for property 'age'.
     *
     * @param age Value to set for property 'age'.
     */
    public void setAge(String age) {
        this.age = age;
    }

}
