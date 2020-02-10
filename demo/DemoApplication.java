package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		db();
	}

	public static void db()
	{
		Collections table = new Collections("Contestants");
		NewContestants record = new NewContestants("EFF", 0);
		table.getTable().insertOne(record.returnRecord());
		System.out.println();
		//mongoClient.close();
	}
}
