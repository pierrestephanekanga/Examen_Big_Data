import scala.collection.immutable.ListMap

object ExamenBigData {

  //Definition de la methode "liste_double"
  def liste_double(): Unit = {
    val Maliste : List[(String, String)] = List(
      ("ecommercemag.fr"," "),
      ("https://www.journalducm.com/contact/","Payant"),
      ("https://www.zatsaz.com/"," "),
      ("https://www.lerevenu.com/"," "),
      ("https://www.cadre-dirigfdeant-magazine.com/","Payant"),
      ("https://www.silicon.fr/services/contact#annoner","Payant"),
      ("https://www.channelbiz.fr/nous-contacter/"," "),
      ("https://www.itespresso.fr/"," "),
      ("https://www.industrie-mag.com/article4.html","invite"),
      ("https://www.jesuisundev.com/article-invite/","invite"),
      ("https://www.numerama.com/"," ")
    )

    //creation du tableau final
    val liste_final =  (ListMap(Maliste:_*).keys.toList.map(l => l.replace("https://www.","").split("/")(0) ) zip ListMap(Maliste:_*).values).toList

    //afficharge du tableau final
    liste_final.foreach(f => println(f._1 + " " + f._2))

  }

  def main (args : Array[String]): Unit = {

    val test : List[String] = List ("julien", "paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")

    mafonction(test).foreach(l => println(l))

    liste_double()

  }

  def mafonction (liste : List[String]) : List[String] = {
    val retour : List[String] = liste.filter(l => l.endsWith("n"))
    return retour

  }
}