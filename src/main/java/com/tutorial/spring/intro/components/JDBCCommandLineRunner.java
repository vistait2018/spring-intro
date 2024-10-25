package com.tutorial.spring.intro.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class JDBCCommandLineRunner implements CommandLineRunner {
     @Autowired
     private  JdbcTemplate  jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("IN JDBC Command Line Runner");
          insertHardCodedData();
          insertHardCodedUsingPreparedStatement(2,"speaker","pearl","sjhjsjsakjas");
    }

    private void insertHardCodedUsingPreparedStatement(int order_id,
                                                       String item_name,
                                                       String customer_name,
                                                       String address) {


        String query = """
                INSERT INTO ORDER_DETAILS values(?,?,?,?)
                """;
        int rowCount = jdbcTemplate.update(query, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setInt(1,order_id);
                ps.setString(2,item_name);
                ps.setString(3,customer_name);
                ps.setString(4,address);
            }
        });
    }

    private  void insertHardCodedData(){
        System.out.println("====================================");
        System.out.println("starting Hard code Data");
        jdbcTemplate.execute("truncate table order_details");
        jdbcTemplate.execute("insert into order_details  values (1,'Tv', 'success', 'wjwjkjwklqwkl')");
        System.out.println("starting Hard code Data");
        System.out.println("====================================");
    }
}
