package hello;

import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Documented
@ComponentScan
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MySpringBootApplication {
}
