package com.eltafseer;

public enum surahNameArabic {
    النبأ(SurahNumberArabic.s78),
    النازعات(SurahNumberArabic.s79),
    عبس(SurahNumberArabic.s80),
    التكوير(SurahNumberArabic.s81),
    الانفطار(SurahNumberArabic.s82),
    المطفّفين(SurahNumberArabic.s83),
    الانشقاق(SurahNumberArabic.s84),
    البروج(SurahNumberArabic.s85),
    الطارق(SurahNumberArabic.s86),
    الأعلى(SurahNumberArabic.s87),
    الغاشية(SurahNumberArabic.s88),
    الفجر(SurahNumberArabic.s89),
    البلد(SurahNumberArabic.s90),
    الشمس(SurahNumberArabic.s91),
    الليل(SurahNumberArabic.s92),
    الضحى(SurahNumberArabic.s93),
    الشرح(SurahNumberArabic.s94),
    التين(SurahNumberArabic.s95),
    العلق(SurahNumberArabic.s96),
    القدر(SurahNumberArabic.s97),
    البينة(SurahNumberArabic.s98),
    الزلزلة(SurahNumberArabic.s99),
    العاديات(SurahNumberArabic.s100),
    القارعة(SurahNumberArabic.s101),
    التكاثر(SurahNumberArabic.s102),
    العصر(SurahNumberArabic.s103),
    الهمزة(SurahNumberArabic.s104),
    الفيل(SurahNumberArabic.s105),
    قريش(SurahNumberArabic.s106),
    الماعون(SurahNumberArabic.s107),
    الكوثر(SurahNumberArabic.s107),
    الكافرون(SurahNumberArabic.s109),
    النصر(SurahNumberArabic.s110),
    المسد(SurahNumberArabic.s111),
    الإخلاص(SurahNumberArabic.s112),
    الفلق(SurahNumberArabic.s113),
    النّاس(SurahNumberArabic.s114);



    private final SurahNumberArabic surahNumberArabic;
    surahNameArabic(SurahNumberArabic surahNumberArabic) {
        this.surahNumberArabic = surahNumberArabic;
    }

    public SurahNumberArabic getSurahNumberArabic() {
        return surahNumberArabic;
    }
}
