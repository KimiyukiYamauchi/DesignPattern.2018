package io;

abstract public class TextReader {
    // オープン
    abstract public void open();
    // クローズ
    abstract public char close();
    // データを読み込む
    abstract public char read();
}
