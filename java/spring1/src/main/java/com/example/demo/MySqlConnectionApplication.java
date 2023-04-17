package com.example.demo;

 
import java.util.Map;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
 
@SpringBootApplication
public class MySqlConnectionApplication implements CommandLineRunner {
     
    @Autowired
    private JdbcTemplate jdbcTemplate;
     
    public static void main(String[] args) {
        SpringApplication.run(MySqlConnectionApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
    	
//    	//TO INSERT A ROW
//        String insertSql = "INSERT INTO users (fullname, email, password) VALUES (?, ?, ?)";
//        int result = jdbcTemplate.update(insertSql, "rohan", "vishwas@gmail.com", "vishwas123");
//        
//        if (result > 0) {
//            System.out.println("A new row has been inserted.");
//        }
        
        
        
        //TO VIEW ALL INSERTED DATA
        String selectSql = "SELECT * FROM users";
        java.util.List<Map<String, Object>> rows = jdbcTemplate.queryForList(selectSql);

        for (Map<String, Object> row : rows) {
            System.out.println("ID: " + row.get("id"));
            System.out.println("Full Name: " + row.get("fullname"));
            System.out.println("Email: " + row.get("email"));
            System.out.println("Password: " + row.get("password"));
        }
    
//
//         
//        // Delete the inserted row
        String deleteSql = "DELETE FROM users WHERE fullname = ?";
        int rowsAffected = jdbcTemplate.update(deleteSql, "sanjana");

        if (rowsAffected > 0) {
            System.out.println("The inserted row has been deleted.");
        }
//        
//        
//        
//      //TO VIEW ALL INSERTED DATA
//        String selectSql1 = "SELECT * FROM users";
//        java.util.List<Map<String, Object>> rows1 = jdbcTemplate.queryForList(selectSql);
//
//        for (Map<String, Object> row : rows1) {
//            System.out.println("ID: " + row.get("id"));
//            System.out.println("Full Name: " + row.get("fullname"));
//            System.out.println("Email: " + row.get("email"));
//            System.out.println("Password: " + row.get("password"));
//        }
//        
//        
//        
        //TO UPDATE THE DATA
//        String updateSql = "UPDATE users SET email = ? WHERE fullname = ?";
//        int rowsAffected1 = jdbcTemplate.update(updateSql, "rohan@gmail.com", "sanjana");
//
//        if (rowsAffected1 > 0) {
//            System.out.println("The row has been updated.");
//        }
        
         
    }
 
}
