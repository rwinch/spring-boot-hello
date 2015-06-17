@RestController
class HelloController {

  @RequestMapping("/")
  def hello() {
    [message: "Hello"]
  }
}
