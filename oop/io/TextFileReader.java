package io;

public class TextFileReader extends TextReader{
    // オープするファイルのファイルパス
    private String filePath;

    // アクセス中のファイル番号を格納する変数
    private int fileNo;

    // コンストラクタ
    public TextFileReader(String filePath) {
        super();
        this.filePath = filePath;
    }

    // ファイルを開く
    @Override
    public void open() {
        fileNo = 100; // ファイル開いてファイル番号取得
        System.out.println(filePath + "ファイルを開いて" + fileNo + "を取得");
    }

    // データを読み込む
    @Override
    public char read() {
        System.out.println(fileNo + "からデータを読み込む");
        return 'a';
    }


    // ファイルを閉じる
    @Override
    public char close() {
        System.out.println(fileNo + "ファイルを閉じた");
        return 0;
    }
}
