package controllers

import play.api.mvc.{Action, Controller}

/**
  * Created by dzhg on 3/16/17.
  */
class HelloController extends Controller {

  def hello = Action {
    Ok("Hello")
  }
}
