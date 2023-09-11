package proyect;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataBaseConecction {

  @Bean
  public DataSource dataSource() {
    ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
    pooledDataSource.setMaxPoolSize(20);
    return pooledDataSource;
  }

  public DataSource getDataSource() {
    return dataSource();
  }
}
