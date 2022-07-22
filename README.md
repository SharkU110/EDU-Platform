# EDU-Platform
这里是武科大生产实习项目。

<br>

## 开发中使用的工具

1. IDEA 2017
2. Navicat
3. Visual Studio Code
4. Github Desktop

<br>

GitHub仓库

![image](https://img2022.cnblogs.com/blog/2402449/202207/2402449-20220722200230515-2056657368.png)

<br>

## Github Desktop初步使用

![image](https://img2022.cnblogs.com/blog/2402449/202207/2402449-20220722200847947-1939960836.png)

我们在对仓库中的文件进行修改后，就可以打开GitHub Desktop，先输入“提交描述”——这是说明你这次的修改的原因和目的，然后“Commit to main”，再“Push Origin”。

当然了，没有“Commit to main”前，右上角那个区域是“Fetch Origin”，它的功能是从远处仓库拉取所有修改。

“Push Origin”和“Fetch Origin”的使用顺序应该没有影响。

## GitHub访问慢的解决

进入”C:\Windows\System32\drivers\etc“路径下的`hosts文件，

修改GitHub相关域名解析，添加如下行

```
140.82.113.3 github.com
185.199.108.153 assets-cdn.github.com
199.232.69.194 github.global.ssl.fastly.net
```

上面的IP是通过https://www.ipaddress.com/这个网站得到的

最后，cmd执行`ipconfig/flushdns`
