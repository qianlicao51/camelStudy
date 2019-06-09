# camelStudy
camel -Spring学习

## 端口
1. 端口9000 是 `<property name="textline" value="true"/>` 好像是回车换行符作为发送结束
2. 端口9020 单纯的接受字符串 ，就可以使用串口工具测试


## 启动方式

### mina

```java
	public static void main(String[] args) {
		try {
			Main main = new Main();
			String[] arg = new String[] { "-ac", "app.xml" };
			main.run(arg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
```



```shell

Apache Camel Runner takes the following options

  -h or -help = Displays the help screen
  -r or -routers <routerBuilderClasses> = Sets the router builder classes which will be loaded while starting the camel context
  -d or -duration <duration> = Sets the time duration (seconds) that the application will run for before terminating.
  -dm or -durationMaxMessages <durationMaxMessages> = Sets the duration of maximum number of messages that the application will process before terminating.
  -di or -durationIdle <durationIdle> = Sets the idle time duration (seconds) duration that the application can be idle before terminating.
  -t or -trace = Enables tracing
  -e or -exitcode <exitcode> = Sets the exit code if duration was hit
  -watch or -fileWatch <fileWatch> = Sets a directory to watch for file changes to trigger reloading routes on-the-fly
  -ac or -applicationContext <applicationContext> = Sets the classpath based spring ApplicationContext
  -fa or -fileApplicationContext <fileApplicationContext> = Sets the filesystem based spring ApplicationContext

```

## Spring加载bean
	https://blog.csdn.net/bailinbbc/article/details/76446594
	

