package com.enum_class;

/**
 * https://www.zhihu.com/question/19908744
 * 
 * Java字节码格式并不禁止继承java.lang.Enum，但是javac编译器硬性不让你继承java.lang.Enum。
 * 改用Scala编译器轻松继承Enum：
 * class E(s:String, i:Int) extends Enum[E](s, i)
 */
public class EnumCopyImpl extends EnumCopy<EnumCopyImpl> {

}
