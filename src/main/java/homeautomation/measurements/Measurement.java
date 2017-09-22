package homeautomation.measurements;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Measurement {

    @Id
    public String id;

    public String temperature;

    public Measurement(){}

    public Measurement(String temperature, String humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String humidity;
    public Date time;


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, temperature='%s', humidity='%s', time='%s']",
                id, temperature, humidity, time);
    }
}
