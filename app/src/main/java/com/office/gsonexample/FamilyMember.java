package com.office.gsonexample;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
   @SerializedName("role")
   private String mRole;
   @SerializedName("age")
   private int mAge;

   public FamilyMember(String role, int age) {
      mRole = role;
      mAge = age;
   }
}
