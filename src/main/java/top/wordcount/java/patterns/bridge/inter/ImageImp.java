package top.wordcount.java.patterns.bridge.inter;

import top.wordcount.java.patterns.bridge.base.Matrix;

/**
 * 抽象操作系统实现类：实现类接口
 */
public interface ImageImp {
    public void doPaint(Matrix m);  //显示像素矩阵m
}
