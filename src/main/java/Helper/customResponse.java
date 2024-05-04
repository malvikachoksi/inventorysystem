package Helper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class customResponse {
     public String status;
    public String message;
    public boolean success;
    public Object data; // Change Object to the type you are using for your data

    public customResponse(String status, String message, boolean success, Object data) {
        this.status = status;
        this.message = message;
        this.success = success;
        this.data = data;
        
    }
    
    
}
