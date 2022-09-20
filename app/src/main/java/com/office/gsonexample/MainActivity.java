package com.office.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

//      Gson gson = new Gson();

      // Object to Json
//      Employee employee = new Employee("John", 30, "john@gmail.com");
//      String json = gson.toJson(employee);

      // Json to Object
//      String json = "{\"age\":30,\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
//      Employee employee = gson.fromJson(json, Employee.class);

      // Nested Json
//      Address address = new Address("Germany", "Berlin");
//
//      List<FamilyMember> family = new ArrayList<>();
//      family.add(new FamilyMember("Wife", 30));
//      family.add(new FamilyMember("Daughter", 5));
//
//      Employee employee = new Employee("John", 30, "john@gmail.com", address, family);
//      String json = gson.toJson(employee);

      // Convert json to list of object
//      String json = "[{\"age:\":30,\"role:\":\"Wife\"}, {\"age:\":5,\"role:\":\"Daughter\"}]";
//
//      Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
//      ArrayList<FamilyMember> family = gson.fromJson(json, familyType);

      // Expose
      Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

      Employee employee = new Employee("John", 30, "john@gmail.com", "fdfarg2");
      String jsonResult = gson.toJson(employee);

      String json = "{\"firstName\":\"John\",\"mail\":\"john@gmail.com\"}";
      Employee employee1 = gson.fromJson(json, Employee.class);
   }
}