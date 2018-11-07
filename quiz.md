# 課題

## 11/09
- 1109ディレクトリを作成し、以下のソースを格納し、GitHubのリポジトリへpush
- 格納するソースには以下も含める
	- Main => 動作確認
	- framework/Product
	- framework/Factory
- Factory Methodパターンの実装
- framwork/Factoryの実装
	- AccountFactory
		- createProduct -> 新しいアカウント(id/仮パスワード)作成(override)
		- registerProduct -> 作成済みのアカウント(id/パスワード)管理(override)
		- getAccounts -> アカウントのリストを返す(add)
- framwork/Productの実装
	- Account
		- use -> アカウントを使用した旨のメッセージ(override)
		- getAccount -> アカウントを返す(add)
		- getPassword -> パスワードを返す(add)
		- setPassword -> パスワードを設定する(add)


## 11/02
- 1102ディレクトリを作成
- Singletonクラスを改造して、インスタンスを3つ生成し、  
newInstanceでインスタンスを輪番で返す、Tripletonクラスを作成し、  
正しく動作することを確認する

## 10/26
- 1026ディレクトリを作成
- IDCardクラスにカード番号をつけ、Factoryクラス  
が番号と所有者の対応を管理するように修正する
- 修正箇所
	- IDCardFactoryのregisterProductの修正
	- IDCard
		- カード番号を格納する変数
		- コンストラクタの修正
		- カード番号を返すメソッド(getNo)

## 10/19
- 1019ディレクトリを作成
- 配列 => java.util.ArrayListに変更
- 予め本棚の大きさを指定しなくて良い

## 10/12
- 1012ディレクトリを作成
- "Hello World!"表示
- Main.java、Main.class