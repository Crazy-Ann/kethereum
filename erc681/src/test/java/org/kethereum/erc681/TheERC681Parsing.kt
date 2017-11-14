package org.kethereum.erc681

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.math.BigInteger

class TheERC681Parsing {

    @Test
    fun weCanAccessQuery() {
        Assertions.assertThat(parseERC681("ethereum:key-0x00AB42@23?value=42&gas=3&yay").query).isEqualTo("value=42&gas=3&yay")
    }

    @Test
    fun weCanParseScientificNotationForValue() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42@23?value=42e18").value).isEqualTo(BigInteger("42000000000000000000"))
    }

    @Test
    fun weCanParseScientificNotationForGas() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42@23?gas=42e1").gas).isEqualTo(BigInteger("420"))
    }

    @Test
    fun weCanParseFunction() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42@23/myfun?value=42e18").function).isEqualTo("myfun")
    }

    @Test
    fun parsingERC681WithChainIdWorks() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42@4?gas=2").chainId).isEqualTo(4)
    }

    @Test
    fun defaultChainIdIs1() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=42").chainId).isEqualTo(1)
    }

    @Test
    fun canDetectInvalidChainId() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42@failme?value=42").valid).isFalse()
    }

    @Test
    fun garbageIsInvalid() {
        assertThat(parseERC681("garbage").valid).isFalse()
    }

    @Test
    fun canParseChainWhenLastElement() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42@42").chainId).isEqualTo(42)
    }

    @Test
    fun canParsePrefix() {
        Assertions.assertThat(parseERC681("ethereum:rlp-0x00AB42?value=42").prefix).isEqualTo("rlp")
    }

    @Test
    fun invalidERC681IsDetected() {
        Assertions.assertThat(parseERC681("etherUUm:0x00AB42?value=1").valid).isEqualTo(false)
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1a&gas=2").valid).isEqualTo(false)
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1&gas=2x").valid).isEqualTo(false)
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1?gas=2").valid).isEqualTo(false)
    }

    @Test
    fun parsingERC681Works() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1").query).isEqualTo("value=1")
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1").addressString).isEqualTo("0x00AB42")
        Assertions.assertThat(parseERC681("ethereum:0x00AB42").value).isNull()

        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1").valid).isEqualTo(true)
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1").value).isEqualTo("1")

        (0..10).forEach {
            val erC681 = ERC681(addressString = "0xAABB", value = BigInteger.valueOf(it.toLong()))
            val probe = parseERC681(erC681.generateURL())
            Assertions.assertThat(probe.value).isEqualTo(it.toString())
        }
    }

    @Test
    fun parsingERC681WithGasValueWorks() {
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?gas=2").gas).isEqualTo("2")
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?gas=42&value=3").gas).isEqualTo("42")
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?value=1&gas=2").value).isEqualTo("1")
        Assertions.assertThat(parseERC681("ethereum:0x00AB42?gas=2&value=1").gas).isEqualTo("2")
    }

    @Test
    fun canParseFullyFeaturedERC681URL() {
        Assertions.assertThat(parseERC681("ethereum:key-0x00AB42@23?value=42&gas=3").prefix).isEqualTo("key")
        Assertions.assertThat(parseERC681("ethereum:key-0x00AB42@23?value=42&gas=3").value).isEqualTo("42")
        Assertions.assertThat(parseERC681("ethereum:key-0x00AB42@23?value=42&gas=3").gas).isEqualTo("3")
    }

}