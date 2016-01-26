# ReactNative 初探

> 官方网址：https://facebook.github.io/react-native/

> 中文官网：http://reactnative.cn/ 文档教程更新较慢，往往都是旧版本api的使用方法

> 中文论坛：http://bbs.reactnative.cn/

&emsp;&emsp;在搭建好ReactNative开发环境之后，就可以正式开始使用ReactNative来开发App了。


&emsp;&emsp;

## 为何需要ReactNative？

**`Web App`** &emsp; **`Native App`** &emsp;  **`Hybrid App`**


> What we really want is the **user experience** of the native mobile platforms, combined with the developer experience we have when building with React on the web.The focus of ReactNative is on developer efficiency across all the platforms you care about — **learn once, write anywhere**

&emsp;&emsp;上面是摘自官方网站的一段话，主要传达的是ReactNative想要做的是**在拥有Native的良好用户体验的同时保留React的开发效率**。

&emsp;&emsp;还有一段话说的是ReactNative期望的是**一次学习，任何平台上编写**，它并没有强调**一次编码，处处运行**（实际上它也做不到-_-），官方给了一个感觉不太自信的理由：因为各个平台的体验是不一样的。

## 什么是ReactNative?



## 开发工具

&emsp;&emsp;俗话说的好，公欲善其事，必先利其器。下面推荐两个开发React Native的IDE。

* Atom nuclide-installer插件
* WebStorm 11

## 先看一个Demo

