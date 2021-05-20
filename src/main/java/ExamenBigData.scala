import scala.collection.immutable.ListMap

object ExamenBigData {

  def liste_double(): Unit ={
    val Maliste = List(("ecommercemag.fr"," "),
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
    val finalListe =  (ListMap(Maliste:_*).keys.toList.map(l => l.replace("https://www.","").split("/")(0) ) zip ListMap(Maliste:_*).values).toList

    println(finalListe)


  }
  def main (args : Array[String]): Unit = {

    val test : List[String] = List ("julien", "paul", "jean", "rac", "trec", "joel", "ed", "chris", "maurice")

    mafonction(test).foreach(l => println(l))

    liste_double()

  }

  def mafonction (liste : List[String]) : List[String] ={
    val retour : List[String] = liste.filter(l => l.endsWith("n"))
    return retour

  }
}