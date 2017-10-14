package io.i101.library.lang

import io.kotlintest.matchers.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it


object AnyTests:Spek({
    describe("qualifiedName") {
        it("io.i101.library.lang.SampleAnyClass") {
            val any = SampleAnyClass()
            any.qualifiedName shouldBe "io.i101.library.lang.SampleAnyClass"
        }
        it("io.i101.library.lang.SampleAnyObject") {
            SampleAnyObject.qualifiedName shouldBe "io.i101.library.lang.SampleAnyObject"
        }
    }

    describe("simpleName") {
        it("SampleAnyClass") {
            val any = SampleAnyClass()
            any.simpleName shouldBe "SampleAnyClass"
        }
        it("SampleAnyObject") {
            SampleAnyObject.simpleName shouldBe "SampleAnyObject"
        }
    }
})

private class SampleAnyClass
private object SampleAnyObject