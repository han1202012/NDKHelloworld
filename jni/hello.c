#include <jni.h>

/*
 * 方法名称规定 : Java_完整包名类名_方法名()
 * JNIEnv 指针
 *
 * 参数介绍 :
 * env : 代表Java环境, 通过这个环境可以调用Java中的方法
 * thiz : 代表调用JNI方法的对象, 即MainActivity对象
 */
jstring Java_shuliang_han_ndkhelloworld_MainActivity_helloFromJNI(JNIEnv *env, jobject thiz)
{
	/*
	 * 调用 android-ndk-r9c\platforms\android-8\arch-arm\usr\include 中jni.h中的方法
	 * jni.h 中定义的方法  jstring (*NewStringUTF)(JNIEnv*, const char*);
	 */
	return (*env)->NewStringUTF(env, "hello world jni");
}
