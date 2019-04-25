/*
 *    Copyright 2019 Ugljesa Jovanovic
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.ionspin.kotlin.bignum.decimal

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 10-Mar-2019
 */


@ExperimentalUnsignedTypes
fun Long.toBigDecimal(decimalMode: DecimalMode? = null): BigDecimal {
    return BigDecimal.fromLongAsSignificand(this, decimalMode)
}


@ExperimentalUnsignedTypes
fun Int.toBigDecimal(decimalMode: DecimalMode? = null): BigDecimal {
    return BigDecimal.fromIntAsSignificand(this, decimalMode)
}


@ExperimentalUnsignedTypes
fun Short.toBigDecimal(decimalMode: DecimalMode? = null): BigDecimal {
    return BigDecimal.fromShortAsSignificand(this, decimalMode)
}


@ExperimentalUnsignedTypes
fun Byte.toBigDecimal(decimalMode: DecimalMode? = null): BigDecimal {
    return BigDecimal.fromByteAsSignificand(this, decimalMode)
}

@ExperimentalUnsignedTypes
fun String.toBigDecimal(decimalMode: DecimalMode? = null) : BigDecimal {
    return BigDecimal.parseStringWithMode(this, decimalMode)
}

@ExperimentalUnsignedTypes
fun Float.toBigDecimal(decimalMode: DecimalMode? = null) : BigDecimal {
    return BigDecimal.fromFloat(this, decimalMode)
}

@ExperimentalUnsignedTypes
fun Double.toBigDecimal(decimalMode: DecimalMode? = null) : BigDecimal {
    return BigDecimal.fromDouble(this, decimalMode)
}






