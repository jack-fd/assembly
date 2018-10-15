**项目说明** 
- Spring Boot 默认是单个jar包，需要打成部署结构的样子。
<br>

**环境需求** 
- maven-assembly-plugin
- maven-jar-plugin
- maven-compiler-plugin

<br>

**项目结构** 
```
assembly
├── pom.xml
├── src
│   └──main
│       ├── assembly
│       │   ├── bin    启动相关目录
│       │   │   ├── dump.sh     jdk常用命令
│       │   │   ├── server.sh   服务命令
│       │   │   ├── start.bat   启动程序(windows)
│       │   │   ├── start.sh    启动程序(linux)
│       │   │   └── stop.sh     停止程序(linux)
│       │   └── release.xml     编译配置参数
│       └── resources   配置文件目录
│           ├── application-dev.yml     总配置文件
│           ├── application-pro.yml     开发环境配置文件
│           ├── application-test.yml    测试环境配置文件
│           ├── application.yml         正式环境配置文件
│           └── logback-spring.xml      日志配置文件
└── target
    ├── assembly-1.0-SNAPSHOT.jar
    └── assembly-1.0-SNAPSHOT.tar.gz    安装包

```

<br>


**部署结构**
```
assembly     根目录
├── bin     命令目录
│   ├── dump.sh     jdk常用命令
│   ├── server.sh   服务命令
│   ├── start.bat   启动程序(windows)
│   ├── start.sh    启动程序(linux)
│   └── stop.sh     停止程序(linux)
├── conf    配置文件目录
│   ├── application.yml         总配置文件
│   ├── application-dev.yml     开发环境配置文件
│   ├── application-test.yml    测试环境配置文件
│   ├── application-pro.yml     正式环境配置文件
│   └── logback-spring.xml      日志配置文件
├── lib     依赖jar包
└── logs    日志目录
    ├── demo.log        日志文件
    └── stdout.log      命令行输出文件
``` 

<br>

**运行程序&停止程序**
 - 进入bin目录下
 - ./start.sh
 - .stop.sh
 
<br>

**运行环境更改**
- 修改conf/application.yml 文件
```
spring:
  profiles:
    active: dev     dev 开发环境, test 测试环境, pro 正式环境
```

<br>
