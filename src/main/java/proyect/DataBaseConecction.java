package proyect;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataBaseConecction {
  @Autowired
  public DataSource dataSource;

  public DataBaseConecction() {
    ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
    pooledDataSource.setMaxPoolSize(5);
    this.dataSource = pooledDataSource;
  }

  /*
   * public DataSource dataSource() {
   * ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
   * pooledDataSource.setMaxPoolSize(5);
   * return this.dataSource = pooledDataSource;
   * }
   */
  @Bean
  public Connection getConnection() {
    try {
      return this.dataSource.getConnection();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
