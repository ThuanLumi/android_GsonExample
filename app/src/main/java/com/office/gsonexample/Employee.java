package com.office.gsonexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
   // First 4 examples
//   @SerializedName("first_name")
//   private String mFirstName;
//   @SerializedName("age")
//   private int mAge;
//   @SerializedName("mail")
//   private String mMail;
//   @SerializedName("address")
//   private Address mAddress;
//   @SerializedName("family")
//   private List<FamilyMember> mFamily;
//
//   public Employee(String firstName, int age, String mail, Address address,
//                   List<FamilyMember> family) {
//      mFirstName = firstName;
//      mAge = age;
//      mMail = mail;
//      mAddress = address;
//      mFamily = family;
//   }

   // Expose and transient
   @Expose
   private String firstName;
   @Expose(serialize = false)
   private int age;
   @Expose(deserialize = false)
   private String mail;

   private String password;
//   private transient String password; // not to be serialized

   public Employee(String firstName, int age, String mail, String password) {
      this.firstName = firstName;
      this.age = age;
      this.mail = mail;
      this.password = password;
   }
}
