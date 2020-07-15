package basic_kotlin

fun main() {
    val nilaiUjian = 80
    val kehadiran = 50

    val apakahLulusUjian = nilaiUjian > 80
    val apakahakLulusAbsen = kehadiran > 75

    val apakahLulus = apakahLulusUjian && apakahakLulusAbsen

    println(apakahLulus)
}