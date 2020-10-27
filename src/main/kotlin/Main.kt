package ru.netology

fun main() {
    val TimeAgo = 24_000
    agoToText(TimeAgo)
    
    }

fun agoToText(TimeAgo: Int) {
    when (TimeAgo) {
        in 0..60 -> println("Был(а) только что")
        in 61..60 * 60 -> println("Был(а)" + " ${TimeAgo / 60} ${minutes(TimeAgo / 60)} назад")
        in (60 * 60 + 1)..(24 * 60 * 60) -> println("Был(а)" + " ${TimeAgo / (60 * 60)} " + "${hours(TimeAgo / (60 * 60))} назад")
        in (24 * 60 * 60 + 1)..(24 * 60 * 60) * 2 -> println("Был(а) сегодня")
        in (24 * 60 * 60) * 2 + 1..(24 * 60 * 60) * 3 -> println("Был(а) вчера")
        else -> println("Был(а) давно")

    }
}

    fun minutes(TimeAgo: Int): String {
        return when (TimeAgo) {
            1, 21, 31, 41, 51 -> "минуту"
            in 2..4 -> "минуты"
            in 5..20, in 22..30, in 32..40, in 42..50, in 52..60 -> "минут"
            else -> ""
        }
    }

    private fun hours(TimeAgo: Int): String {
        return when (TimeAgo) {
            1, 21 -> "час"
            in 2..4, 22, 23 -> "часа"
            in 5..20 -> "часов"
            else -> ""
        }
    }