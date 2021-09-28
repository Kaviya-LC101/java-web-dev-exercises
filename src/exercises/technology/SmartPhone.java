package exercises.technology;

public class SmartPhone extends Computer {
    private String color;
    private Integer uniId;

    public SmartPhone (String aOperatingSystem,Integer ahardDiskStorage,Integer asystemMemoryRAM,String aColor){
        super(aOperatingSystem,ahardDiskStorage,asystemMemoryRAM);
        color=aColor;
        uniId=AbstractEntity.getUniqueId();
    }

public void exchangePhone(String newColor){
        color=newColor;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Integer getUniId() {
        return uniId;
    }

    public void setUniId(Integer uniId) {
        this.uniId = uniId;
    }
}
