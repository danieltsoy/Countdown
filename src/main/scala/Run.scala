import sttp.client._

object Run extends App {
  // the `query` parameter is automatically url-encoded
  // `sort` is removed, as the value is not defined
  val request = basicRequest.get(uri"http://datamine.mta.info/mta_esi.php?key=d0443dbe928081a6b831e48bede8f2cf")

  implicit val backend = HttpURLConnectionBackend()
  val response = request.send()

  // response.header(...): Option[String]
  println(response.header("Content-Length"))

  // response.body: by default read into an Either[String, String] to indicate failure or success
  println(response.body)


}
