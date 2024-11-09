package com.example.m04_gui_01;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivityScreenSize extends AppCompatActivity {

    private EditText calculation, result;
    private String calc, res;
    private boolean isDotInserted, isOperatorInserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_screen_size);

        calculation = findViewById(R.id.calcInput);
        result = findViewById(R.id.result);

        calc = "";
        res = "";
        isDotInserted = false;
        isOperatorInserted = false;

        Button buttonZero = findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI ZERO BUTTON", "User tapped the 0 Button");

                calc = calc + "0";
                displayCalculation();
            }
        });

        Button buttonOne = findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI ONE BUTTON", "User tapped the 1 Button");

                calc = calc + "1";
                displayCalculation();
            }
        });

        Button buttonTwo = findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI TWO BUTTON", "User tapped the 2 Button");

                calc = calc + "2";
                displayCalculation();
            }
        });

        Button buttonThree = findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI THREE BUTTON", "User tapped the 3 Button");

                calc = calc + "3";
                displayCalculation();
            }
        });

        Button buttonFour = findViewById(R.id.buttonFour);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI FOUR BUTTON", "User tapped the 4 Button");

                calc = calc + "4";
                displayCalculation();
            }
        });

        Button buttonFive = findViewById(R.id.buttonFive);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI FIVE BUTTON", "User tapped the 5 Button");

                calc = calc + "5";
                displayCalculation();
            }
        });

        Button buttonSix = findViewById(R.id.buttonSix);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI SIX BUTTON", "User tapped the 6 Button");

                calc = calc + "6";
                displayCalculation();
            }
        });

        Button buttonSeven = findViewById(R.id.buttonSeven);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI SEVEN BUTTON", "User tapped the 7 Button");

                calc = calc + "7";
                displayCalculation();
            }
        });

        Button buttonEight = findViewById(R.id.buttonEight);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI EIGHT BUTTON", "User tapped the 8 Button");

                calc = calc + "8";
                displayCalculation();
            }
        });

        Button buttonNine = findViewById(R.id.buttonNine);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI NINE BUTTON", "User tapped the 9 Button");

                calc = calc + "9";
                displayCalculation();
            }
        });

        Button buttonDecimal = findViewById(R.id.buttonDecimal);
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI DECIMAL BUTTON", "User tapped the Decimal Button");

                if(calc.isEmpty()) {
                    calc = "0.";
                    isDotInserted = true;
                }

                if(!isDotInserted) {
                    calc = calc + ".";
                    isDotInserted = true;
                }
                displayCalculation();
            }
        });

        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI CLEAR BUTTON", "User tapped the Clear Button");

                clear();
                displayCalculation();
                displayResult();
            }
        });

        Button buttonDelete = findViewById(R.id.buttonDelete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI DELETE BUTTON", "User tapped the Delete Button");

                backspace();
                displayCalculation();
            }
        });

        ImageButton buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI DIVIDE BUTTON", "User tapped the Divide Button");

                isDotInserted = false;

                if(!calc.isEmpty()) {
                    if(calc.substring(calc.length()-1).equals(".")) {
                        backspace();
                    }
                    if(!isOperatorInserted) {
                        calc = calc + " ÷ ";
                        isOperatorInserted = true;
                    }
                }
                displayCalculation();
            }
        });

        ImageButton buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI MULTIPLY BUTTON", "User tapped the Multiply Button");

                isDotInserted = false;

                if(!calc.isEmpty()) {
                    if(calc.substring(calc.length()-1).equals(".")) {
                        backspace();
                    }
                    if(!isOperatorInserted) {
                        calc = calc + " x ";
                        isOperatorInserted = true;
                    }
                }
                displayCalculation();
            }
        });

        ImageButton buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI SUBTRACT BUTTON", "User tapped the Subtract Button");

                isDotInserted = false;

                if(!calc.isEmpty()) {
                    if(calc.substring(calc.length()-1).equals(".")) {
                        backspace();
                    }
                    if(!isOperatorInserted) {
                        calc = calc + " - ";
                        isOperatorInserted = true;
                    }
                }
                displayCalculation();
            }
        });

        ImageButton buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI ADD BUTTON", "User tapped the Add Button");

                isDotInserted = false;

                if(!calc.isEmpty()) {
                    if(calc.substring(calc.length()-1).equals(".")) {
                        backspace();
                    }
                    if(!isOperatorInserted) {
                        calc = calc + " + ";
                        isOperatorInserted = true;
                    }
                }
                displayCalculation();
            }
        });

        ImageButton buttonEquals = findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MO4_GUI EQUALS BUTTON", "User tapped the Equals Button");

                if(isOperatorInserted == true && !calc.substring(calc.length() - 1).equals(" ")) {
                    String [] tokens = calc.split(" ");

                    switch (tokens[1].charAt(0)) {
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '÷':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayResult();
                }
            }
        });

        displayCalculation();
        displayResult();
    }

    public void displayCalculation() {
        calculation.setText(calc);
    }

    public void displayResult() {
        result.setText(res);
    }

    public void clear() {
        calc = "";
        res = "";
        isDotInserted = false;
        isOperatorInserted = false;
    }

    public void backspace() {
        if(!calc.isEmpty()) {
            if(calc.substring(calc.length()-1).equals(".")) {
                isDotInserted = false;
            }
            if(calc.substring(calc.length()-1).equals(" ")) {
                calc = calc.substring(0, calc.length()-3);
                isOperatorInserted = false;
            } else {
                calc = calc.substring(0, calc.length()-1);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_screen_size, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void getMyVersion(View view) {

        // Get version data
        String versionNum = Integer.toString(Build.VERSION.SDK_INT);
        Boolean afterKitKat = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT);

        // Put it on the screen
        TextView t = findViewById(R.id.textView);
        t.setText(" Version Number is " + versionNum);
        t.append("\n afterKitKat = " + afterKitKat);
        t.append("\n Build.VERSION.RELEASE = " + Build.VERSION.RELEASE);
        t.append("\n Build.VERSION.INCREMENTAL = " + Build.VERSION.INCREMENTAL);

        // dump build and display metrics
        t.append("\n Build.DISPLAY = " + Build.DISPLAY);
        t.append("\n Screen Size = " + getSizeName(view.getContext()));
        t.append("\n getDisplayMetrics().densityDpi = " + getResources().getDisplayMetrics().densityDpi);
        t.append("\n getDisplayMetrics().density = " + getResources().getDisplayMetrics().density);
        t.append("\n getDisplayMetrics().xdpi = " + getResources().getDisplayMetrics().xdpi);
        t.append("\n getDisplayMetrics().ydpi = " + getResources().getDisplayMetrics().ydpi);
        t.append("\n getDisplayMetrics().heightPixels = " + getResources().getDisplayMetrics().heightPixels);
        t.append("\n getDisplayMetrics().widthPixels = " + getResources().getDisplayMetrics().widthPixels);

        // show what the masks look like for layout size
        t.append("\n\n screenLayout (HEX) = " + (Integer.toHexString(view.getContext().getResources().getConfiguration().screenLayout)));
        t.append("\n SCREENLAYOUT_SIZE_MASK (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_MASK)));
        t.append("\n SCREENLAYOUT_LONG_MASK  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_MASK)));
        t.append("\n SCREENLAYOUT_SIZE_SMALL (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_SMALL)));
        t.append("\n SCREENLAYOUT_SIZE_NORMAL (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_NORMAL)));
        t.append("\n SCREENLAYOUT_SIZE_LARGE (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_SIZE_LARGE)));

        // Get the layout and mask with size
        int screenLayout = view.getContext().getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;
        t.append("\n screenLayout & size mask (HEX) = " + (Integer.toHexString((screenLayout))));

        // Get the layout (again) and mask with long bit of layout
        t.append("\n\n SCREENLAYOUT_LONG_MASK  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_MASK)));
        t.append("\n SCREENLAYOUT_LONG_NO  (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_NO)));
        t.append("\n SCREENLAYOUT_LONG_UNDEFINED   (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_UNDEFINED)));
        t.append("\n  SCREENLAYOUT_LONG_YES   (HEX) = " + (Integer.toHexString(Configuration.SCREENLAYOUT_LONG_YES)));

        // Now get the layout (again) and mask with size
        screenLayout = view.getContext().getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_LONG_MASK;
        t.append("\n screenLayout & long mask (HEX) = " + (Integer.toHexString((screenLayout))));

    }


    // Use bitmasks to determine screen size
    private static String getSizeName(Context context) {
        int screenLayout = context.getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;

        switch (screenLayout) {
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                return "small";
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                return "normal";
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                return "large";
            case 4: // Configuration.SCREENLAYOUT_SIZE_XLARGE is API >= 9
                return "xlarge";
            default:
                return "undefined";
        }
    }


}
