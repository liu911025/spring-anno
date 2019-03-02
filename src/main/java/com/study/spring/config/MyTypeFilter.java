package com.study.spring.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义扫描过滤规则,配合注解@ComponentScan 和FilterType.CUSTOM使用
 */
public class MyTypeFilter implements TypeFilter {

    /**
     *
     * @param metadataReader        读取当前正在扫描类的信息
     * @param metadataReaderFactory 获取其他任何类的信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //当前正在扫描类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //当前类资源信息(类路径)
        Resource resource = metadataReader.getResource();

        String className = annotationMetadata.getClassName();
        System.out.println("MyTypeFilter:>>>" + className);
        if (className.contains("Dao")) {
            return true;
        }
        return false;
    }
}
