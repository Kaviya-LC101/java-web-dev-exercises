package exercises.technology;

public abstract class AbstractEntity {
    private static Integer uniqueId=0;

    public  AbstractEntity(){
        uniqueId++;
    }


    public static Integer getUniqueId() {
        return uniqueId;
    }

    public  static void setUniqueId(Integer uniqueId) {
        AbstractEntity.uniqueId = uniqueId;
    }

}
