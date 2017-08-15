# 基于OKHttpUtils的post请求二次封装
# 加入了网络请求的Log拦截打印
# 网络请求封装ProgressDialog，可自定义文字
# 请求参数<键值>非空判断




###   Step 1. Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ###  Step 2. Add the dependency
  
  	dependencies {
	        compile 'com.github.Everglowzz:OkHttpUtilsPost:1.0.5'
	}
