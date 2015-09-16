package io.pivotal.demo.hivecf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HiveCfStarterApplication.class)
@WebAppConfiguration
public class HiveCfStarterApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testTemplate() {
		jdbcTemplate.queryForList("select * from test");
	}
}