源码：[https://github.com/QYQ/ReactnativeDemo](https://github.com/QYQ/ReactnativeDemo)

## 样式

&emsp;&emsp;使用StyleSheet.create()方法来创建样式表。

	var styles = StyleSheet.create({
	  base: {
	    width: 38,
	    height: 38,
	  },
	  background: {
	    backgroundColor: '#222222',
	  },
	  active: {
	    borderWidth: 2,
	    borderColor: '#00ff00',
	  },
	});

&emsp;&emsp;所有的ReactNative核心组件都可以接受style属性：

	<Text style={styles.base} />
	<View style={styles.background} />


## 常用组件

### View

### Text

* onPress
* numberOfLInes:最多显示多少行，超过显示 ...
* onLayout

### TextInput

&emsp;&emsp;输入框组件，它支持的属性如下：

* autoCapitalize:枚举类型，可选值：none,sentences,words,characters。当用户输入的时候用于提示。
* placeholder：占位符
* value：文本输入框的默认值
* placeholderTextColor：占位符文本的颜色
* passworkd：true/false
* multiline：true/false
* editable:true/false，文本框是否可输入
* autoFouces：true/false，自动获取焦点
* clearButtonMode：枚举类型，可选值有never,while-editing,unliss-editing,always，用于显示清除按钮
* maxLength：能够输入的最长字符数
* enablesReturnKeyAutomatically:true/false，如果没有文本时键盘是不能有返回键的
* returnKeyType：枚举类型，可选值：default,go,google,join,next,route,search,send,yahoo,done,emergency-call。表示软键盘返回键显示的字符串
* secureTextEntry:true/false，向密码框一样隐藏输入内容
* onChangeText：当文本输入框内容发生变化的时候，会调用这个函数。onChangeText接收一个文本的参数对象
* onChange：当文本变化时，调用该函数
* onEndEditing：当结束编辑时，调用该函数。
* onBlur：失去焦点触发该函数
* onFocus：获得焦点时触发该函数
* onSubmitEditing：当结束编辑时，点击键盘的提交按钮触发该事件

### Touchable 

&emsp;&emsp;Text组件可以由onPress来响应点击事件，为了使其它组件也可以像Text组件一样也可以有点击响应，ReactNative提供了Touchable类组件，包括以下三个组件：
	
* TouchableHighlight：高亮触摸，其支持的属性如下：
	* activeOpacity：触摸时透明度的设置
	* onHideUnderlay：隐藏背景阴影时触发该事件
	* onShowUnderlay：显示背景阴影时触发该事件
	* underlayColor：点击时背景阴影效果的背景颜色

&emsp;&emsp;具体使用方法如下：

	<TouchableHighlight onPress={this._onPressButton}>
      <Image
        style={styles.button}
        source={require('./button.png')}
      />
    </TouchableHighlight>

&emsp;&emsp;在需要获取点击事件的组件的外层嵌套一层 `<TouchableHighlight>` 即可。

* TouchableOpacity：透明触摸，不用设置背景颜色，使用方式同上，只改变组件的透明度，不改变颜色，它只有一个属性activeOpacity
	* activeOpacity：指定点击时候的透明度
* TouchableWithoutFeedback：无反馈触摸（官方不推荐使用）
	* onLongPress
	* onPressIn
	* onPressOut

### Image

&emsp;&emsp;Image组件可以显示的图片包括网络图片，本地磁盘图片，相册中的图片，它支持的属性如下：

* resizeMode：枚举类型cover,contain,stretch。表示图片适应的模式。
* source：图片的引用地址，其值为 `{url:String}` ,如果是一张本地图片，需要使用require('image!name')包裹。
* defaultSource:默认图片 仅IOS
* onLoad 仅IOS
* onLoadEnd 仅IOS
* onLoadStart 仅IOS
* onProgress 仅IOS

### WebView组件

## 常用Api

### AppRegistry
	
注册入口组件

### AsyncStorage

保存及获取键值对数据

### PixelRatio

### NetInfo

### CameraRoll

### Geolocation

### 动画

## 网络请求

### XMLHttpRequest

### Fetch

### 定时器

## 自定义封装原生UI组件

### UI的事件传递

## 自定义封装原生模块

## js与java的互相调用

## Android工程的打包

## 思想

&emsp;&emsp;ReactNative遵循了Flux模式。

![flux](img/flux.png)

## 基于Activity，如果基于Fragment，可能会有问题

## 仅支持Anddroid4.1及以上

## 启动ReactNative App入口的时候，即实例化RectnativeContext上下文的时候， 会把所有的NativeModule（包括自定义的Module和所有的React内置的coreModule），这些实例对象全都保存在了内存中。



## 跟58APP现有Web+Native框架相比

## ReatNative是完美的么？

&emsp;&emsp;基于目前58APP的现状，ReactNative暂不适合引入到58APP中。以上结论是基于以下主观因素考虑：

* ReactNative for Android 暂不成熟。官方源码更新频率很快，支持的Android原生特性还很有限（比如？）TODO
* ReactNative仅支持Android4.1及以上系统
* ReactNative依赖了众多第三方库，比如fresco、okhttp等，虽然都是些很成熟的第三方框架，但是对于一个相对成熟的app来说，已经有了比较可靠的图片、网络、文件等模块。这些依赖在一定程度上增大了app的体积，且作用仅限于reactnative模块。解决上述问题可以精简reactnative框架，剔除可用现有app中模块来代替的第三方依赖，修改reactnative框架，使用app现有相关模块。但这样改造的成本略大。
* ReactNative依赖的so库，只支持armeabi-v71和x86两个处理器平台。
* 把所有的上下文模块都装载到了内存里面，内存可能产品问题
* 跟原生性能相比还是有差距，主要是因为在js与java互相调用

## 使用ReactNative需要做的事？

* 集成ReactNative framework到项目中
	* **剔除无用的第三方库依赖（6-7MB），减少依赖体积**
	* 集成react需要的各种package到项目中(node_modules)
* **封装Native原生模块**（ReactNative没有提供的，或者提供了，但是有缺陷）
	* UI组件
		* ListView：ReactNative提供的在性能上有缺陷
		* 各种自定义View
		* ......
	* 原生功能模块
		* 网络模块
		* 埋点模块
		* ......
* Web+Native开发方式的转变
	* **Native需要在封装Native原生模块的基础上为FE暴露接口API，FE学习API的使用，以及React的使用**
	* 开发环境下从静态服务器（FE维护）拉取javascript，方便调试
	* **生产环境下需要开发**
	* 业务逻辑切换到使用js来实现