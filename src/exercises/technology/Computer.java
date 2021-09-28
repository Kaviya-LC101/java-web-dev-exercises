package exercises.technology;

public class Computer extends AbstractEntity{
    private String operatingSystem;
    private Integer hardDiskStorage;
    private Integer systemMemoryRAM;
    private Integer totalSystemStorage;
    private Integer uniId;

    public Integer getUniId() {
        return uniId;
    }



    public Computer (String aOperatingSystem, Integer ahardDiskStorage, Integer aSystemMemoryRAM){
        super();
        operatingSystem=aOperatingSystem;
        hardDiskStorage=ahardDiskStorage;
        systemMemoryRAM=aSystemMemoryRAM;
        totalSystemStorage=ahardDiskStorage;
        uniId=AbstractEntity.getUniqueId();

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getHardDiskStorage() {
        return hardDiskStorage;
    }

    public void setHardDiskStorage(Integer hardDiskStorage) {
        this.hardDiskStorage = hardDiskStorage;
    }

    public Integer getSystemMemoryRAM() {
        return systemMemoryRAM;
    }

    public void setSystemMemoryRAM(Integer systemMemoryRAM) {
        this.systemMemoryRAM = systemMemoryRAM;
    }

    public Integer getTotalSystemStorage() {
        return totalSystemStorage;
    }

    public void setTotalSystemStorage(Integer totalSystemStorage) {
        this.totalSystemStorage = totalSystemStorage;
    }

    public void addSystemMemory(Integer memory){
        this.systemMemoryRAM=this.systemMemoryRAM+memory;
}

public void addexternalStorage(Integer addStorage){
        totalSystemStorage=hardDiskStorage+addStorage;
}

//    public Integer getUniId() {
//        return uniId;
//    }
//
//    public void setUniId(Integer uniId) {
//        this.uniId = uniId;
//    }
}
