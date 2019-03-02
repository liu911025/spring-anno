package com.study.spring.config;

import com.study.spring.bean.Cat;
import com.study.spring.bean.Dog;
import com.study.spring.bean.Pet;
import com.study.spring.bean.Sheep;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:pet.properties")
//@ImportResource("classpath:applicationContext.xml")
public class BeanConfigAndLifeCycle {

    /**
     *  执行顺序: Construct(构造器) > @postConstruct > InitializingBean接口 > @Bean(initMethod) > BeanPostProcessor.postProcessBeforeInitialization > BeanPostProcessor.postProcessAfterInitialization
     *  执行顺序: @preDestroy >DisposableBean接口 > @Bean(destroyMethod)
     * 1）、指定初始化和销毁方法；
     * 		通过@Bean指定init-method和destroy-method；
     * 2）、通过让Bean实现InitializingBean（定义初始化逻辑），
     * 				DisposableBean（定义销毁逻辑）;
     * 3）、可以使用JSR250；
     * 		通过@PostConstruct：在bean创建完成并且属性赋值完成；来执行初始化方法
     * 		通过@PreDestroy：在容器销毁bean之前通知我们进行清理工作
     * 4）、BeanPostProcessor【interface】：bean的后置处理器；
     * 		在bean初始化前后进行一些处理工作；
     * 		postProcessBeforeInitialization:在初始化之前工作
     * 		postProcessAfterInitialization:在初始化之后工作
     *
     * 	 * Spring底层对 BeanPostProcessor 的使用；
     *  * 		bean赋值，注入其他组件，@Autowired，生命周期注解功能，@Async,xxx BeanPostProcessor;
     * @return
     */
    //@Bean(initMethod = "running", destroyMethod = "back")
    @Bean(initMethod = "running", destroyMethod = "back")
    public Dog dog() {
        return new Dog();
    }


    //@Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Sheep sheep() {
        return new Sheep();
    }
}
