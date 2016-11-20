package com.lodz.android.designpatterndemo.designpattern.prototype;

/**
 * 克隆的深复制和浅复制
 * Created by zhouL on 2016/11/20.
 */

public interface ReadMe {

/**
 * 克隆分为浅复制（copy）和深复制（clone）
 *
 * 如果类里面只有基本变量（例如int、String类型），则克隆时不会出现数据重复
 *
 * 如果类里面还包含了其他的类的对象，则浅复制只会复制其指针，导致修改后其他的克隆类也会跟着修改。
 * 需要进行深复制才能避免该问题，至于要克隆到多深（即有哪些类的对象是需要深克隆的哪些是不需要的），
 * 需要使用者自己确定。
 */

}
