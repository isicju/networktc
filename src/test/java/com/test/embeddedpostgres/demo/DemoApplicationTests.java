package com.test.embeddedpostgres.demo;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
class DemoApplicationTests {

//	@Autowired
//	ApplicationContext context;
//	static EmbeddedPostgres pg;
//
//	@ClassRule
//	public static PreparedDbRule db = EmbeddedPostgresRules.preparedDatabase(FlywayPreparer.forClasspathLocation("db/migration"));


//	@BeforeAll
	public static void init() throws IOException {
//		 pg = EmbeddedPostgres.start();
//		try (EmbeddedPostgres pg = EmbeddedPostgres.builder().setPort(5444).start();
//			 Connection c = pg.getPostgresDatabase().getConnection()) {
//
//			DataSource dataSource = pg.getPostgresDatabase();
//
//			Statement s = c.createStatement();
//			ResultSet rs = s.executeQuery("SELECT 1");
//			assertTrue(rs.next());
//			assertEquals(1, rs.getInt(1));
//			assertFalse(rs.next());
//
//			Statement statement = c.createStatement();
//
//				// Read SQL script from the file
//				String sql = new String(Files.readAllBytes(Paths.get("src/test/resources/schema.sql")));
//
//				// Execute SQL script
//				statement.execute(sql);
//			System.out.println("");
//		} catch (Exception e) {
//			System.out.print(e);
//			fail();
//		}
	}

//	@AfterAll
//	public static void destroy() throws IOException {
//		pg.close();
//	}
//
//	@Test
//	void contextLoads() {
//
//
//		assertNotNull(context);
//	}

}
