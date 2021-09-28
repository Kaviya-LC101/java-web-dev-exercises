package exercises.technology;

public class Laptop extends Computer {
    private boolean isHdmiCapable;
    private Integer uniId;


    public Laptop(String aOperatingSystem,Integer ahardDiskStorage,Integer asystemMemoryRAM,boolean aHdmi){
        super(aOperatingSystem,ahardDiskStorage,asystemMemoryRAM);
       isHdmiCapable=aHdmi;
       uniId=AbstractEntity.getUniqueId();
       }

    public Integer getUniId() {
        return uniId;
    }
    public boolean hdmiCapable(){
        return isHdmiCapable;
    }

    public boolean isHdmiCapable() {
        return isHdmiCapable;
    }

    public void setHdmiCapable(boolean hdmiCapable) {
        isHdmiCapable = hdmiCapable;
    }

//    public Integer getLaptopId() {
//        return laptopId;
//    }
//
//    public void setLaptopId(Integer laptopId) {
//        this.laptopId = laptopId;
//    }
}
