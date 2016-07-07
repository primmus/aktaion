
package com.aktaion.parser

/**
  * Used for Bro HTTP log events
  */
class BroHttpParser extends GenericParser {

  def tokenizeData(rawData: String): Option[BroHttpLogEvent] = {
    //if we see a comment stop parsing
    if (rawData.startsWith("#")) return None

    val rd: Array[String] = rawData.split("\t")

//    return Some( BroHttpLogEvent(rd(0).toDouble, rd(1),
//      rd(2), rd(3).toInt, rd(4), rd(5).toInt,
//      rd(6).toInt, rd(7), rd(8), rd(9), rd(10),
//      rd(11), rd(12), rd(13), rd(14).toInt,
//      rd(15), rd(16), rd(17), rd(18),
//      rd(19), rd(20), rd(21), rd(22),
//      rd(23), rd(24), rd(25), rd(26)))

    return Some( BroHttpLogEvent(rd(0).toDouble,
      rd(2), rd(3).toInt, rd(4), rd(5).toInt,
      rd(6).toInt, rd(7), rd(8), rd(9), rd(10),
      rd(11), rd(12), rd(13), rd(14).toInt,
      rd(15), rd(16), rd(17), rd(18),
      rd(19), rd(24), rd(26)))
  }

}


//    #fields	ts	uid	id.orig_h	id.orig_p	id.resp_h	id.resp_p	trans_depth	method	host	uri	referrer	user_agent	request_body_len	response_body_len	status_code	status_msg	info_code	info_msg	filename	tags	username	password	proxied	orig_fuids	orig_mime_types	resp_fuids	resp_mime_types
//    #types	time	string	addr	port	addr	port	count	string	string	string	string	string	count	count	count	string	count	string	string	set[enum]	string	string	set[string]	vector[string]	vector[string]	vector[string]	vector[string]
// 27 fields
//case class BroHttpLogEvent(ts: Double, //0
//                           uid: String, //1
//                           id_orig_host: String, //2
//                           id_orig_port: Int, //3
//                           id_resp_host: String, //4
//                           id_resp_port: Int, //5
//                           trans_depth: Int, //6
//                           method: String, //7
//                           host: String, //8
//                           uri: String, //9
//                           referrer: String, //10
//                           user_agent: String, //11
//                           request_body_len: String, //12
//                           response_body_len: String, //13
//                           status_code: Int, //14
//                           status_msg: String, //15
//                           info_code: String, //16
//                           info_msg: String, //17
//                           filename: String, //18
//                           tags: String, //19
//                           username: String, //20
//                           password: String, //21
//                           proxied: String, //22
//                           orig_fuids: String, //23
//                           orig_mime_types: String, //24
//                           resp_fuids: String,//25
//                           resp_mime_types: String //26
//                          ) extends ParsedLogEvent("BroHttpLog")



case class BroHttpLogEvent(ts: Double, //0
                           id_orig_host: String, //2
                           id_orig_port: Int, //3
                           id_resp_host: String, //4
                           id_resp_port: Int, //5
                           trans_depth: Int, //6
                           method: String, //7
                           host: String, //8
                           uri: String, //9
                           referrer: String, //10
                           user_agent: String, //11
                           request_body_len: String, //12
                           response_body_len: String, //13
                           status_code: Int, //14
                           status_msg: String, //15
                           info_code: String, //16
                           info_msg: String, //17
                           filename: String, //18
                           tags: String, //19
                           orig_mime_types: String, //24
                           resp_mime_types: String //26
                          ) extends ParsedLogEvent("BroHttpLog")




