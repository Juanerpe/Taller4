/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;


import java.lang.reflect.Array;
import java.util.List;

/**
 *
 * @author juane
 */
public class Order {
    
    
  private int arrayLength;  
  int[]  realNumbers;
  private int randomNumber;

    /**
     * @return the arrayLength
     */
    public int getArrayLength() {
        return arrayLength;
    }

    /**
     * @param arrayLength the arrayLength to set
     */
    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    /**
     * @return the realNumbers
     */
    public int[] getRealNumbers() {
        return realNumbers;
    }

    /**
     * @param realNumbers the realNumbers to set
     */
    public void setRealNumbers(int[] realNumbers) {
        this.realNumbers = realNumbers;
    }

    /**
     * @return the randomNumber
     */
    public int getRandomNumber() {
        return randomNumber;
    }

    /**
     * @param randomNumber the randomNumber to set
     */
    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
 
  
    /**
     *
     * @return
     */
    public  int [] buildArray(){
        setArrayLength((int) Math.random());
     
    
       int[] realNumbers = new int[getArrayLength()];
       int counter = 0;
       
               
      do{  
        realNumbers[counter]=randomNumber=(int)Math.random();
        counter = counter+1;
      }
        while(counter+1 ==getArrayLength());
       
       
         return realNumbers;
     } 
    
    public  int[] bubbleMethod(int[] realNumbers)
    {
     
        
      int auxiliar;
      int[] bubbleOrder;
      for(int i = 2; i < realNumbers.length; i++)
      {
        for(int j = 0;j < realNumbers.length-i;j++)
        {
          if(realNumbers[j] > realNumbers[j+1])
          {
            auxiliar = realNumbers[j];
            realNumbers[j] = realNumbers[j+1];
            realNumbers[j+1] = auxiliar;
          }   
        }
      }
      bubbleOrder = realNumbers;
      return bubbleOrder;
    }
      
    
    public  void quickSort(int[] realNumbers,int low,int high){
        buildArray();
        
        
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
     
        temp = realNumbers[low];
 
        while (i<j) {
                        
            while (temp<=realNumbers[j]&&i<j) {
                j--;
            }
                         
            while (temp>=realNumbers[i]&&i<j) {
                i++;
            }
                         
            if (i<j) {
                t = realNumbers[j];
                realNumbers[j] = realNumbers[i];
                realNumbers[i] = t;
            }
 
        }
                
         realNumbers[low] = realNumbers[i];
         realNumbers[i] = temp;
                 
        quickSort(realNumbers, low, j-1);
                 
        quickSort(realNumbers, j+1, high);
        
    
    }
 

    }

    
    

