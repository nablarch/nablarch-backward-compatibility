package nablarch.fw;

/**
 * 業務処理が異常終了したことを示す例外クラス。
 *
 * @author hisaaki sioiri
 * @deprecated {@link nablarch.fw.results.TransactionAbnormalEnd}
 */
@Deprecated
public class TransactionAbnormalEnd extends nablarch.fw.results.TransactionAbnormalEnd {

    /**
     * 指定されたメッセージIDとオプションを元に例外を構築する。
     *
     * @param exitCode 終了コード(プロセスを終了({@link System#exit(int)})する際に設定する値)
     * @param failureCode 障害コード
     * @param messageOptions 障害コードからメッセージを取得する際に使用するオプション情報
     */
    public TransactionAbnormalEnd(int exitCode, String failureCode, Object... messageOptions) {
        super(exitCode, failureCode, messageOptions);
    }

    public TransactionAbnormalEnd(int exitCode, Throwable error, String failureCode, Object... messageOptions) {
        super(exitCode, error, failureCode, messageOptions);
    }
}
