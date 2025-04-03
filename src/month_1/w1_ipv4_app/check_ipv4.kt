package month_1.w1_ipv4_app

fun main() {
    check(
        name = "Should return False, When segment more than 255",
        result = isIpv4Valid("192.168.0.256"),
        correctResult = false
    )
    check(
        name = "Should return False, When IP with negative numbers",
        result = isIpv4Valid("89.-8.23.-200"),
        correctResult = false
    )
    check(
        name = "Should return False, When IP with more than 4 fields",
        result = isIpv4Valid("192.168.0.1.1"),
        correctResult = false
    )
    check(
        name = "Should return False, When IP with less than 4 fields",
        result = isIpv4Valid("192.168.1"),
        correctResult = false
    )
    check(
        name = "Should return False, When IP with empty field",
        result = isIpv4Valid("192..168.1"),
        correctResult = false
    )
    check(
        name = "Should return False, When Empty String",
        result = isIpv4Valid(""),
        correctResult = false
    )
    check(
        name = "Should return False, When IP with leading zeros",
        result = isIpv4Valid("192.168.001.01"),
        correctResult = false
    )
    check(
        name = "Should return False, When IP with not valid characters (including spaces)",
        result = isIpv4Valid(",#192.X.1. 1"),
        correctResult = false
    )
    check(
        name = "Should return True, When IP with minimum values",
        result = isIpv4Valid("0.0.0.0"),
        correctResult = true
    )
    check(
        name = "Should return True, When IP with maximum values",
        result = isIpv4Valid("255.255.255.255"),
        correctResult = true
    )
    check(
        name = "Should return True, When Valid normal IP",
        result = isIpv4Valid("192.168.1.1"),
        correctResult = true
    )
}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) println("Success ✅: $name")
    else println("Failed  🚫: $name")
}
