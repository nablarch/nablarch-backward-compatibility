package nablarch.core.util;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JapaneseCharsetUtilTest {

    @Test
    public void testGetAsciiChars() {
        String asciiChars = JapaneseCharsetUtil.getAsciiChars();
        assertEquals(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~", asciiChars);
    }

    @Test
    public void testGetHankanaChars() {
        String result = JapaneseCharsetUtil.getHankakuKanaChars();
        assertEquals('｡', result.charAt(0));
        assertEquals('ﾟ', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetNecSymbolChars() {
        String result = JapaneseCharsetUtil.getNecSymbolChars();
        assertThat(result, containsString("①②③④⑤⑥⑦⑧⑨⑩⑪⑫⑬⑭⑮⑯⑰⑱⑲⑳"));
        assertThat(result, containsString("∪"));
    }

    @Test
	public void testGetJisSymbolChars() {

        String result = JapaneseCharsetUtil.getJisSymbolChars();
        assertEquals('　', result.charAt(0));
        assertEquals('◯', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetZenkakuNumChars() {
        String result = JapaneseCharsetUtil.getZenkakuNumChars();
        assertEquals("０１２３４５６７８９", result);
    }
    
    @Test
    public void testGetZenkakuAlphaChars() {
        String result = JapaneseCharsetUtil.getZenkakuAlphaChars();
        assertEquals('Ａ', result.charAt(0));
        assertEquals('ｚ', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetZenkakuHiraganaChars() {
        String result = JapaneseCharsetUtil.getZenkakuHiraganaChars();
        assertEquals('ぁ', result.charAt(0));
        assertEquals('ん', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetZenkakuKatakanaChars() {
        String result = JapaneseCharsetUtil.getZenkakuKatakanaChars();
        assertEquals('ァ', result.charAt(0));
        assertEquals('ヶ', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetZenkakuGreekChars() {
        String result = JapaneseCharsetUtil.getZenkakuGreekChars();
        assertEquals('Α', result.charAt(0));
        assertEquals('ω', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetZenkakuRussianChars() {
        String result = JapaneseCharsetUtil.getZenkakuRussianChars();
        assertEquals('А', result.charAt(0));
        assertEquals('я', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetZenkakuKeisenChars() {
        String result = JapaneseCharsetUtil.getZenkakuKeisenChars();
        assertEquals('─', result.charAt(0));
        assertEquals('╂', result.charAt(result.length() - 1));
    }

    @Test
    public void testGetNecExtendedChars() {
        String result = JapaneseCharsetUtil.getNecExtendedChars();
        // 89区
        assertTrue(result.indexOf('纊') >= 0);
        assertTrue(result.indexOf('刕') >= 0);
        assertTrue(result.indexOf('德') >= 0);
        // 90区
        assertTrue(result.indexOf('忞') >= 0);
        assertTrue(result.indexOf('暠') >= 0);
        assertTrue(result.indexOf('犱') >= 0);
        // 91区
        assertTrue(result.indexOf('絜') >= 0);
        assertTrue(result.indexOf('鐱') >= 0);
        assertTrue(result.indexOf('＂') >= 0);
    }

    @Test
    public void testGetIbmExtendedChars() {
        String result = JapaneseCharsetUtil.getIbmExtendedChars();
        // 115区
        assertTrue(result.indexOf('ⅰ') >= 0);
        assertTrue(result.indexOf('℡') >= 0);
        assertTrue(result.indexOf('墲') >= 0);
        // 116区
        assertTrue(result.indexOf('夋') >= 0);
        assertTrue(result.indexOf('擎') >= 0);
        assertTrue(result.indexOf('浯') >= 0);
        // 117区
        assertTrue(result.indexOf('涖') >= 0);
        assertTrue(result.indexOf('珒') >= 0);
        assertTrue(result.indexOf('薰') >= 0);
        // 118区
        assertTrue(result.indexOf('蘒') >= 0);
        assertTrue(result.indexOf('鈹') >= 0);
        assertTrue(result.indexOf('髙') >= 0);
        // 119区
        assertTrue(result.indexOf('髜') >= 0);
        assertTrue(result.indexOf('鮱') >= 0);
        assertTrue(result.indexOf('黑') >= 0);
        
    }

    @Test
    public void testGetLevel1Kanji() {
        String result = JapaneseCharsetUtil.getLevel1Kanji();
        // 第16区
        assertTrue(result.indexOf('亜') >= 0);
        assertTrue(result.indexOf('闇') >= 0);
        assertTrue(result.indexOf('蔭') >= 0);
        // 第17区
        assertTrue(result.indexOf('院') >= 0);
        assertTrue(result.indexOf('映') >= 0);
        assertTrue(result.indexOf('応') >= 0);
        // 第18区
        assertTrue(result.indexOf('押') >= 0);
        assertTrue(result.indexOf('嫁') >= 0);
        assertTrue(result.indexOf('改') >= 0);
        // 第19区
        assertTrue(result.indexOf('魁') >= 0);
        assertTrue(result.indexOf('各') >= 0);
        assertTrue(result.indexOf('萱') >= 0);
        // 第20区
        assertTrue(result.indexOf('粥') >= 0);
        assertTrue(result.indexOf('竿') >= 0);
        assertTrue(result.indexOf('棄') >= 0);
        // 第21区
        assertTrue(result.indexOf('機') >= 0);
        assertTrue(result.indexOf('菊') >= 0);
        assertTrue(result.indexOf('京') >= 0);
        // 第22区
        assertTrue(result.indexOf('供') >= 0);
        assertTrue(result.indexOf('局') >= 0);
        assertTrue(result.indexOf('屈') >= 0);
        // 第23区
        assertTrue(result.indexOf('掘') >= 0);
        assertTrue(result.indexOf('敬') >= 0);
        assertTrue(result.indexOf('捲') >= 0);
        // 第24区
        assertTrue(result.indexOf('検') >= 0);
        assertTrue(result.indexOf('固') >= 0);
        assertTrue(result.indexOf('向') >= 0);
        // 第25区
        assertTrue(result.indexOf('后') >= 0);
        assertTrue(result.indexOf('紅') >= 0);
        assertTrue(result.indexOf('込') >= 0);
        // 第26区
        assertTrue(result.indexOf('此') >= 0);
        assertTrue(result.indexOf('哉') >= 0);
        assertTrue(result.indexOf('刷') >= 0);
        // 第27区
        assertTrue(result.indexOf('察') >= 0);
        assertTrue(result.indexOf('使') >= 0);
        assertTrue(result.indexOf('時') >= 0);
        // 第28区
        assertTrue(result.indexOf('次') >= 0);
        assertTrue(result.indexOf('芝') >= 0);
        assertTrue(result.indexOf('周') >= 0);
        // 第29区
        assertTrue(result.indexOf('宗') >= 0);
        assertTrue(result.indexOf('夙') >= 0);
        assertTrue(result.indexOf('償') >= 0);
        // 第30区
        assertTrue(result.indexOf('勝') >= 0);
        assertTrue(result.indexOf('焦') >= 0);
        assertTrue(result.indexOf('飾') >= 0);
        // 第31区
        assertTrue(result.indexOf('拭') >= 0);
        assertTrue(result.indexOf('診') >= 0);
        assertTrue(result.indexOf('裾') >= 0);
        // 第32区
        assertTrue(result.indexOf('澄') >= 0);
        assertTrue(result.indexOf('脆') >= 0);
        assertTrue(result.indexOf('線') >= 0);
        // 第33区
        assertTrue(result.indexOf('繊') >= 0);
        assertTrue(result.indexOf('組') >= 0);
        assertTrue(result.indexOf('憎') >= 0);
        // 第34区
        assertTrue(result.indexOf('臓') >= 0);
        assertTrue(result.indexOf('打') >= 0);
        assertTrue(result.indexOf('只') >= 0);
        // 第35区
        assertTrue(result.indexOf('叩') >= 0);
        assertTrue(result.indexOf('暖') >= 0);
        assertTrue(result.indexOf('寵') >= 0);
        // 第36区
        assertTrue(result.indexOf('帖') >= 0);
        assertTrue(result.indexOf('槌') >= 0);
        assertTrue(result.indexOf('逓') >= 0);
        // 第37区
        assertTrue(result.indexOf('邸') >= 0);
        assertTrue(result.indexOf('吐') >= 0);
        assertTrue(result.indexOf('到') >= 0);
        // 第38区
        assertTrue(result.indexOf('董') >= 0);
        assertTrue(result.indexOf('独') >= 0);
        assertTrue(result.indexOf('入') >= 0);
        // 第39区
        assertTrue(result.indexOf('如') >= 0);
        assertTrue(result.indexOf('波') >= 0);
        assertTrue(result.indexOf('麦') >= 0);
        // 第40区
        assertTrue(result.indexOf('函') >= 0);
        assertTrue(result.indexOf('犯') >= 0);
        assertTrue(result.indexOf('美') >= 0);
        // 第41区
        assertTrue(result.indexOf('鼻') >= 0);
        assertTrue(result.indexOf('蛭') >= 0);
        assertTrue(result.indexOf('服') >= 0);
        // 第42区
        assertTrue(result.indexOf('福') >= 0);
        assertTrue(result.indexOf('文') >= 0);
        assertTrue(result.indexOf('朋') >= 0);
        // 第43区
        assertTrue(result.indexOf('法') >= 0);
        assertTrue(result.indexOf('貿') >= 0);
        assertTrue(result.indexOf('満') >= 0);
        // 第44区
        assertTrue(result.indexOf('漫') >= 0);
        assertTrue(result.indexOf('耗') >= 0);
        assertTrue(result.indexOf('癒') >= 0);
        // 第45区
        assertTrue(result.indexOf('諭') >= 0);
        assertTrue(result.indexOf('庸') >= 0);
        assertTrue(result.indexOf('璃') >= 0);
        // 第46区
        assertTrue(result.indexOf('痢') >= 0);
        assertTrue(result.indexOf('糧') >= 0);
        assertTrue(result.indexOf('聯') >= 0);
        // 第47区
        assertTrue(result.indexOf('蓮') >= 0);
        assertTrue(result.indexOf('聾') >= 0);
        assertTrue(result.indexOf('腕') >= 0);

    }


    @Test
    public void testGetLevel2Kanji() {
        String result = JapaneseCharsetUtil.getLevel2Kanji();
        // 第48区
        assertTrue(result.indexOf('弌') >= 0);
        assertTrue(result.indexOf('估') >= 0);
        assertTrue(result.indexOf('傲') >= 0);
        // 第49区
        assertTrue(result.indexOf('僉') >= 0);
        assertTrue(result.indexOf('冏') >= 0);
        assertTrue(result.indexOf('辨') >= 0);
        // 第50区
        assertTrue(result.indexOf('辧') >= 0);
        assertTrue(result.indexOf('卮') >= 0);
        assertTrue(result.indexOf('咨') >= 0);
        // 第51区
        assertTrue(result.indexOf('咫') >= 0);
        assertTrue(result.indexOf('喇') >= 0);
        assertTrue(result.indexOf('圉') >= 0);
        // 第52区
        assertTrue(result.indexOf('圈') >= 0);
        assertTrue(result.indexOf('堡') >= 0);
        assertTrue(result.indexOf('奩') >= 0);
        // 第53区
        assertTrue(result.indexOf('奸') >= 0);
        assertTrue(result.indexOf('嬌') >= 0);
        assertTrue(result.indexOf('屓') >= 0);
        // 第54区
        assertTrue(result.indexOf('屐') >= 0);
        assertTrue(result.indexOf('嶷') >= 0);
        assertTrue(result.indexOf('廏') >= 0);
        // 第55区
        assertTrue(result.indexOf('廖') >= 0);
        assertTrue(result.indexOf('徃') >= 0);
        assertTrue(result.indexOf('悚') >= 0);
        // 第56区
        assertTrue(result.indexOf('悄') >= 0);
        assertTrue(result.indexOf('愴') >= 0);
        assertTrue(result.indexOf('戛') >= 0);
        // 第57区
        assertTrue(result.indexOf('戞') >= 0);
        assertTrue(result.indexOf('挌') >= 0);
        assertTrue(result.indexOf('撼') >= 0);
        // 第58区
        assertTrue(result.indexOf('據') >= 0);
        assertTrue(result.indexOf('敝') >= 0);
        assertTrue(result.indexOf('暼') >= 0);
        // 第59区
        assertTrue(result.indexOf('曄') >= 0);
        assertTrue(result.indexOf('柧') >= 0);
        assertTrue(result.indexOf('棍') >= 0);
        // 第60区
        assertTrue(result.indexOf('棔') >= 0);
        assertTrue(result.indexOf('榿') >= 0);
        assertTrue(result.indexOf('檣') >= 0);
        // 第61区
        assertTrue(result.indexOf('檗') >= 0);
        assertTrue(result.indexOf('殄') >= 0);
        assertTrue(result.indexOf('沾') >= 0);
        // 第62区
        assertTrue(result.indexOf('沺') >= 0);
        assertTrue(result.indexOf('渫') >= 0);
        assertTrue(result.indexOf('滌') >= 0);
        // 第63区
        assertTrue(result.indexOf('漾') >= 0);
        assertTrue(result.indexOf('瀏') >= 0);
        assertTrue(result.indexOf('燼') >= 0);
        // 第64区
        assertTrue(result.indexOf('燹') >= 0);
        assertTrue(result.indexOf('猗') >= 0);
        assertTrue(result.indexOf('珱') >= 0);
        // 第65区
        assertTrue(result.indexOf('瓠') >= 0);
        assertTrue(result.indexOf('疊') >= 0);
        assertTrue(result.indexOf('癰') >= 0);
        // 第66区
        assertTrue(result.indexOf('癲') >= 0);
        assertTrue(result.indexOf('眸') >= 0);
        assertTrue(result.indexOf('磬') >= 0);
        // 第67区
        assertTrue(result.indexOf('磧') >= 0);
        assertTrue(result.indexOf('稠') >= 0);
        assertTrue(result.indexOf('筐') >= 0);
        // 第68区
        assertTrue(result.indexOf('筺') >= 0);
        assertTrue(result.indexOf('簀') >= 0);
        assertTrue(result.indexOf('紆') >= 0);
        // 第69区
        assertTrue(result.indexOf('紂') >= 0);
        assertTrue(result.indexOf('綰') >= 0);
        assertTrue(result.indexOf('缺') >= 0);
        // 第70区
        assertTrue(result.indexOf('罅') >= 0);
        assertTrue(result.indexOf('翩') >= 0);
        assertTrue(result.indexOf('腋') >= 0);
        // 第71区
        assertTrue(result.indexOf('隋') >= 0);
        assertTrue(result.indexOf('膓') >= 0);
        assertTrue(result.indexOf('苙') >= 0);
        // 第72区
        assertTrue(result.indexOf('茵') >= 0);
        assertTrue(result.indexOf('菷') >= 0);
        assertTrue(result.indexOf('蕈') >= 0);
        // 第73区
        assertTrue(result.indexOf('蕁') >= 0);
        assertTrue(result.indexOf('蘿') >= 0);
        assertTrue(result.indexOf('蝙') >= 0);
        // 第74区
        assertTrue(result.indexOf('蝓') >= 0);
        assertTrue(result.indexOf('蠧') >= 0);
        assertTrue(result.indexOf('襞') >= 0);
        // 第75区
        assertTrue(result.indexOf('襦') >= 0);
        assertTrue(result.indexOf('詒') >= 0);
        assertTrue(result.indexOf('譫') >= 0);
        // 第76区
        assertTrue(result.indexOf('譟') >= 0);
        assertTrue(result.indexOf('貲') >= 0);
        assertTrue(result.indexOf('蹊') >= 0);
        // 第77区
        assertTrue(result.indexOf('蹇') >= 0);
        assertTrue(result.indexOf('軫') >= 0);
        assertTrue(result.indexOf('迸') >= 0);
        // 第78区
        assertTrue(result.indexOf('遏') >= 0);
        assertTrue(result.indexOf('酣') >= 0);
        assertTrue(result.indexOf('錮') >= 0);
        // 第79区
        assertTrue(result.indexOf('錙') >= 0);
        assertTrue(result.indexOf('鑄') >= 0);
        assertTrue(result.indexOf('陞') >= 0);
        // 第80区
        assertTrue(result.indexOf('陝') >= 0);
        assertTrue(result.indexOf('霰') >= 0);
        assertTrue(result.indexOf('顰') >= 0);
        // 第81区
        assertTrue(result.indexOf('顱') >= 0);
        assertTrue(result.indexOf('馮') >= 0);
        assertTrue(result.indexOf('髷') >= 0);
        // 第82区
        assertTrue(result.indexOf('髻') >= 0);
        assertTrue(result.indexOf('鯣') >= 0);
        assertTrue(result.indexOf('鵈') >= 0);
        // 第83区
        assertTrue(result.indexOf('鵝') >= 0);
        assertTrue(result.indexOf('麋') >= 0);
        assertTrue(result.indexOf('龠') >= 0);
        // 第84区
        assertTrue(result.indexOf('堯') >= 0);
        assertTrue(result.indexOf('瑤') >= 0);
        assertTrue(result.indexOf('熙') >= 0);
    }    
}
