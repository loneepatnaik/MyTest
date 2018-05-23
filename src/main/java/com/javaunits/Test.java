package com.javaunits;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Test {
	public static void main(String[] args) {
		Address a = new Address();
		a.setVillage("chhima");
		a.setDist("khordha");
		a.setPin("752036");
		Employee e = new Employee();
		e.setName("swarna");
		e.setId(101);
		e.setAge(20);
		e.setAddress(a);

		Gson gson = new Gson();
		String json = gson.toJson(e);
		System.out.println(json);
		  try(FileWriter writer = new FileWriter("Employee.json")){

            gson.toJson(e, writer);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try(Reader reader = new FileReader("Employee.json")){

            Employee obj = gson.fromJson(reader, Employee.class);
            System.out.println(obj);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


	}
