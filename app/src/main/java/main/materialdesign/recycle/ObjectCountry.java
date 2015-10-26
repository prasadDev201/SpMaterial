package main.materialdesign.recycle;

/**
 * Created by sibaprasad.mohanty on 10/3/2015.
 */
public class ObjectCountry {
    String name;
    String pop;
    String rank;

    public ObjectCountry(String name,String rank,String pop){
        this.name = name;
        this.rank = rank;
        this.pop = pop;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName( ){
        return this.name;
    }

    public void setRank(String rank){
        this.rank = rank;
    }
    public String getRank( ){
        return this.rank;
    }
    public void setPop(String pop){
        this.pop = pop;
    }
    public String getPop( ){
        return this.pop;
    }


    protected static final String NAME_PREFIX = "Name_";
    protected static final String SURNAME_PREFIX = "Surname_";
    protected static final String EMAIL_PREFIX = "email_";
}
