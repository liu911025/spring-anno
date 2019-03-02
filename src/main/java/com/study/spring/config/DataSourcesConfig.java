package com.study.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

@PropertySource("classpath:db.properties")
@Configuration
public class DataSourcesConfig implements EmbeddedValueResolverAware {

    @Value("${datasource.username}")
    private String username;
    @Value("${datasource.url}")
    private String url;
    @Value("${datasource.driverClassName}")
    private String driverClassName;

    StringValueResolver stringValueResolver;

    @Profile("dev")
    @Bean("dataSource_dev")
    public DataSource dataSource_dev() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(stringValueResolver.resolveStringValue("${datasource.password}"));
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Profile("test")
    @Bean("dataSource_test")
    public DataSource dataSource_test() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(stringValueResolver.resolveStringValue("${datasource.password}"));
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }

    @Profile("pro")
    @Bean("dataSource_pro")
    public DataSource dataSource_pro() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(stringValueResolver.resolveStringValue("${datasource.password}"));
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        return dataSource;
    }
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver = resolver;
    }
}
