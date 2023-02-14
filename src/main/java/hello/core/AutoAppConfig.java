package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member",
        //예제를 유지하기 위해 Configuration Annotation 붙은 class 를 등록하지 않기 위해 설정 한 것
        //기존 예제코드를 남기기 위해서 뺴준 것 임, 실제 업무에서는 Configuration 을 따로 빼지는 않음
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
