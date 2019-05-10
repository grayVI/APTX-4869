package com.xx.gmall;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {

    public static void main(String[] args) {


        String moduleName = "sms";

        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 2、全局配置
        GlobalConfig gc = new GlobalConfig();
   //     String projectPath = System.getProperty("user.dir");
        gc.setOutputDir("C:\\SSD\\ideaIU-2018.3.5.win\\workSpace\\gmall-parent\\gmall-mbg" + "/src/main/java");
        gc.setAuthor("xx"); //作者
        gc.setOpen(false); //生成后是否打开资源管理器，即文件列表
        gc.setFileOverride(false); //重新生成时文件是否覆盖，执行第二次的时候是否覆盖原来生成的
        gc.setServiceName("%sService");	//去掉Service接口的首字母I
        gc.setIdType(IdType.AUTO); //主键策略

        //定义生成的实体类中日期类型,有该配置的话实体类中生成的是日期类型，否则是String类型
        gc.setDateType(DateType.ONLY_DATE);

        gc.setSwagger2(true);//开启Swagger2模式

        mpg.setGlobalConfig(gc);

        // 3、数据源配置，和mbg一样，需要指定从哪里生成实体文件
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/gmall_"+moduleName);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("107036");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moduleName); //模块名，跟在包名之后
        pc.setParent("com.xx.gmall"); //根包名
        pc.setController("controller");
        pc.setEntity("bean");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude(moduleName+"_\\w*"); //表的名称，参数为可变参数，可以写多个表
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀

        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

        strategy.setRestControllerStyle(true); //restful api风格控制器
        strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符


        //strategy.setLogicDeleteFieldName("is_deleted");//逻辑删除字段名
        //strategy.setEntityBooleanColumnRemoveIsPrefix(true);//去掉布尔值的is_前缀

        //自动填充
        //TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        //TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        //ArrayList<TableFill> tableFills = new ArrayList<>();
        //tableFills.add(gmtCreate);
        //tableFills.add(gmtModified);
        //strategy.setTableFillList(tableFills);

        //strategy.setVersionFieldName("version");//乐观锁列



        mpg.setStrategy(strategy);

        //选择freemarker 引擎,默认 Veloctiy
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // 6、执行
        mpg.execute();
    }
}
