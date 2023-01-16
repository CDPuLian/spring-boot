package com.my.boot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ResourceBundle;

/**
 * (Authority)表控制层
 *
 * @since 2022-07-13 15:12:44
 */
@RestController
@RequestMapping("message")
public class MessageController {

    /**
     * 使用AK&SK初始化账号Client
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        ResourceBundle rb2 = ResourceBundle.getBundle("my");//读取resources目录下的my.properties
        String id = rb2.getString("access-id");
        String password = rb2.getString("access-password");
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId(id)
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret(password);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    /**
     * 调用接口发送给某人短信消息
     */
    @GetMapping("sendVerifyMessage")
    public static void sendVerifyMessage(String phoneNumber,String vCode) throws Exception{
        com.aliyun.dysmsapi20170525.Client client = MessageController.createClient("ACCESS_KEY_ID", "ACCESS_KEY_SECRET");
        com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
                .setSignName("朴联")
                .setTemplateCode("SMS_267650161")
                .setPhoneNumbers(phoneNumber)
                .setTemplateParam("{\"code\":\""+vCode+"\"}");
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        com.aliyun.dysmsapi20170525.models.SendSmsResponse resp = client.sendSmsWithOptions(sendSmsRequest, runtime);
        com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(resp));
    }

}
