package com.eltafseer;

public enum Surah {
    النبأ(78),
    An_Nabaa(78),
    An_Naziaat(79),
    Aabasa(80),
    At_Takwir(81),
    Al_Infitar(82),
    Al_Mutaffifin(83),
    Al_Inshiqaq(84),
    Al_Buruj(85),
    At_Tariq(86),
    Al_Aala(87),
    Al_Ghashiyah(88),
    Al_Fajr(89),
    Al_Balad(90),
    Ash_Shams(91),
    Al_Layl(92),
    Adh_Dhuha(93),
    Al_Inshirah(94),
    At_Tin(95),
    Al_Aalaq(96),
    Al_Qadar(97),
    Al_Bayinah(98),
    Az_Zalzalah(99),
    Al_Aadiyah(100),
    Al_Qariaah(101),
    At_Takathur(102),
    Al_Aasr(103),
    Al_Humazah(104),
    Al_Fil(105),
    Quraish(106),
    Al_Maaun(107),
    Al_Kauthar(108),
    Al_Kafirun(109),
    An_Nasr(110),
    Al_Masad(111),
    Al_Ikhlas(112),
    Al_Falaq(113),
    An_Nas(114);

    private final int Ordinal;
    Surah(int Ordinal) {
        this.Ordinal = Ordinal;
    }

    public int getOrdinal() {
        return Ordinal;
    }
 }
