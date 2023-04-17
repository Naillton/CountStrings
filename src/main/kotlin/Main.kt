import java.util.*
fun main() {
    val sc = Scanner(System.`in`)
    var space: Int = 0
    var number: Int = 0
    var others: Int = 0
    println("Digite uma frase legal: ")
    val phrase: String = sc.nextLine()
    // usamos o toChArray para dividir nossa string em posicoes e fazer analise sobre as posicoes
    val text = phrase.toCharArray()
    val upPhrase = phrase.uppercase()
    val lwPhrase = phrase.lowercase()
    val lengthPhrase = phrase.length
    println("Frase escolhida totalmente em letra maiuscula: -> $upPhrase <-")
    println("Frase escolhida totalmente em letra minuscula: -> $lwPhrase <-")
    println("Tamanho da frase contando espacos, numeros, etc... $lengthPhrase")
    println("Imprimindo cada caracter da phrase")
    phrase.forEach {
        println(it)
    }
    for (c in text) {
      if (c.isLetter()) {
          others ++
      } else if (c.isDigit()) {
          number ++
      } else if (c.isWhitespace()) {
          space ++
      }
    }
    println("Temos $others letras(a) na frase")
    println("Temos $number numeros(o) na frase")
    println("Temos $space espacos(o) na frase")
    val newPhrase: String = phrase.split("").reversed().joinToString("")
    println("trocando caracteres de posicao: $newPhrase")
    val changeWordsPosi: String = phrase.split(" ").reversed().joinToString(" ")
    println("Mudando palavras de posicao: $changeWordsPosi")
    // usando o array de chars para fazer uma verificaco como a string
    val charPosition = text.reversed().joinToString("")
    println(charPosition)
}