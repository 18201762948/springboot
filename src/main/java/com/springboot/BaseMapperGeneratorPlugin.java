package com.springboot;


import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nuono on 2017/4/10.
 */
@Component
public class BaseMapperGeneratorPlugin extends PluginAdapter {

    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * 生成dao
     */
    @Override
    public boolean clientGenerated(Interface interfaze,
                                   TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        List<Method> methods = interfaze.getMethods();

        /**
         *
         */
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseMapper<"
                + introspectedTable.getExampleType() + ","
                + introspectedTable.getBaseRecordType() + ","
                + methods.get(2).getParameters().get(0).getType()+ ">");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType(
                "com.springboot.mapper.BaseMapper");


        /**
         * 添加 extends MybatisBaseMapper
         */
        interfaze.addSuperInterface(fqjt);

        /**
         * 添加import my.mabatis.example.base.MybatisBaseMapper;
         */
        interfaze.addImportedType(imp);
        /**
         * 方法不需要
         */

        FullyQualifiedJavaType fullyQualifiedJavaType = methods.get(1).getReturnType();

        methods.get(0).setReturnType(fullyQualifiedJavaType);
        methods.clear();
        interfaze.getAnnotations().clear();
        return true;
    }

}
