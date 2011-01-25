@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.1')
import static groovyx.net.http.ContentType.JSON
import groovyx.net.http.RESTClient

def client = new RESTClient("https://laufer.cloudant.com/blah")
client.auth.basic "themphybuldeatheyeseetud", "cJEftnTFJAjGEobnbljsoh65"

def resp = client.get(path: "blah/_all_docs", contentType: JSON)

resp.data.rows.each {
  println it
}