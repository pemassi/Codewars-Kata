package kata.four

import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {
    @Test
    fun sampleTests() {

        assertEquals(listOf("e", "d", "a"), top3("a a a  b  c c  d d d d  e e e e e"))
        assertEquals(listOf("e", "ddd", "aa"), top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"))
        assertEquals(listOf("won't", "wont"), top3("  //wont won't won't "))
        assertEquals(listOf("e"), top3("  , e   .. "))
        assertEquals(emptyList<String>(), top3("  ...  "))
        assertEquals(emptyList<String>(), top3("  '  "))
        assertEquals(emptyList<String>(), top3("  '''  "))
        assertEquals(listOf("a", "of", "on"), top3(sequenceOf(
            "In a village of La Mancha, the name of which I have no desire to call to",
            "mind, there lived not long since one of those gentlemen that keep a lance",
            "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
            "coursing. An olla of rather more beef than mutton, a salad on most",
            "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
            "on Sundays, made away with three-quarters of his income."
        ).joinToString("\n")))
        assertEquals(listOf("a", "of", "on"), top3("cMTqVuLY UB'J:yQDwHsZWY PvDDW cMTqVuLY?CXSvL PvDDW wKsGGDy cMTqVuLY wKsGGDy?zIcF nvFYRxL,qkAkV XXc-qkAkV CXSvL wKsGGDy;wKsGGDy zIcF neGy yQDwHsZWY?MlIJCEk.CVY XXc qkAkV:qkAkV-nvFYRxL UB'J_neGy,yQDwHsZWY/yQDwHsZWY wKsGGDy?cMTqVuLY UB'J wKsGGDy!XXc UB'J,PvDDW CVY_CVY sAlhMEGV vlTY;CXSvL MlIJCEk?PvDDW PvDDW yQDwHsZWY.vlTY CXSvL yQDwHsZWY ZXvjxCYlS PvDDW,qkAkV.zIcF UB'J zIcF neGy qkAkV;neGy:UB'J?cMTqVuLY;LyrtmVDq:XXc,nvFYRxL wKsGGDy?sAlhMEGV CXSvL-wKsGGDy wKsGGDy_XXc!LyrtmVDq ZXvjxCYlS_wKsGGDy/yQDwHsZWY CXSvL_PvDDW jryb cMTqVuLY;cMTqVuLY_UB'J!neGy.sAlhMEGV.XXc;yQDwHsZWY wKsGGDy CXSvL zIcF qkAkV CXSvL MlIJCEk;XXc,PvDDW_qkAkV_cMTqVuLY UB'J!UB'J zIcF qkAkV;yQDwHsZWY UB'J,neGy yQDwHsZWY;neGy_wKsGGDy!neGy_nvFYRxL?neGy/CXSvL cMTqVuLY zIcF MlIJCEk yQDwHsZWY sAlhMEGV wKsGGDy UB'J UB'J-MlIJCEk PvDDW PvDDW;CVY neGy neGy UB'J wKsGGDy CVY cMTqVuLY:UB'J PvDDW?CXSvL?cMTqVuLY MlIJCEk cMTqVuLY PvDDW:UB'J,neGy sAlhMEGV/zIcF qkAkV_neGy/neGy yQDwHsZWY cMTqVuLY/PvDDW/neGy,CVY!qkAkV PvDDW!CXSvL ZXvjxCYlS.zIcF yQDwHsZWY neGy-CXSvL,yQDwHsZWY PvDDW_MlIJCEk/CXSvL cMTqVuLY qkAkV!XXc/MlIJCEk nvFYRxL XXc!CXSvL_CXSvL XXc!yQDwHsZWY CXSvL CXSvL CXSvL cMTqVuLY?CVY yQDwHsZWY.UB'J.neGy!nvFYRxL_wKsGGDy ZXvjxCYlS/wKsGGDy cMTqVuLY.neGy ZXvjxCYlS XXc/vlTY,qkAkV XXc wKsGGDy PvDDW UB'J PvDDW yQDwHsZWY cMTqVuLY neGy MlIJCEk zIcF qkAkV LyrtmVDq yQDwHsZWY CXSvL neGy:vlTY neGy cMTqVuLY;wKsGGDy;cMTqVuLY wKsGGDy nvFYRxL;ZXvjxCYlS:zIcF?yQDwHsZWY:XXc/yQDwHsZWY-zIcF qkAkV;qkAkV UB'J,UB'J-jryb cMTqVuLY_neGy yQDwHsZWY yQDwHsZWY;PvDDW cMTqVuLY LyrtmVDq;wKsGGDy qkAkV.neGy.cMTqVuLY XXc,neGy neGy?wKsGGDy cMTqVuLY,yQDwHsZWY-TpEqoi XXc-yQDwHsZWY XXc_LyrtmVDq neGy XXc wKsGGDy yQDwHsZWY PvDDW XXc XXc.qkAkV!yQDwHsZWY CVY/neGy neGy:neGy-neGy yQDwHsZWY MlIJCEk:zIcF MlIJCEk_CXSvL,zIcF_UB'J UB'J?zIcF/CXSvL qkAkV PvDDW XXc-XXc LyrtmVDq UB'J CVY!yQDwHsZWY CVY!wKsGGDy/"))
    }
}