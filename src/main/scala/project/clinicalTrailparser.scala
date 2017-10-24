package project

/**
  * Created by Uma on 10/8/2017.
  */

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

object clinicalTrialparser extends App {
  val map = scala.collection.mutable.Map[String, String]()
  val xml = XML.loadFile(".\\Docs\\ClinicalTrails\\NCT01019616.xml")
  var id = (xml \\ "clinical_study" \\ "org_study_id").text
  val text = (xml \\ "clinical_study" \\ "textblock").text
//  println(text)
  val inclusioncriteriaregex = """Inclusion Criteria:((?s).*)Exclusion""".r.unanchored
  val exclusioncriteriaregex="""Exclusion Criteria:((?s).*)""".r.unanchored
  text match {
    case inclusioncriteriaregex(inclusionCriteria) => var Inc=inclusionCriteria
      print(Inc)
  }
  text match {
    case exclusioncriteriaregex(exclusionCriteria) => var exc=exclusionCriteria
      print(exc)
  }


}
