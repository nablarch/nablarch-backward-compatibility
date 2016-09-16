package nablarch.common.date;

import java.util.Date;
import java.util.Locale;

import nablarch.core.util.annotation.Published;

/**
 *
 * @deprecated バージョン5以降では、新しいパッケージの{@link nablarch.core.util.DateUtil}を使用すること。
 * @author T.Kawasaki
 */
@Deprecated
public class DateUtil {


    @Published
    public static Date getDate(String date) {
        return nablarch.core.util.DateUtil.getDate(date);
    }

    @Published
    public static String getMonthEndDate(String date) {
        return nablarch.core.util.DateUtil.getMonthEndDate(date);
    }

    @Published(tag = "architect")
    public static String formatDate(Date date, String format, Locale locale) {
        return nablarch.core.util.DateUtil.formatDate(date, format, locale);
    }

    @Published
    public static long getDays(String dateFrom, String dateTo) {
        return nablarch.core.util.DateUtil.getDays(dateFrom, dateTo);
    }

    @Published
    public static int getMonths(String monthFrom, String monthTo) {
        return nablarch.core.util.DateUtil.getMonths(monthFrom, monthTo);
    }

    @Published(tag = "architect")
    public static Date getParsedDate(String date, String format) {
        return nablarch.core.util.DateUtil.getParsedDate(date, format);
    }

    @Published(tag = "architect")
    public static String formatDate(Date date, String format) {
        return nablarch.core.util.DateUtil.formatDate(date, format);
    }

    @Published
    public static String formatDate(String date, String pattern) {
        return nablarch.core.util.DateUtil.formatDate(date, pattern);
    }

    @Published
    public static boolean isValid(String date, String format) {
        return nablarch.core.util.DateUtil.isValid(date, format);
    }

    @Published(tag = "architect")
    public static String getNumbersOnlyFormat(String yyyyMMddFormat) {
        return nablarch.core.util.DateUtil.getNumbersOnlyFormat(yyyyMMddFormat);
    }

    @Published
    public static String addDay(String date, int days) {
        return nablarch.core.util.DateUtil.addDay(date, days);
    }

    @Published
    public static boolean isValid(String date, String format, Locale locale) {
        return nablarch.core.util.DateUtil.isValid(date, format, locale);
    }

    @Published
    public static String addMonth(String date, int month) {
        return nablarch.core.util.DateUtil.addMonth(date, month);
    }

    @Published(tag = "architect")
    public static Date getParsedDate(String date, String format, Locale locale) {
        return nablarch.core.util.DateUtil.getParsedDate(date, format, locale);
    }
}
