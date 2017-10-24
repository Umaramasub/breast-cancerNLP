package project

import gov.nih.nlm.nls.metamap.{MetaMapApi, MetaMapApiImpl}

/**
  * Created by Uma on 10/12/2017.
  */
object Metamap extends App {
   var terms="PAIN: MEDICATED WITH Aspirin"
   var api:MetaMapApi = new MetaMapApiImpl()
    api.setOptions("-R SNOMEDCT_US")
   var resultList = api.processCitationsFromString(terms)
   var result = resultList.get(0)
   var machineOutput = result.getMachineOutput
   println(machineOutput)

}
