# 基于OKHttpUtils的post请求进行二次封装
# 加入了网络请求的Log拦截打印
# 请求参数的非空判断




###  Add it in your root build.gradle at the end of repositories:
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
