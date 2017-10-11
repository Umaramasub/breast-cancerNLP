package project

/**
  * Created by Uma on 10/8/2017.
  */

import java.io.File
import java.io.FileInputStream
import java.io.IOException
import org.apache.tika.metadata.Metadata
import org.apache.tika.parser.ParseContext
import org.apache.tika.parser.xml.XMLParser
import org.apache.tika.sax.BodyContentHandler
import scala.xml.XML


//
//object xmlparser extends App{
//  //detecting the file type
//  val handler : BodyContentHandler = new BodyContentHandler()
//  val metadata : Metadata  = new Metadata()
//  val inputstream : FileInputStream  = new FileInputStream(new File("C:\\Users\\Uma\\Documents\\Umaramasub-final-project\\Docs\\ClinicalTrails\\NCT00193726.xml"))
//  val pcontext :  ParseContext  = new ParseContext()
//  //Xml parser
//  val xmlparser : XMLParser = new XMLParser()
//  val parsedFile= xmlparser.parse(inputstream, handler, metadata, pcontext)
//  System.out.println("Contents of the document:" + handler.toString )
//
//}

object xmlparser extends App {
  val xml = XML.loadFile("C:\\Users\\Uma\\Documents\\Umaramasub-final-project\\Docs\\ClinicalTrails\\NCT01019616.xml")
  val temp = (xml \\ "clinical_study"\\"textblock").toString()
  print(temp)

}
