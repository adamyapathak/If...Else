public class Event {
    private int typeOFEvent;
    private double rate;
    private String manager;
    public int getType(){
        return typeOFEvent;
    }
    public double getRate(){
        return rate;
    }
    public String getManager(){
        return manager;
    }
    public void setType(int eventType){
        typeOFEvent = eventType;
    }
    public void setRate(double eventRate){
        rate = eventRate;
    }
    public void setManager(String managerName){
        manager = managerName;
    }
    
}
