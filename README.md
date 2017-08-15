## 基于OKHttpUtils的post请求二次封装
## 加入了网络请求的Log拦截打印
## 网络请求封装ProgressDialog，可自定义文字
## 请求参数<键值>非空判断




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



###  调用方式

        
        new RequestNetWork<UserInfoBean>(context).request(map, GlobalConfig.LOGIN_URl, new HttpCallBack<UserInfoBean>() {
            @Override
            public void onSuccess(UserInfoBean result) {
                if (mUnSubscribe) return;
                view.toMainActivity(result);
                view.toastMessage(result);
            }
            @Override
            public void onFailure(String error) {
                if (mUnSubscribe) return;
            }
        },UserInfoBean.class,"正在登录..");
	
###  参数介绍

     @param map  参数集合
     @param URL  访问接口
     @param callback  网络请求回调，直接使用已封装好的 HttpCallBack
     @param type  json解析的对象类型，以class类型传入
     @param message 请求弹窗的文字显示，默认显示（正在加载...）
     @param isShow 是否显示请求弹窗，默认显示
     
     
