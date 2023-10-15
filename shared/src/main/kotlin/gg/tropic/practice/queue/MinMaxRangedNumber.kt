package gg.tropic.practice.queue

/**
 * @author GrowlyX
 * @since 10/15/2023
 */
data class MinMaxRangedNumber(
    val med: Int, val diffsBy: Int
)
{
    fun toIntRangeInclusive() = (med - diffsBy)..(med + diffsBy)
}
