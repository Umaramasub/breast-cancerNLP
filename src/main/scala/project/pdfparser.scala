package project
import java.io._

import org.apache.tika.parser.pdf._
import org.apache.tika.metadata._
import org.apache.tika.parser._
import org.apache.tika.sax.BodyContentHandler


/**
  * Created by Uma on 10/8/2017.
  */
object pdfparser extends App{
  val file = "C:\\Users\\Uma\\Documents\\Umaramasub-final-project\\Docs\\NCCNguidelines.pdf"
  val pdf : PDFParser = new PDFParser()
  val stream : InputStream = new FileInputStream( new File (file) )
  val context : ParseContext = new ParseContext()
  val handler: BodyContentHandler=new BodyContentHandler(-1)
  val metadata:Metadata=new Metadata()
  pdf.parse(stream,
    handler,
    metadata,
    context)
  System.out.println(handler.toString)

  stream.close()



}
