
spring-boot添加新模块步骤：
1、在新模块中定义好以下几个属性：（以edu-ch4-freemarker为例）
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.attech</groupId>
    <artifactId>edu-ch4-freemarker</artifactId>
    <name>edu-ch4-freemarker</name>
    <version>1.0-SNAPSHOT</version>

2、导入spring-boot顶级parent包：
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.0.0.RELEASE</version>
        <relativePath/>
    </parent>

3、引入相关包：
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
    </dependency>

4、在项目根pom中添加相应模块声明：
    <modules>
        <module>edu-ch4-freemarker</module>
    </modules>
    
5、在启动模块pom中将新增的模块添加进去：
    <dependency>
        <groupId>com.attech</groupId>
        <artifactId>edu-ch4-freemarker</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

6、将新增模块中的resources目录文件修改成资源文件目录：
    File ---> Project Structrue ---> 选中需要修改的模块将其目录进行修改  即可...























