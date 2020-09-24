package priv.jesse.mall.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016102400749277";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCdlt43P3hvyKQUjXG1+nekYJ9K1f2w8FE7Xlb+G1SFrLTcJJEPo3/fU5HvdBK8GBIrAwsM4FW/wnvQdutzMFkq9tiJqlSCaVaoqxXUmk3dI1HAPGoTxYgM88/WWs7tASrSdj3XOUVuOJvnEcTHqgfKpt+5esNGdV1okdxwj/KBQZBQT2wa87rhB8cVDur4dGeayt1+DtMwWFbcgpx8IKkgDNyBSf04VFHeLZNPko7LlW1KWuZSd8Npl+/9VPaF5y4vFYNv+zmwS7lyI+OZdzQcQgD1gOHcz5gC7bSl7UhjfWfDzNTcYyu1tsLFIxdN6GgHY+iHE7B8cjN7BMPCVVD5AgMBAAECggEAYlcgaren75H0moK9wAMCIEjPfsLVIlKFTpgLj1z8vMJOxsXm5CxygqnC+vujKU+YHtEyVyGzQQwbebaMLYCxVDdgX2A0hoE3u9+vqtFz35jHzj+lLpto0DRhsXFPieTdlSKGasVph2O6HlMfSj3XyOWj3To3m8Nnu/ax6mhZu8BwyiE+gGEMNaSU15mX5ZXzpZkngDADopSh69nrQmSs9NQJUivlZD4eO7TJuiVstGRz1V0iDYTEsSP6BM6oCTlZm0+ztiIHKXEI3//rIVbdkPO1fegk5+yJSf1/ws/cxdoCIK7HWdWmBIftg5Tysz9YxETgpg4j+v2V5qlyk+PVAQKBgQDvNL4f6Xo1kYT/ihCrFfXsrJhWd9NmIQwwvqep4Dp0cEbxzR7joJgW3T9+9ONXBKLoy8PkIHqrFkv22J9jXCS9tFQsBmYr0u9lvvS/KW0LjnpbTflInWO+hCUUxuRL2F6iLuiQGq1QkJT7s6xFpAwSyGdDgV6SCu9KnFZ7OjbU4QKBgQCopznVi1wIwinbwQ+kVo+ftWYUw+VIOXEdeBOHHEWoHGpOZLBB7DF4Z8m+9F0WE5IJV/5DySwcGbqi3K6IpDU8Wfi9MFIf1uMQPvgc9kifs2LQcP3oIZKWzuIaTSTx0PQ4D0MAZ2pNoeyaDu0Uk+U1hLV3hxoBT24vSGj02dRnGQKBgQCXvwbJqcycRQdxML3oOtM65Dbzy6oxBM/98ETesF+E1GE9Ldnln1A8WPjZ6jJ6VneeZP2NL8mB1XA1VTCv0JmCOu6Wyyxvqq2yBxSuXHJPvYADghCdLzNCfgQkDRRwxP8rtcRU/odqL35DurSTrUD3fWh824oJ7aPl2g3GuKRmIQKBgAqRqDssp5DY8hyWZa+LySZeDM6iVB0JlIAfRUIDUI4vca4F+1G2RodgIbF4yNiYU1+IhyOiWMRODHcmUz225KsqjD725z6djc830v6lpHl1mWysmAzTBcezoVG6oeURjixxMGa3FF9XFWe2Jb9TYVrQPTsHWWbZnnMSG5m0iO4JAoGBAKUuJargu3d0B1zCiunSGJ2ivA+Fu8turRfP8hwJ+lGN5jI1HK2pzhKXIPjGH5hIvN7GT0d+2/WfRVjybrZiCWumf/x6GJlxDwNpoaM6k20CGnrWZUZNpVmWRfavf7oRO+oVyZbHFHBRum5RDLYsN0xUKvStvNRXZKC4jPMpAOmB";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk4S/NIYZL3iuqFFFUVYkvZVUZ4bIq3wTgT0Y3rnFSoYHVqWlgjx0ZTaIvdmefaD+vMV/WHDrDgnZo6TWhcGArpToGUmXNu3G6ORJLp8BorWLlAiiFh8iRVa5QwXHwzOrR4HXuzfXqMU4EMwRwjlg5ic8YUNDh9uqqDUjClizipG7pLcSz3VG2HrkW/Pu4cLp2LV0hA7vN8S8X0gfcwnOos5t3KbQCF08nYWdP6D+ZCduIfeY2OvzXgAeqO5WtJaMjsLnXHaUatHwRoHdpKoP5GDmTuDgRkzKiJ1luU9OJPDrW+8beKPhC8DJyTUGGu3Ke93b9KZRljx6swKLHovfdwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.baidu.com";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8080/mall/order/toList.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
