package shuliang.han.ndkhelloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	//静态代码块加载C语言库文件
	static{
		System.loadLibrary("hello");
	}
	
	/*
	 * 声明一个native方法
	 * 这个方法在Java中是没有实现的, 没有方法体
	 * 该方法需要使用C语言编写
	 */
	public native String helloFromJNI();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(helloFromJNI());
    }

    public void onClick(View view) {
    	//点击按钮显示从jni调用得到的字符串信息
    	Toast.makeText(getApplicationContext(), helloFromJNI(), 1).show();
	}
    
}
