package kata.four

import org.junit.Assert.assertEquals
import org.junit.Test

class mixinMainTest {
    @Test
    fun test() {
        println("Fixed Tests")
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", mix("Are they here", "yes, they are here"))
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg", mix("looping is fun but dangerous", "less dangerous than coding"))
        assertEquals("1:sss/1:www/2:ddd/1:aa/1:zz/2:ii/2:oo/2:qq/=:yy", mix("UszguQmsdwWpwsrWbyjwKzyanKdaqe", "MmibqYpoxdCwynlZjtfiKdvdoMwzyq"))

    }
}