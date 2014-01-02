package com.baobaotao.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PatternResolverTest {
    public static void main(String[] args) throws Throwable {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        
        Resource resource[] = resolver.getResources("classpath*:overview.html");
        for (Resource res:resource){
            System.out.println(res.getDescription());
        }

    }

}
