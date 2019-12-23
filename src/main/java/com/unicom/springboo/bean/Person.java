package com.unicom.springboo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author hanbing
 * @create 2019-08-07 17:03
 */

//@PropertySource("classpath:person.properties")
@Component
@ConfigurationProperties(prefix = "xxx")
public class Person {
    private String LastName;
    private String firstName;
    private int age;
    private Dog dog;
    private Date birthDay;
    Map<String, String> map;
    List<String> list;
    String[] sts;

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getSts() {
        return sts;
    }

    public void setSts(String[] sts) {
        this.sts = sts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "LastName='" + LastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", birthDay=" + birthDay +
                ", map=" + map +
                ", list=" + list +
                ", sts=" + Arrays.toString(sts) +
                '}';
    }
}
