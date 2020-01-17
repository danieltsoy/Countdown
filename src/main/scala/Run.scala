import sttp.client._
import java.net.{HttpURLConnection, URL}

import com.google.transit.realtime.GtfsRealtime.FeedMessage
import com.google.transit.realtime.nyc_subway.{NycSubwayProto, NyctFeedHeader, NyctStopTimeUpdate}

import scala.collection.JavaConverters._;


object Run extends App {
  // the `query` parameter is automatically url-encoded
  // `sort` is removed, as the value is not defined
  //  val request = basicRequest.get(uri"https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-nqrw")
  //    .header("x-api-key", "RUjE30Aiht4LjlhOnx2sz7TpEFBUAFI46hBlNpBi")
  //
  //
  //  implicit val backend = HttpURLConnectionBackend()
  //  val response = request.send()
  //
  //  // response.header(...): Option[String]
  //  println(response.header("Content-Length"))
  //
  //  // response.body: by default read into an Either[String, String] to indicate failure or success
  //  println(response.body)
  //

  val url = new URL("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-nqrw")
  val conn = url.openConnection()
  conn.setRequestProperty("x-api-key", "RUjE30Aiht4LjlhOnx2sz7TpEFBUAFI46hBlNpBi")

    val feed = FeedMessage.parseFrom(conn.getInputStream)
  //  feed.getEntityList.asScala.foreach(entity => if(entity.hasTripUpdate) println(entity.getTripUpdate))
  //


  println(NyctStopTimeUpdate.parseFrom(conn.getInputStream))
}
