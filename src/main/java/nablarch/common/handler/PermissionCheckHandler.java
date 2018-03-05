// MOVE: commonをモジュール分割したので、nablarch.common.handlerから移動
package nablarch.common.handler;

/**
 * 認可判定を行うハンドラ。
 *
 * @author Kiyohito Itoh
 * @deprecated バージョン5以降では、新しいパッケージの{@link nablarch.common.permission.PermissionCheckHandler}を使用すること。
 */
@Deprecated
public class PermissionCheckHandler extends nablarch.common.permission.PermissionCheckHandler {
}
