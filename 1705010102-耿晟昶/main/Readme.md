**主程序**

1.使用Microsoft Visual Studio 2017开发，开发语言为C#

2.运行环境

windows平台

.Net Framework 4.6.1

3.功能描述

加载、编译、启用插件。

4.备注

主程序运行先检查运行环境，然后生成备份文件"Library.bin"，之后从"Plugins"目录获取插件，编译生成文件存放在"CompiledAssemblies"目录下，加载插件。在插件第一次运行完成后生成json文件。

主程序的每一次运行均在"Logs"目录下生成与时间对应的日志文件。