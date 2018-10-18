package io;

public class NetworkReader extends TextReader{

    // ネットワークをオープンする
    public void open() {
        System.out.println("ネットワークをオープンしました");
    }

    // ネットワークからデータを読み込む
    public char read() {
        System.out.println("ネットワークからデータを読み込む");
        return 'a';
    }


    // ネットワークを閉じる
    public char close() {
        System.out.println("ネットワークを閉じた");
        return 0;
    }
}
