package com.blog.testfrida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.blog.testfrida.complexobjects.ScopeObject;
import com.blog.testfrida.examples.ArrayTypes;
import com.blog.testfrida.examples.BasicTypes;
import com.blog.testfrida.inheritance.SubClass;
import com.blog.testfrida.innerclasses.AnonymousInnerClass;
import com.blog.testfrida.innerclasses.OuterClass;
import com.blog.testfrida.interfaces.MyInterface;
import com.blog.testfrida.interfaces.MyInterfaceClass;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView results = findViewById(R.id.txtView);
        final Button button = findViewById(R.id.btnSum);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                BasicTypes.addTwoInts(10,10);

                byte val1=10, val2=10;
                BasicTypes.addTwoBytes(val1, val2);

                short val3=10, val4=10;
                BasicTypes.addTwoShorts(val3,val4);

                long val5=10, val6=10;
                BasicTypes.addTwoLongs(val5,val6);
            }
        });

        final Button btnBoolean = findViewById(R.id.btnBoolean);
        btnBoolean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String values = Boolean.toString(BasicTypes.negate(true));
                values = values + "\n" + Boolean.toString(BasicTypes.negate(false));
                results.setText(values);
            }
        });


        final Button btnFloating = findViewById(R.id.btnFloatingPoints);
        btnFloating.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                System.out.println(BasicTypes.divideFloat(23,3));
                System.out.println(BasicTypes.divideFloat((float) 0.1234567890123,1));
                System.out.println(BasicTypes.divideDouble(2,5));
                System.out.println(BasicTypes.divideDouble((float) 0.1234567890123,1));

                String values = String.valueOf(BasicTypes.divideFloat(23,3));
                values = values + "\n" + String.valueOf(BasicTypes.divideFloat((float) 0.1234567890123,1));
                values = values + "\n" + String.valueOf(BasicTypes.divideDouble(2,5));
                values = values + "\n" + String.valueOf(BasicTypes.divideDouble((float) 0.1234567890123,1));

                results.setText(values);
            }
        });

        final Button btnChar = findViewById(R.id.btnChar);
        btnChar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String values = String.valueOf(BasicTypes.getNextChar('h'));
                values = values + "\n" + String.valueOf(BasicTypes.isCChar('f'));
                values = values + "\n" + String.valueOf(BasicTypes.isCChar('c'));

                results.setText(values);
            }
        });

        final Button btnString = findViewById(R.id.btnString);
        btnString.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                String values = BasicTypes.concatString("test ","string");
                values = values + "\n" + BasicTypes.concat("test ", 2,"strings");
                values = values + "\n" + BasicTypes.compareToString("hex");
                values = values + "\n" + BasicTypes.compareToString("hex2");
                results.setText(values);
            }
        });

        final Button btnTestArray = findViewById(R.id.btnTestArray);
        btnTestArray.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                int[] intArray = new int[3];
                intArray[0] = 1;
                intArray[1] = 2;
                intArray[2] = 1;

                String values = Integer.toString(ArrayTypes.sumArray(intArray));


                double[] doubleArray = new double[3];
                doubleArray[0] = 1.1;
                doubleArray[1] = 2.2;
                doubleArray[2] = 4.3;
                values = values + "\n" + Double.toString(ArrayTypes.sumArray(doubleArray));
                values = values + "\n" + Arrays.toString(ArrayTypes.returnIntArray());
                values = values + "\n" + Arrays.toString(ArrayTypes.returnDoubleArray());
                results.setText(values);
            }
        });

        final Button btnConstructor = findViewById(R.id.btnConstructor);
        btnConstructor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            SubClass subClass = new SubClass();
            String values = "Supervalue: "+ Integer.toString(subClass.getSuperValue());
            values = values + "\n" + "Setvalue: "+ Integer.toString(subClass.getSetValue());
            values = values + "\n" + "Subvalue: "+ Integer.toString(subClass.getSubValue());
            results.setText(values);
            }
        });

        final Button btnThisParameter = findViewById(R.id.btnThisParameter);
        btnThisParameter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ScopeObject.testThisStaticParameter();
                ScopeObject scope = new ScopeObject();
                scope.testThisParameter();
            }
        });

        final Button btnMyInterface = findViewById(R.id.btnMyInterface);
        btnMyInterface.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                MyInterface myInterface = MyInterfaceClass.getNewInstance();
                myInterface.getMessage();
            }
        });

        final Button btnInnerClass = findViewById(R.id.btnInnerClass);
        btnInnerClass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                OuterClass outer = new OuterClass();
                char value = outer.callInnerClass();
                String values = "InnerValue: "+ value;

                AnonymousInnerClass anonymous = new AnonymousInnerClass();
                values = " getMsg: "+ anonymous.getMessageAnonymous();
                results.setText(values);

            }
        });
    }



}
