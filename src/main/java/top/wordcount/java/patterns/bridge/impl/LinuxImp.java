package top.wordcount.java.patterns.bridge.impl;

import top.wordcount.java.patterns.bridge.base.Matrix;
import top.wordcount.java.patterns.bridge.inter.ImageImp;

public class LinuxImp  implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用Linux系统的绘制函数绘制像素矩阵
        System.out.print("在Linux操作系统中显示图像：");
    }
}
