package erris.pulsesensor.models;

public class Bpm {
    public String key;
    public String value;

    public Bpm() {}

    public Bpm(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
