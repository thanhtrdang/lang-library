package io.i101.library.lang

import io.kotlintest.matchers.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it

object StringTests: Spek({
    describe("normalizeSpace") {
        it("spaced string - should return the string with normalized space") {
            val spacedString = "   hello,     Hallo, Ciao     "
            val normalizedString = spacedString.normalizeSpace()

            normalizedString shouldBe "hello, Hallo, Ciao"
        }
    }

    describe("stripAccents") {
        it("accented string - should return the string without accents") {
            val accentedString = "éclair"
            val strippedString = accentedString.stripAccents()

            strippedString shouldBe "eclair"
        }
    }
})