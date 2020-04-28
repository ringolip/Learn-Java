### Servlet

1. 创建JavaEE项目
	2. 定义一个类，实现Servlet接口
		* public class ServletDemo1 implements Servlet
	3. 实现接口中的抽象方法
	4. 配置Servlet



#### Servlet3.0

支持注解配置。可以不需要web.xml了



		1. 创建JavaEE项目，选择Servlet的版本3.0以上，可以不创建web.xml
		2. 定义一个类，实现Servlet接口
		3. 复写方法
		4. 在类上使用@WebServlet注解，进行配置
			* @WebServlet("资源路径")
---

#### IDEA与tomcat的相关配置

部署项目的配置文件夹路径：CATALINA_BASE

配置文件夹下的Catalina文件夹中有部署项目的路径

- 工作空间项目
  - 其中的web目录下的所有资源对应部署的web项目（但不是一个资源）

- Tomcat部署的web项目
  - 工作空间的out目录下
  - Tomcat真正的访问资源





---





查看端口的进程占用情况

```bash
lsof -i:端口号
```





