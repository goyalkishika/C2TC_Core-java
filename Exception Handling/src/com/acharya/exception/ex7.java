package com.acharya.exception;

import java.util.*;
public class MyClass 
{
    public static void main(String args[])
 {
      int x=10;
      int y=0;
      try
      {
        int z=x/y;
      }
      catch(Exception e)
      {
          System.out.print(e);
      }
   }
}



