### maven-assembly

支持定制化打包方式，例如 apache 项目的打包方式

#### id

id 标识符，添加到生成文件名称的后缀符。如果指定 id 的话，目标文件则是 {artifactId}-{id}.tar.gz

#### formats

maven-assembly-plugin 支持的打包格式有zip、tar、tar.gz (or tgz)、tar.bz2 (or tbz2)、jar、dir、war，可以同时指定多个打包格式

#### dependencySets

用来定制工程依赖 jar 包的打包方式，核心元素如下表所示。

outputDirectory String 指定包依赖目录，该目录是相对于根目录
includes/include*    List<String>    包含依赖
excludes/exclude*    List<String>    排除依赖

#### fileSets

管理一组文件的存放位置，核心元素如下表所示。

元素 类型 作用
outputDirectory String 指定文件集合的输出目录，该目录是相对于根目录
includes/include*    List<String>    包含文件
excludes/exclude*    List<String>    排除文件
fileMode String 指定文件属性，使用八进制表达，分别为(User)(Group)(Other)所属属性，默认为 0644

#### files

可以指定目的文件名到指定目录，其他和 fileSets 相同，核心元素如下表所示。

元素 类型 作用
source String 源文件，相对路径或绝对路径
outputDirectory String 输出目录
destName String 目标文件名
fileMode String 设置文件 UNIX 属性
