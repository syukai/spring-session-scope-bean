# これはなに？
@SessionScopeを使ってセッション情報を使うデモ用のサンプル実装

## 動機
SpringMVCを使うときにHttpServletRequestやHttpSessionなど、Servletの実装に依存しない形でセッション情報を扱いたい！

## ざっくり
@SessionScope と @Component をつけたBeanをセッション情報を扱いたいクラスにインジェクションすれば扱えるよ。
