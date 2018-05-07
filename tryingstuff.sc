import forcomp.loadDictionary

object HelloWorld {

 /* type Occurrences = List[(Char, Int)]
  type Sentence = List[Word]
  type Word = String
  val dictionary: List[Word] = loadDictionary
  lazy val dictionaryByOccurrences: Map[Occurrences, List[Word]] = {

    def helper(dicOccurMap: Map[Occurrences, List[Word]], dic: List[Word]): Map[Occurrences, List[Word]] = {
      if (dic.isEmpty)
        dicOccurMap
      else if (dicOccurMap.contains(wordOccurrences(dic.head))) {
        val newlist = dicOccurMap(wordOccurrences(dic.head)) :+ dic.head
        val updatedDic = dicOccurMap + (wordOccurrences(dic.head) -> newlist)
        helper(updatedDic, dic.tail)
      }
      else
        helper(dicOccurMap + (wordOccurrences(dic.head) -> List(dic.head)), dic.tail)
    }

    helper(Map[Occurrences, List[Word]](), dictionary)

  }

  def wordOccurrences(w: Word): Occurrences = {

    def helper(w: Word): Occurrences =
      w.toLowerCase().groupBy((chararacter: Char) => chararacter).map { case (key, value) => (key, value.length()) } toList

    helper(w).sortBy(_._1)
  }

  def combinations(occurrences: Occurrences): List[Occurrences] = {

    val occurrenceSubsets= for {
      (dictKeys, _) <- dictionaryByOccurrences
      if (dictKeys.map { case (a, b) => a } exists (char => occurrences.map { case (a, b) => a }.contains(char)))

    } yield dictKeys

    occurrenceSubsets toList
  }

 // print( List() +:combinations(List(('a', 2), ('b', 2))))

  val occurrenceSubsets= for {
    (dictKeys, _) <- dictionaryByOccurrences

  } yield dictKeys*/
 val occurenences = List(('a', 2), ('b', 2))
  val n = List(('a',2))
 n.map { case (a, b) => a } exists (char => occurrences.map { case (a, b) => a }.contains(char))
}