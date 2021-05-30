package pojo;




/**
 * Bill generated by hbm2java
 */
public class Bill  implements java.io.Serializable {


     private Integer billid;
     private int orderId;
     private int amount;
     private String timez;
     private String datez;
     private String statuz;
     private String customerid;

    public Bill() {
    }

	
    public Bill(int orderId, int amount, String timez, String datez) {
        this.orderId = orderId;
        this.amount = amount;
        this.timez = timez;
        this.datez = datez;
    }
    public Bill(int orderId, int amount, String timez, String datez, String statuz, String customerid) {
       this.orderId = orderId;
       this.amount = amount;
       this.timez = timez;
       this.datez = datez;
       this.statuz = statuz;
       this.customerid = customerid;
    }
   
    public Integer getBillid() {
        return this.billid;
    }
    
    public void setBillid(Integer billid) {
        this.billid = billid;
    }
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getTimez() {
        return this.timez;
    }
    
    public void setTimez(String timez) {
        this.timez = timez;
    }
    public String getDatez() {
        return this.datez;
    }
    
    public void setDatez(String datez) {
        this.datez = datez;
    }
    public String getStatuz() {
        return this.statuz;
    }
    
    public void setStatuz(String statuz) {
        this.statuz = statuz;
    }
    public String getCustomerid() {
        return this.customerid;
    }
    
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }




}

