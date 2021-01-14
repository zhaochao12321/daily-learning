package stock;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class Test {
    public static String MAP_AK = "Puzsuhx0wmeNTQFoHgfDEf9U";

    public static String MAP_URL = "http://api.map.baidu.com/geocoder/v2/?output=json&ak=" + MAP_AK;

    public static void main(String[] args) {
//        double x = 120.08899292561351;
//        double y = 30.207036169515438;
//        Test test = new Test();
//        String address = test.getAddress(x, y);
//        System.out.println(address);

        JSONObject jsonObject = getPosition("新疆哈密市巴里坤县第一中学");
        System.out.println(jsonObject);
        String addressString = getAddress(Double.parseDouble(jsonObject.get("lng").toString()), Double.parseDouble(jsonObject.get("lat").toString()));
        System.out.println(addressString);
    }


    /**
     * 经纬度得地址
     *
     * @param lng
     * @param lat
     * @return
     */
    public static String getAddress(double lng, double lat) {
        String MAP_AK = "Puzsuhx0wmeNTQFoHgfDEf9U";

        String MAP_URL = "http://api.map.baidu.com/geocoder/v2/?output=json&ak=" + MAP_AK;


        String address = "";
        String location = lat + "," + lng;
        BufferedReader in = null;
        URL url = null;
        URLConnection connection = null;
        try {
            url = new URL(MAP_URL + "&location=" + location);
            connection = url.openConnection();
            connection.setDoOutput(true);
            in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            StringBuilder text = new StringBuilder("");
            while ((line = in.readLine()) != null) {
                text.append(line.trim());
            }
            JSONObject result = JSONObject.parseObject(text.toString());
            if (result != null && result.getIntValue("status") == 0) {
                address = result.getJSONObject("result").getString("formatted_address");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return address;
    }


    /**
     * 地址得经纬度
     *
     * @param address
     * @return
     */
    public static JSONObject getPosition(String address) {
        BufferedReader in = null;
        URL url = null;
        URLConnection connection = null;
        try {
            url = new URL(MAP_URL + "&address=" + address);
            connection = url.openConnection();
            connection.setDoOutput(true);
            in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            StringBuilder text = new StringBuilder("");
            while ((line = in.readLine()) != null) {
                text.append(line.trim());
            }
            JSONObject result = JSONObject.parseObject(text.toString());
            if (result != null && result.getIntValue("status") == 0) {
                return result.getJSONObject("result").getJSONObject("location");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
