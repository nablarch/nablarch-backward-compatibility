package nablarch.common.handler;

/**
 * 後続のハンドラの実行が終了した後に、
 * カレントスレッド上で管理されているファイルレコードライタ（{@link nablarch.core.dataformat.FileRecordWriter}）が保持するストリームのクローズ
 * およびDataRecordWriterのインスタンスを削除するクラス。
 * 
 * @author Masato Inoue
 * @author T.Kawasaki
 * @deprecated バージョン5以降では、新しいパッケージの{@link nablarch.common.io.FileRecordWriterDisposeHandler}を使用すること。
 */
@Deprecated
public class FileRecordWriterDisposeHandler extends nablarch.common.io.FileRecordWriterDisposeHandler {
}
