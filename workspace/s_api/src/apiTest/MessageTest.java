package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
public static void main(String[] args) {
	String api_key = "NCSYINPFEQ3EZM5G";
    String api_secret = "YP9MKYSX67TLIUDUBWJ3VAIPNY5S2RVC";
    Message coolsms = new Message(api_key, api_secret);

    // 4 params(to, from, type, text) are mandatory. must be filled
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("to", "01051133095");
    params.put("from", "01051133095");
    params.put("type", "SMS");
    params.put("text", "SMS 발송 테스트 김신영");
    params.put("app_version", "test app 1.2"); // application name and version

    try {
      JSONObject obj = (JSONObject) coolsms.send(params);
      System.out.println(obj.toString());
    } catch (CoolsmsException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCode());
    }
}
}
