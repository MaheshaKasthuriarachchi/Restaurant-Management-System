package pojo;
// Generated May 17, 2020 5:48:09 PM by Hibernate Tools 4.3.1



/**
 * Attendancemarking generated by hbm2java
 */
public class Attendancemarking  implements java.io.Serializable {


     private Integer attendanceid;
     private String employeeid;
     private String date;
     private String monthz;

    public Attendancemarking() {
    }

    public Attendancemarking(String employeeid, String date, String monthz) {
       this.employeeid = employeeid;
       this.date = date;
       this.monthz = monthz;
    }
   
    public Integer getAttendanceid() {
        return this.attendanceid;
    }
    
    public void setAttendanceid(Integer attendanceid) {
        this.attendanceid = attendanceid;
    }
    public String getEmployeeid() {
        return this.employeeid;
    }
    
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getMonthz() {
        return this.monthz;
    }
    
    public void setMonthz(String monthz) {
        this.monthz = monthz;
    }




}


