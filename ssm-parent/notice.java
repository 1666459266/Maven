/**
 *  maven是一个项目构建工具 用于依赖管理
 *      	传统的项目需要导入大量的jar包 项目过大
 *      	maven项目 当需要某一个jar包时 只需在maven项目中配置需要的jar包的坐标 maven根据坐标信息在maven仓库中查找jar包
 *      	坐标：公司名称+项目名称+版本信息
 *
 *  maven两大核心
 *      	依赖管理 对jar包的统一管理
 *      	项目构建 对项目进行编译 测试 打包 部署通过命令实现
 *
 *  maven需要依赖jdk
 *      bin 可执行的脚本文件
 *      boot 类加载器
 *      conf 配置文件
 *      lib maven运行需要的jar包
 *
 *  	本地仓库 在本机中的maven仓库
 *  	私服 在局域网内的一台服务器 存放jar包
 *  	中央仓库 在互联网存放了所有jar包
 *
 *  maven项目结构
 *      src 项目源码
 *          main（java目录-->java代码 resources目录-->配置文件 webapp-->静态资源）
 *          test（java目录-->单元测试类 resources目录-->配置文件）
 *      target 项目的源码编译之后存入target目录
 *      pom.xml maven项目核心配置文件
 *
 *  maven常用命令
 *      clean 清理target目录
 *      compile 将.java文件编译为.class文件
 *      test 单元测试以Test结尾的java文件
 *      package 打包 java project-->jar包 web project-->war包
 *      install 本地多个项目公用一个jar包 打包到本地仓库
 *
 *  maven的生命周期（三套生命周期相互独立 互不影响）（在一套生命周期内执行后面的命令 前面的操作会自动执行）
 *      CleanLifeCycle 清理生命周期 clean
 *      DefaultLifeCycle 默认生命周期 compile test package install deploy
 *      SiteLifeCycle 站点生命周期 site 生成html文档描述项目信息
 *
 *  	创建maven工程
 *  		修改maven默认版本 Windows-->Preferences-->Maven-->Installations
 *  		修改配置文件  Windows-->Preferences-->Maven-->User Settings
 *  		添加索引 Show Views-->Maven-->Maven Repositories-->Local Repositories-->Rebuild Index
 *      	Group Id 公司名称
 *      	Artifact Id 项目名称
 *      	Version 版本 SNAPSHOT测试版本 RELEASES正式版本
 *      	Packaging 打包方式 jar war pom（创建父工程）
 *      	Run As tomcat:run
 *      	Debug As tomcat:run
 *  
 *  	依赖范围 （默认是compile）
 *      	compile 对 编译 测试 运行 的classpath有效
 *      	test 对 测试 运行的classpath有效
 *      	provided 对 编译 测试 的classpath有效
 *      	runtime 对 测试 运行 的classpath有效
 *      	system 对 编译 测试 的classpath有效
 *  
 *  	传递依赖冲突
 *  		A依赖于B B依赖于C B是A的直接依赖 C是A的传递依赖
 *  		D依赖于C 当依赖的C版本不同时出现冲突
 *  maven的调节原则
 *  	第一声名者优先
 *  	路径近者优先（直接依赖级别高于传递依赖）
 *  	排除依赖 exclusions排除依赖
 *  	版本锁定 dependencyManagement指定项目中依赖的版本
 *  	使用properties提取常量	${}
 *  
 *   	项目拆分
 *  		dao service controller的代码以及配置文件提取到一个独立的工程中
 *  		对拆分之后的项目进行聚合
 *  			Maven-parent(父工程)
 *  				Maven-dao(子模块)
 *  				Maven-service(子模块)
 *  				Maven-web(子模块)
 *  		创建父工程 打包方式 pom 
 *  			父工程只有pom文件 不进行编码
 *  			定义项目需要的依赖信息
 *  			聚合各个子模块
 *  			将创建好的父工程发布到本地仓库
 *  		创建子模块 选择 Maven Module 打包方式 jar
 *  			在service中导入dao依赖
 *  			在web中导入service依赖
 *  			web模块打包方式为war包
 *  	单元测试 批量加载spring配置文件
 *  	传递依赖的范围有限 项目需要的某一个jar包没有传递时 在本工程中添加对应的依赖
 *  	运行方式
 *  		运行父工程
 *  		运行ssm-web工程
 *  
 *  	私服
 *  		私服安装
 *  			以管理员身份 nexus install
 *  			启动服务 nexus start
 *  			私服的url localhost:8081/nexus
 *  			登录 admin/admin123
 *  		仓库类型
 *  			Hosted 宿主仓库 存放本公司开发的jar包（SNAPSHOT RELEASES 第三方jar包）
 *  			Proxy 代理仓库 代理中央仓库
 *  			Group 组仓库 包含Hosted Proxy
 *  			Virtual 虚拟仓库 
 *  		上传jar包到私服
 *  			认证：settings.xml配置用户名密码
 *  			在将要上传的项目的pom.xml配置jar包上传路径url
 *  			执行命令上发布到私服 deploy
 *  		下载jar包到本地
 *  			settings.xml配置模板
 *  			激活模板
 */