package com.example.springBootDemo.BootStrap;


import com.example.springBootDemo.Model.ErrorUtility;
import com.example.springBootDemo.Model.Pnv;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;


@Component
@PropertySource("classpath:Utility.properties")
public class UtilityClass implements CommandLineRunner {

    @Value("${redis.uata}")
    String redisHostUata;

    @Value("${redis.uatb}")
    String redisHostUatb;

    String emailId;

    /*@Autowired
    Pnv pnv;*/

    @Override
    public void run(String... args) throws Exception {

    }


    public Pnv dojedis(String emailId, String env, String toDo) {


        Pnv pnv = new Pnv();
        try{
            if (toDo.equalsIgnoreCase("pnv")) {
                String key = "com.gdn.x:otp:V1-userToken-10001-" + emailId + "-pnv";
                String[] otp = jedisConnect(env).get(key).split("-");
                pnv.setOtpPnv(otp[0]);
            } else if (toDo.equalsIgnoreCase("emailRecovery")) {
                String key = "com.gdn.x:otp:V1-userToken-10001-" + emailId + "-email_recovery_change_verification";
                String [] otp = jedisConnect(env).get(key).split("-");
                pnv.setOtpEmailRecovery(otp[0]);
            }else if (toDo.equalsIgnoreCase("phoneRecovery")){
                String key = "com.gdn.x:otp:V1-userToken-10001-" + emailId + "-phone_recovery_change_verification";
                String [] otp = jedisConnect(env).get(key).split("-");
                pnv.setOtpPhoneRecovery(otp[0]);
            }else if(toDo.equalsIgnoreCase("changePhoneNumber")){
                String key = "com.gdn.x:otp:V1-userToken-10001-"+emailId+"-pnv_to_recovery_email_verification";
                String [] otp = jedisConnect(env).get(key).split("-");
                pnv.setOtpChangePhoneNumber(otp[0]);
            }else if(toDo.equalsIgnoreCase("forgotPassword")){

                String key = "com.gdn.x:otp:V1-userToken-10001-"+emailId+"-forgot_password_phone_verification";
                String [] otp = jedisConnect(env).get(key).split("-");
                pnv.setOtpForgotPassword(otp[0]);

            }else if(toDo.equalsIgnoreCase("RewardPoint")){

                String key = "com.gdn.x:otp:V1-userToken-10001-"+emailId+"-device_verification";
                String [] otp = jedisConnect(env).get(key).split("-");
                pnv.setOtpRewardPoints(otp[0]);

            }
            return pnv;
        }catch (NullPointerException e){
            ErrorUtility err = new ErrorUtility();
            err.setError("Otp page not open");
            err.setErroMessage(e.toString());
            return  err;
        }

    }

    private Jedis jedisConnect(String env) {
        String host = env.equalsIgnoreCase("uata") ? redisHostUata : redisHostUatb;
        return new Jedis(host);
    }
}
