package io.pivotal.demo.hivecf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HiveCfStarterApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public static void main(String[] args) {
        SpringApplication.run(HiveCfStarterApplication.class, args);
    }
    
    @RequestMapping("/")
    public ResponseEntity<List<?>> testHive()
    {
    	return ResponseEntity.ok().body(jdbcTemplate.queryForList("select * from test"));
    }
    
}
