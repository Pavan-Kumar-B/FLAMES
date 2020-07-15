package com.example.flames;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    public void flames(View view)
    {int timesTableNumber=1;
        EditText editText1 =(EditText) findViewById(R.id.editTextTextPersonName1);
        EditText editText2 =(EditText) findViewById(R.id.editTextTextPersonName2);




        StringBuffer s1=new StringBuffer(editText1.getText().toString());
        StringBuffer s2=new StringBuffer(editText2.getText().toString());

        char c,d,e='\0';
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            for(int j=0;j<s2.length();j++)
            {
                d=s2.charAt(j);
                if(c==d)
                {
                    s1.deleteCharAt(i);
                    s2.deleteCharAt(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        s1=s1.append(s2);
        int k=6,l=0;
        String s3="flames";
        while(k>1)
        {
            for(int m=1;m<s1.length();m++)
            {
                if(s3.charAt(l)!='X')
                {
                    l++;
                    if(l==6)
                        l=0;
                }
                else
                {
                    l++;
                    if(l==6)
                        l=0;
                    m--;
                }
            }
            while(s3.charAt(l)=='X')
            {
                l++;
                if(l==6)
                    l=0;
            }
            s3=s3.substring(0,l)+"X"+s3.substring(l+1);
            k--;
        }

        for(int i=0;i<s3.length();i++)
        {
            if(s3.charAt(i)!='X')
                e=s3.charAt(i);
        }
        Log.i("info", "flames: "+e);

                switch(e)
                {
                    case 'f':
                        Toast.makeText(this,"FRIENDS",Toast.LENGTH_LONG).show();                        break;
                    case 'l':
                        Toast.makeText(this,"LOVE",Toast.LENGTH_LONG).show();                        break;
                    case 'a':
                        Toast.makeText(this,"AFFECTION",Toast.LENGTH_LONG).show();                        break;
                    case 'm':
                        Toast.makeText(this,"MARRIAGE",Toast.LENGTH_LONG).show();                        break;
                    case 'e':
                        Toast.makeText(this,"ENEMY",Toast.LENGTH_LONG).show();
                        break;
                    case 's':
                        Toast.makeText(this,"SIBLING",Toast.LENGTH_LONG).show();
                        break;

                }


    }
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private class Id {
    }
}