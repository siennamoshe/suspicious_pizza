package siennamosher.pizzaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ToggleButton;
public class PizzaOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_order);
        // BUTTON LOGIC
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                goToOrderComplete();
            }
        });
        //TOTAL LOGIC
        ToggleButton price_setter = (ToggleButton) findViewById(R.id.toggleButton3);

        price_setter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateOrderTotal();
            }
        });

    }
    //BUTTON FUNCTION
    private void goToOrderComplete() {
        Intent intent = new Intent(this, OrderComplete.class);
        startActivity(intent);
    }
    //TOGGLE FUNCTION (total logic)
    private void calculateOrderTotal() {
        TextView theTotal = (TextView) findViewById(R.id.textView14);
        ToggleButton price_setter = (ToggleButton) findViewById(R.id.toggleButton3);
        if(price_setter.getText().equals("LARGE")){
            theTotal.setText("$7.95");
        }
        else {
            theTotal.setText("$6.47");
        }
    }
}
