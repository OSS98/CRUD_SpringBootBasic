package com.example.CRUD_spring.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String name;

  private String email;

  private LocalDate dateTime = LocalDate.now();

  public Integer getId() {
    return id;
  }
  
  public LocalDate getTime(){
     return dateTime;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // public String getDateTime(){
  //   return dateTime;
  // }
  // public void setDateTime(){
  //   DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  //   String formattedDate = LocalDateTime.now().format(myFormatObj);
  //   this.dateTime = formattedDate;
  // }
  // public String toString(){
  //     return id+" "+ name + " " + email;
  // }
}
