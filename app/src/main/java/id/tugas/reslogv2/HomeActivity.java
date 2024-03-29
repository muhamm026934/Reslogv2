package id.tugas.reslogv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnKeluar = findViewById(R.id.btn_Logout);
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

                //code dibawah sengaja di disable untuk menjegah re-login tanpa masukan user dan pass
                //FirebaseAuth.getInstance().signOut();
                //Intent intentToMain = new Intent(HomeActivity.this, MainActivity.class);
                //startActivity(intentToMain);
            }
        });
    }
}
