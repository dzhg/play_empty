package controllers

import akka.util.Timeout
import org.scalatest.MustMatchers
import org.scalatest.mockito.MockitoSugar
import org.scalatestplus.play.PlaySpec
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers.{OK, contentAsString, status}

import scala.concurrent.Future
import scala.concurrent.duration.DurationInt

/**
  * Created by dzhg on 3/16/17.
  */
class HelloControllerSpec extends PlaySpec with MockitoSugar with MustMatchers {

  implicit val timeout = Timeout(1.second)

  "OAuth2Controller" must {
    "response with valid token when called with correct username and password" in {
      val controller = new HelloController()

      val result: Future[Result] = controller.hello().apply(FakeRequest("GET", "/hello"))

      status(result) must be (OK)
      contentAsString(result) must be ("Hello")
    }
  }
}
