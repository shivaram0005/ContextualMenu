package com.example.contextualmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActionMode(callback);

            }
        });
    }
    ActionMode.Callback callback=new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            MenuInflater menuInflater=actionMode.getMenuInflater();
            menuInflater.inflate(R.menu.menumain,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.item1:
                        Toast.makeText(MainActivity.this, "Selected"+menuItem.toString(), Toast.LENGTH_SHORT).show();
                    case R.id.item2:
                        Toast.makeText(MainActivity.this, "Selected" + menuItem.toString(), Toast.LENGTH_SHORT).show();
                    case R.id.item3:
                        Toast.makeText(MainActivity.this, "Selected"+ menuItem.toString(), Toast.LENGTH_SHORT).show();
                }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    };


}