这是学习Spring Boot构建的第一个小项目

学习笔记：
1.项目工程结构解析：
  Spring Boot的基础结构有三大块：
  (1)src/main/java/com.learning.demo:
     Demo1Application主程序入口，可以通过运行该类来启动Spring Boot应用；
	 config包：Spring Boot中JPA的配置（使用MySQL数据库配置），配置参数注释在代码中；
	 domain包:包含数据实体，具体细节在注释中；
	 repository包:实体的存储库接口，有了接口就可以实现实体的持久化；
	 controller包：控制器，这个例子中实现一个简单的控制器；
  
  (2)src/main/resources:配置目录，用来存放配置信息，比如应用名、服务端口、数据库链接等，由于引入web模块，因此产生了static目录和templates目录
     static：存放静态资源，如图片、css、JavaSript等
	 templates：存放Web页面的模板文件
  (3)src/test/:单元测试目录，可以直接运行Spring Boot 应用的测试。
 
 2.配置参数：
   详细的配置先注释在代码中。
    
  